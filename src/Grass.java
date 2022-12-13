public class Grass {
    private int amount = 100;

    public void dwindling(int ate) {
        this.amount -= ate;
    }

    public void add() {
        this.amount += 25;
    }

}