package system.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Vacation {

    public enum Status{REQUESTED, APPROVED, NA, REJECTED}

    private GregorianCalendar from = new GregorianCalendar();
    private GregorianCalendar to = new GregorianCalendar();
    private Status status;

    public Vacation() {
        status = Status.NA;
    }

    public Vacation(String fromDate, String toDate, Status status) throws Exception {
        setCalToString(from, fromDate);
        setCalToString(to, toDate);
        this.status = status;
    }

    public String getFrom() {
       return convertCalendarToString(from);
    }


    public void setFrom(String date) throws Exception {
        setCalToString(from, date);
        GregorianCalendar gc = new GregorianCalendar();
    }

    public String getTo() {
        return convertCalendarToString(to);
    }

    public void setTo(String date) throws Exception {
        setCalToString(to, date);
    }

    private void setCalToString(GregorianCalendar cal, String date) throws Exception {
        String[] part = date.split("/");
        if (part.length != 3){
            throw new Exception("Wrong date format in Vacation.setFrom()");
        }

        cal.set(Calendar.MONTH, Integer.parseInt(part[0]));
        cal.set(Calendar.DATE, Integer.parseInt(part[1]));
        cal.set(Calendar.YEAR, Integer.parseInt(part[2]));
    }

    private String convertCalendarToString(GregorianCalendar cal) {
        String month = String.valueOf(cal.get(GregorianCalendar.MONTH));
        String date = String.valueOf(cal.get(GregorianCalendar.DATE));
        String year = String.valueOf(cal.get(GregorianCalendar.YEAR));
        return month +'/'+ date +'/'+ year;
    }


    public Status getStatus() {
        return status;
    }

    public void reject(){status = Status.REJECTED;}

    public void request(){status = Status.REQUESTED;}

    public void approve(){status = Status.APPROVED;}

    @Override
    public String toString() {
        if(status == Status.NA){
            return "NA";
        }
        String f = from.get(Calendar.MONTH)+"/"+from.get(Calendar.DATE) + "/" + from.get(Calendar.YEAR);
        String t = to.get(Calendar.MONTH) +"/"+to.get(Calendar.DATE)+"/"+to.get(Calendar.YEAR);
        return status + " from "+ f + ", to " + t;
    }

}
