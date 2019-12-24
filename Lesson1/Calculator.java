public class Calculator {
	
	public static void main(String[] args) {
		int firstNumber = 50, secondNumber = 3;
		int result = 0;
		char mathOperation = '^';

		if(mathOperation == '+') {
			result = firstNumber + secondNumber;
		} else if(mathOperation == '-') {
			result = firstNumber - secondNumber;
		} else if(mathOperation == '*') {
			result = firstNumber * secondNumber;
		} else if(mathOperation == '/') {
			result = firstNumber / secondNumber;
		} else if(mathOperation == '^') {
			result = 1;
			for(int i = 0; i < secondNumber; i++) {
				result *= firstNumber;
			}
		} else if(mathOperation == '%') {
			result = firstNumber % secondNumber;
		}
		System.out.println(result);
	}
}