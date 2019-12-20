public class MyFirstGame {
	
	public static void main(String[] args) {
		int number = 77;
		int userNumber = 75;

		while(userNumber != number) {				
			if(userNumber < number) {
				System.out.println("Введенное Вами число меньше того, что загадал компьютер.");
				userNumber += 4;
			} else {
				System.out.println("Введенное Вами число больше того, что загадал компьютер.");
				userNumber -= 2;
			}
		}

		System.out.println("Вы угадали!");
	}
}