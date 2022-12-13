public class Tree {
    private boolean air;
    private final Sun sun;

    public Tree(Sun sun) {
        this.sun = sun;
    }

    private void setAir(){
        air = this.sun.getLight();
    }

    public boolean getAir(){
        return air;
    }

    public void step() {
        this.setAir();
    }
}
