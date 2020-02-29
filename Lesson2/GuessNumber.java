import java.util.Scanner;

class GuessNumber {

    public GuessNumber() {}

    public GuessNumber(Player player1, Player player2) {
        setNumber();
        startGame(player1);
        System.out.println(guess(player1, getNumber()));
        setNumber();
        startGame(player2);
        System.out.println(guess(player2, getNumber()));
    }

    private int number;
    private Scanner scanner = new Scanner(System.in);

    int getNumber () {
        return number;
    }

    void setNumber () {
        number = (int) Math.round(Math.random() * 100);
    }

    String setUserName () {
        System.out.println("Введите Ваше имя: ");
        return scanner.next();
    }

    int setUserNumber () {
        System.out.println("Введите число: ");
        return scanner.nextInt();
    }

    void startGame (Player player){
        System.out.println(player.getName() + ", компьютер загадал число. Начинаем игру.");
    }

    String guess (Player player, int number){
        player.setNumber(setUserNumber());
        while (player.getNumber() != number) {
            if (player.getNumber() < number) {
                System.out.println("Введенное Вами число = " + player.getNumber() + " меньше того, что загадал компьютер.");
                player.setNumber(anotherTry());
            }
            if (player.getNumber() > number) {
                System.out.println("Введенное Вами число = " + player.getNumber() + " больше того, что загадал компьютер.");
                player.setNumber(anotherTry());
            }
        }
        System.out.println("Вы угадали!");
        return "";
    }

    private int anotherTry () {
        System.out.println("Попробуйте ещё: ");
        return scanner.nextInt();
    }

    private String userAnswer;

    public String getUserAnswer() {
        return userAnswer;
    }

    void repeatGame() {
        System.out.println("Хотите продолжить?");
        userAnswer = scanner.next();
    }
}