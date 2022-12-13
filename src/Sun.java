public class Sun {
    private boolean light;
    private final Time time;

    public Sun(Time time) {
        this.time = time;
    }

    private void setLight() {
        light = this.time.isDay();
    }

    public boolean getLight() {
        return light;
    }

    public void step() {
        setLight();
    }
}
