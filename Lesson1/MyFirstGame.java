public class MyFirstGame {
	
	public static void main(String[] args) {
		int computerNumber = 77;
		int userNumber = 75;

		while(userNumber != computerNumber) {				
			if(userNumber < computerNumber) {
				System.out.println("Введенное Вами число = " + userNumber + " меньше того, что загадал компьютер.");
				userNumber += 4;
			} if(userNumber > computerNumber) {
				System.out.println("Введенное Вами число = " + userNumber + " больше того, что загадал компьютер.");
				userNumber -= 2;
			}
		}

		System.out.println("Вы угадали!");
	}
}