package hexlet.code.games;

import java.util.Random;

public class Even {
    private static final int MAX_START = 100;

    public static int generateNumber() {
        return (new Random()).nextInt(MAX_START);
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
