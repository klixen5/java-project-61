package hexlet.code.games;

import java.util.Random;

public class Calc {
    public static String generateExpression() {
        var random = new Random();
        var operations = new String[] {"+", "-", "*"};
        var number1 = String.valueOf(random.nextInt(100));
        var number2 = String.valueOf(random.nextInt(100));
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
