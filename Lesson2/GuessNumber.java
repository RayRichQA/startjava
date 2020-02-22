import java.util.Scanner;

class GuessNumber {
   /* private Player player1, player2;

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }*/

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

    void startGame(Player player) {
        System.out.println(player.getName() + ", компьютер загадал число. Начинаем игру.");
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