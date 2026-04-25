package hexlet.code;

import java.util.Scanner;

public class App {
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number) {
            case GREET:
                Engine.run("Greet", scanner);
                break;
            case EVEN:
                Engine.run("Even", scanner);
                break;
            case CALC:
                Engine.run("Calc", scanner);
                break;
            case GCD:
                Engine.run("GCD", scanner);
                break;
            case PROGRESSION:
                Engine.run("Progression", scanner);
                break;
            case PRIME:
                Engine.run("Prime", scanner);
                break;
            default:
                break;
        }
    }
}
