package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class Engine {
    public static void run(String gameName, Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        var name = scanner.next();
        System.out.println("Hello, " + name + "!");
        if (gameName.equals("Greet")) {
            return;
        }

        switch (gameName) {
            case "Even":
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                break;
            case "Calc":
                System.out.println("What is the result of the expression?");
                break;
            case "GCD":
                System.out.println("Find the greatest common divisor of given numbers.");
                break;
            case "Progression":
                System.out.println("What number is missing in the progression?");
                break;
            case "Prime":
                System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                break;
            default:
                break;
        }

        for (int i = 0; i < 3; i++) {
            String question = "";
            String correctAnswer = "";

            switch (gameName) {
                case "Even":
                    int number = Even.generateNumber();
                    question = Even.generateQuestion(number);
                    correctAnswer = Even.getCorrectAnswer(number);
                    break;
                case "Calc":
                    question = Calc.generateExpression();
                    String[] items = question.split(" ");
                    int number1 = Integer.parseInt(items[0]);
                    int number2 = Integer.parseInt(items[2]);
                    String operation = items[1];
                    correctAnswer = Calc.getCorrectAnswer(number1, number2, operation);
                    break;
                case "GCD":
                    question = GCD.generateQuestion();
                    String[] numbers = question.split(" ");
                    int n1 = Integer.parseInt(numbers[0]);
                    int n2 = Integer.parseInt(numbers[1]);
                    correctAnswer = GCD.getCorrectAnswer(n1, n2);
                    break;
                case "Progression":
                    int[] progression = Progression.generateProgressing();
                    int index = Progression.generateIndex(progression.length);
                    question = Progression.generateQuestion(progression, index);
                    correctAnswer = progression[index] + "";
                    break;
                case "Prime":
                    question = Prime.generateQuestion();
                    correctAnswer = Prime.getCorrectAnswer(Integer.parseInt(question));
                    break;
                default:
                    return;
            }

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            var answer = scanner.next();

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + name + "!");
    }
}
