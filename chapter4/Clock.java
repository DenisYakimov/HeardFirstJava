public class Clock {
    private String time;

    void setTime(String time) {
        this.time = time;
    }
    String getTime() {
        return time;
    }
}
class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();

        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("время: " + tod);
    }
}
