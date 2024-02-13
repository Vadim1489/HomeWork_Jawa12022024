
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
    Points points = new Points();
    int operationRandom = 0;
    String comand = "";
    int result = 0;
    int question = 0;


        System.out.println("Здравствуйте, сейчас мы проведём не большой опросник ариф. операций: ");

        while (!comand.equals("exit")) {
            arithmeticOperations.getRandomNumbers();
            operationRandom = random.nextInt(4) +1;

            switch (operationRandom) {
                case 1:
                    result = arithmeticOperations.addition();
                    break;
                case 2:
                    result = arithmeticOperations.subtraction();
                    break;
                case 3:
                    result = arithmeticOperations.multiply();
                    break;
                case 4:
                    result = arithmeticOperations.division();
                    break;
            }

            System.out.print("Введите ваш ответ или 'exit' для завершения: ");
            if (scanner.hasNextInt()) {
                question = scanner.nextInt();
                if (!comand.equals("exit")) {
                    checkingOffTheResult(points, result, question);
                }
            } else {
                comand = scanner.next();
            }
        }

        System.out.println("Ура! Опросник завершён! Ваш финальный счёт: " + points.pointsTotal());
        scanner.close();
    }

    public static void checkingOffTheResult(Points points, int result, int question) {
        System.out.println("Ваш ответ: " + question + ". Правильный ответ: " + result);
        if (question == result) {
            points.pointsAdding();
        } else {
            points.pointsDeducting();
        }
    }
}
