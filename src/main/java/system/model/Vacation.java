package system.model;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class Vacation {

    public enum Status{REQUESTED, APPROVED, NA}

    private GregorianCalendar from;
    private GregorianCalendar to;
    private Status status;

    public Vacation() {
        status = Status.NA;
    }

    public Vacation(GregorianCalendar from, GregorianCalendar to, Status status) {
        this.from = from;
        this.to = to;
        this.status = status;
    }

    public GregorianCalendar getFrom() {
        return from;
    }

    public void setFrom(GregorianCalendar from) {
        this.from = from;
    }

    public GregorianCalendar getTo() {
        return to;
    }

    public void setTo(GregorianCalendar to) {
        this.to = to;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        if(status == Status.NA){
            return "NA";
        }
        String f = from.get(Calendar.YEAR) +"."+from.get(Calendar.MONTH)+"."+from.get(Calendar.DATE);
        String t = to.get(Calendar.YEAR) +"."+to.get(Calendar.MONTH)+"."+to.get(Calendar.DATE);
        return "from:"+ f + " to:" + t + " status:" + status;
    }

    public static void main(String[] args) {
        Vacation v = new Vacation(new GregorianCalendar(2018, 1, 30), new GregorianCalendar(2018, 2, 24), Status.REQUESTED);
        System.out.println(v);
    }
}
