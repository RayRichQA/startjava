import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String userAnswer;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите первое число: ");
            int firstNumber = scanner.nextInt();
            System.out.println("Введите знак математической операции: ");
            char mathOperation = scanner.next().charAt(0);
            System.out.println("Введите второе число: ");
            int secondNumber = scanner.nextInt();
            Calculator calculator = new Calculator();
            System.out.println("Результат = " + calculator.getResult(firstNumber, secondNumber, mathOperation));
            do {
                System.out.println("Хотите продолжить?");
                userAnswer = scanner.next();
            } while (!userAnswer.equals("Да") && !userAnswer.equals("Нет"));
        } while(userAnswer.equals("Да"));
        scanner.close();
    }
}