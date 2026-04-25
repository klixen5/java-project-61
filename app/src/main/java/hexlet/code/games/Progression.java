package hexlet.code.games;

import java.util.Random;

public class Progression {
    public static int[] generateProgressing() {
        var random = new Random();
        int start = random.nextInt(100);
        int step = random.nextInt(10) + 1;
        int length = random.nextInt(6) + 5;
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
