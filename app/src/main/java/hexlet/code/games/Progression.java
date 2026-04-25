package hexlet.code.games;

import java.util.Random;

public class Progression {
    private static final int MAX_START = 100;
    private static final int MAX_STEP = 10;
    private static final int MAX_LENGTH_BOUNDS = 6;
    private static final int MIN_LENGTH = 5;

    public static int[] generateProgressing() {
        var random = new Random();
        int start = random.nextInt(MAX_START);
        int step = random.nextInt(MAX_STEP) + 1;
        int length = random.nextInt(MAX_LENGTH_BOUNDS) + MIN_LENGTH;
        int[] progressing = new int[length];

        for (int i = 0; i < length; i++) {
            progressing[i] = start + i * step;
        }

        return progressing;
    }

    public static String generateQuestion(int[] progression, int index) {
        var result = new StringBuilder();
        for (int i = 0; i < progression.length; i++) {
            if (i == index) {
                result.append("..");
            } else {
                result.append(progression[i]);
            }
            if (i != progression.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static int generateIndex(int length) {
        return (new Random()).nextInt(length);
    }
}
