package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String startApp() {
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        scanner.close();
        return name;
    }
}
