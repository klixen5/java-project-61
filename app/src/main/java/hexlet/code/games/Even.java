package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static int generateNumber() {
        return (new Random()).nextInt(100);
    }

    public static String generateQuestion(int number) {
        return String.valueOf(number);
    }

    public static String getCorrectAnswer(int number) {
        if (number % 2 == 0) {
            return "yes";
        }

        return "no";
    }
}
