public class ConditionalStatement {
	
	public static void main (String[] args) {

		int age = 21;
		boolean isMale = false;
		float height = 2.20f;
		char firstLetterName = 'I';

		if (age > 20) {
			System.out.println("You're too old.");
		}

		if (isMale) {
			System.out.println("You're a man.");
		}

		if (!isMale) {
			System.out.println("Maybe you're a woman.");
		}

		if (height < 1.80) {
			System.out.println("You're a cute gnome.");
		} else {
			System.out.println("You could wash my wardrobes.");
		}

		if (firstLetterName == 'M') {
			System.out.println("You have to buy me a big chocolate box.");
		} else if (firstLetterName == 'I') {
			System.out.println("You have to buy me an island with plane and big house.");
		} else {
			System.out.println("You should change your name.");
		}
	}
}