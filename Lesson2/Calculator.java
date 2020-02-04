public class Calculator {

    public double getResult(int firstNumber, int secondNumber, int mathOperation) {
        int result = 0;
        switch (mathOperation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            case '^':
                result = 1;
                for (int i = 0; i < secondNumber; i++) {
                    result *= firstNumber;
                }
                return result;
            case '%':
                result = firstNumber % secondNumber;
                break;
        }
        return result;
    }
}