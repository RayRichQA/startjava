public class Calculator {
	
	public static void main(String[] args) {
		int a = 50, b = 3;
		int result = 0;
		char mathOperation = '^';

		if(mathOperation == '+') {
			result = a + b;
		} else if(mathOperation == '-') {
			result = a - b;
		} else if(mathOperation == '*') {
			result = a * b;
		} else if(mathOperation == '/') {
			result = a / b;
		} else if(mathOperation == '^') {
			result = a;
			for(int i = 1; i < b; i++) {
				result *= a;
			}
		} else if(mathOperation == '%') {
			result = a % b;
		} else {
			System.out.println("You've entered the wrong symbol.");
		}
		System.out.println(result);
	}
}