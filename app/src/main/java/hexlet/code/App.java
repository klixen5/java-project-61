package hexlet.code;

import java.util.Scanner;

public class App {
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
            case 1:
                Engine.run("Greet", scanner);
                break;
            case 2:
                Engine.run("Even", scanner);
                break;
            case 3:
                Engine.run("Calc", scanner);
                break;
            case 4:
                Engine.run("GCD", scanner);
                break;
            case 5:
                Engine.run("Progression", scanner);
                break;
            case 6:
                Engine.run("Prime", scanner);
                break;
            default:
                break;
        }
    }
}
