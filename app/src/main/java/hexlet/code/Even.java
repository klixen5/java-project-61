package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void play() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        var scanner = new Scanner(System.in);
        var name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        var random = new Random();
        var trueAnswer = 0;
        while (true) {
            var number = random.nextInt(100);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            var answer = scanner.next();

            if (answer.equals("yes")) {
                if (number % 2 == 0) {
                    System.out.println("Correct!");
                    trueAnswer += 1;
                    if (trueAnswer == 3) {
                        System.out.println("Congratulations, " + name + "!");
                        return;
                    }
                } else {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + name + "!");
                    return;
                }
            } else if (answer.equals("no")) {
                if (number % 2 != 0) {
                    System.out.println("Correct!");
                    trueAnswer += 1;
                    if (trueAnswer == 3) {
                        System.out.println("Congratulations, " + name + "!");
                        return;
                    }
                } else {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + name + "!");
                    return;
                }
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
    }
}
