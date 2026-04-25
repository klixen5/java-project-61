package hexlet.code.games;

import java.util.Random;

public class GCD {
    private static final int MAX_START = 100;

    public static String generateQuestion() {
        var random = new Random();
        var number1 = random.nextInt(MAX_START);
        var number2 = random.nextInt(MAX_START);
        return number1 + " " + number2;
    }

    public static String getCorrectAnswer(int number1, int number2) {
        while (number2 != 0) {
            var temp = number1;
            number1 = number2;
            number2 = temp % number2;
        }

        return String.valueOf(number1);
    }
}
