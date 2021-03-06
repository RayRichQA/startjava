public class Cycle {
	
	public static void main(String[] args) {
		for(int i = 0; i <= 20; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		int i = 6;
		while(i >= -6) {
			System.out.print(i + " ");
			i -= 2;
		}
		System.out.println();

		int number = 10;
		int sum = 0;
		do {
			if(number % 2 != 0) {
				sum += number;
			}
			number++;
		} while(number < 21);
		System.out.println("Summary of odd digits = " + sum);
	}
}