package system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import system.model.User;
import system.service.LoginService;

@Controller
@RequestMapping("")
public class LoginController {

    @Autowired
    private LoginService service;


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userToAuth", new User());
        modelAndView.setViewName("login_page");
        return modelAndView;
    }

    @RequestMapping(value = "/checkUser", method = RequestMethod.POST)
    public @ResponseBody User checkUser(@ModelAttribute("userFromLoginPage") User user){
        return user;
    }
}
