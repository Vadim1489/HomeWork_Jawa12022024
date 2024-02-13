import java.util.Random;

public class ArithmeticOperations {
    Random random = new Random();
    int number1;
    int number2;
    public void getRandomNumbers() {
        number1 = random.nextInt(1,10);
        number2 = random.nextInt(1,5);
    }
    public int   addition () {
        System.out.print(number1 + " + " + number2 + " = ");
        return  number1 + number2;
    }

    public int   subtraction () {
        System.out.print(number1 + " - " + number2 + " = ");
        return number1 - number2;
    }
    public int   multiply() {
        System.out.print(number1 + " * " + number2 + " = ");
        return number1 * number2;
    }

    public int   division() {
        System.out.print(number1 + " / " + number2 + " = ");
        return number1 / number2;
    }

}
