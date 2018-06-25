package system.controller;

public class VactaionDates {
    private int userId;
    private String from;
    private String to;

    public VactaionDates() {
    }

    public VactaionDates(int userId, String from, String to) {
        this.userId = userId;
        this.from = from;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "VactaionDates{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
