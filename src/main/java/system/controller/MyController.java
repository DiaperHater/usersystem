package system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import system.model.AuthCredentials;
import system.model.User;
import system.model.Vacation;
import system.service.SystemService;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
@RequestMapping("")
public class MyController {

    @Autowired
    private SystemService systemService;
    private User currentUser = new User();


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("authCredentials", new AuthCredentials());
        modelAndView.setViewName("login_page");

        return modelAndView;
    }

    @RequestMapping(value = "/checkUser", method = RequestMethod.POST)
    public ModelAndView checkUser(@ModelAttribute("authCredentials") AuthCredentials creds){

        User user = systemService.getUserWithCredentials(creds);

        ModelAndView modelAndView = new ModelAndView();
        if (user == null){
            modelAndView.addObject("msg", "login failed");
            modelAndView.setViewName("login_page");
            return modelAndView;
        }
        currentUser = user;

        switch (user.getAccessLevel()){
            case 1:
                modelAndView.addObject("user", currentUser);
                modelAndView.setViewName("accessor_home_page");
                return modelAndView;

            default:
                throw new RuntimeException("Invalid user.accessLevel field value="+user.getAccessLevel());

        }

    }

    @RequestMapping(value = "/vacationRequest", method = RequestMethod.POST)
    public ModelAndView vacationRequest(@ModelAttribute("user") User user){
        ModelAndView modelAndView = new ModelAndView();

        VactaionDates vactaionDates = new VactaionDates();
        vactaionDates.setUserId(currentUser.getId());
        modelAndView.addObject("vacationDates", vactaionDates);

        modelAndView.setViewName("accessor_vacation_request_page");
        return modelAndView;
    }

    @RequestMapping(value = "/submitVacationRequest", method = RequestMethod.POST)
    public ModelAndView
    submitVacationRequest(@ModelAttribute("vacationDates")VactaionDates dates){
        try {
            currentUser.getVacation().setFrom(dates.getFrom());
            currentUser.getVacation().setTo(dates.getTo());
            currentUser.getVacation().request();
            systemService.saveUser(currentUser);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", currentUser);
        modelAndView.setViewName("accessor_home_page");
        return modelAndView;
    }


}
