import java.util.Scanner;

public class Frog {
    private boolean awake;
    private final Sun sun;
    private final Grass grass;

    public Frog(Sun sun, Grass grass) {
        this.sun = sun;
        this.grass = grass;
    }

    private void setAwake() {
        this.awake = true;
    }

    private void setSleep() {
        this.awake = false;
    }


    private boolean status() {
        return this.awake;
    }

    private void breathing() {
        if (this.awake) {
            System.out.println("Frog is breathing");
        }
    }

    private void move() {
        Scanner scanner = new Scanner(System.in);

        boolean moveBool = true;

        while (moveBool) {
            System.out.println("Choose where to move: ");
            System.out.println("1. Up");
            System.out.println("2. Left");
            System.out.println("3. Down");
            System.out.println("4. Right");
            System.out.println("5. End moving");
            System.out.println("Input direction");

            int moveDirection = scanner.nextInt();

            switch (moveDirection) {
                case 1 -> System.out.println("Frog moved Up");
                case 2 -> System.out.println("Frog moved Left");
                case 3 -> System.out.println("Frog moved Down");
                case 4 -> System.out.println("Frog moved Right");
                case 5 -> {
                    System.out.println("Frog stays on the same position");
                    moveBool = false;
                }
                default -> System.out.println("Frog stays on the same position");
            }
        }
    }

    private void info() {
        if (awake) {
            System.out.println("Frog is awake");
        } else {
            System.out.println("Frog is sleeping");
        }
    }

    private void eat() {
        if (!this.awake) {
            return;
        }

        System.out.println("Frog eats grass...");
        grass.dwindling(20);

    }


    public void step() {
        if (sun.getLight()) {
            this.setAwake();
        } else {
            this.setSleep();
        }
        this.info();
        if (this.status()) {
            this.breathing();
            this.eat();

            boolean moveBool = true;
            while (moveBool) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Do you want to move frog?");
                System.out.println("Yes: 1");
                System.out.println("No: 2");

                switch (scanner.nextInt()) {
                    case 1 -> this.move();
                    case 2 -> {
                        System.out.println("Frog stays on the same position");
                        moveBool = false;
                    }
                }
            }
        }
    }
}
