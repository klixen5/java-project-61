package hexlet.code.games;

import java.util.Random;

public class Prime {
    public static boolean isPrime(int number) {
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static String generateQuestion() {
        return ((new Random()).nextInt(100) + 2) + "";
    }

    public static String getCorrectAnswer(int number) {
        if (isPrime(number)) {
            return "yes";
        }

        return "no";
    }
}
