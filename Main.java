import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {


        BiFunction<Integer, Integer, Integer> addition =
                (a, b) -> a + b;

        BiFunction<Integer, Integer, Integer> subtraction =
                (a, b) -> a - b;

        BiFunction<Integer, Integer, Integer> multiplication =
                (a, b) -> a * b;

        BiFunction<Integer, Integer, Integer> division =
                (a, b) -> a / b;

        int num1 = 10;
        int num2 = 5;


        System.out.println("Addition: 10 + 5 = " +
                FunctionalCalculator.calculate(num1, num2, addition));

        System.out.println("Subtraction: 10 - 5 = " +
                FunctionalCalculator.calculate(num1, num2, subtraction));

        System.out.println("Multiplication: 10 * 5 = " +
                FunctionalCalculator.calculate(num1, num2, multiplication));

        System.out.println("Division: 10 / 5 = " +
                FunctionalCalculator.calculate(num1, num2, division));
    }
}
