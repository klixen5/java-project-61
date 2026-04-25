package hexlet.code.games;

import java.util.Random;

public class Calc {
    private static final int MAX_START = 100;

    public static String generateExpression() {
        var random = new Random();
        var operations = new String[] {"+", "-", "*"};
        var number1 = String.valueOf(random.nextInt(MAX_START));
        var number2 = String.valueOf(random.nextInt(MAX_START));
        var operation = operations[random.nextInt(operations.length)];
        return number1 + " " + operation + " " + number2;
    }

    public static String getCorrectAnswer(int number1, int number2, String operation) {
        int result = 0;
        switch (operation) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            default:
                break;
        }

        return String.valueOf(result);
    }
}
