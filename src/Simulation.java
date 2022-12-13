import java.util.Scanner;

public class Simulation {
    Time time = new Time();
    Sun sun = new Sun(time);
    Tree tree = new Tree(sun);
    Grass grass = new Grass();
    Frog frog = new Frog(sun, grass);


    public static void main(String[] args) {
        (new Simulation()).run();
    }

    private void run() {
        System.out.println("World is created!!!");
        System.out.println("One year in this world is 6 months.");
        System.out.println("One month in this world is 2 weeks.");
        System.out.println("One week in this world is 3 days.");
        System.out.println("One day in this world is 12 hours, 3 hours night, 6 hours day than 3 hours night.");


        boolean simulate = true;

        while (simulate) {
            System.out.println("Choose what to do: ");
            System.out.println("Simulate Hours: 1");
            System.out.println("Exit: 2");
            System.out.print("Enter your choose: ");

            Scanner scanner = new Scanner(System.in);

            int chose = scanner.nextInt();
            switch (chose) {
                case 1 -> {
                    System.out.println("Choose what amount to simulate: ");
                    System.out.println("Write amount of Hours to simulate: ");
                    hour(scanner.nextInt());
                }
                case 2 -> simulate = false;
            }
        }
    }

    private void hour(int simulateTime) {
        for (int i = 0; i < simulateTime; i++) {
            time.getTime();
            sun.step();
            tree.step();
            frog.step();
            grass.add();
            time.flow();
        }
    }


}