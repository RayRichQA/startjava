import java.util.Scanner;

class GuessNumber {

    private int number;
    private Scanner scanner = new Scanner(System.in);

    int getNumber() {
        return number;
    }

    void setNumber() {
        number = (int) Math.round(Math.random() * 100);
    }

    String setUserName() {
        System.out.println("Введите Ваше имя: ");
        return scanner.next();
    }

    int setUserNumber() {
        System.out.println("Введите число: ");
        return scanner.nextInt();
    }

    String guess(int userNumber, int number) {
        while(userNumber != number) {
            if(userNumber < number) {
                System.out.println("Введенное Вами число = " + userNumber + " меньше того, что загадал компьютер.");
                userNumber = anotherTry();
            } if(userNumber > number) {
                System.out.println("Введенное Вами число = " + userNumber + " больше того, что загадал компьютер.");
                userNumber = anotherTry();
            }
        }
        System.out.println("Вы угадали!");
        continueGame();
        return "";
    }

    private int anotherTry() {
        System.out.println("Попробуйте ещё: ");
        return scanner.nextInt();
    }

    private void continueGame() {
        String userAnswer;
        do {
            System.out.println("Хотите продолжить?");
            userAnswer = scanner.next();
            if(userAnswer.equals("Да")) {
                setNumber();
                guess(setUserNumber(), getNumber());
            }
        } while (!userAnswer.equals("Да") && !userAnswer.equals("Нет"));
    }
}