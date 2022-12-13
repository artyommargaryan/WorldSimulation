public class Time {
    private int hour = 0;
    private int day = 1;

    public boolean isDay() {
        return this.hour >= 3 && this.hour <= 8;
    }

    public void getTime() {
        System.out.println("Day: " + day + ", Hour: " + hour);
    }

    public void flow() {
        hour++;
        if (hour >= 12) {
            hour -= 12;
            day++;
        }
    }
}
