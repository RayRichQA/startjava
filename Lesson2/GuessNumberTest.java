public class GuessNumberTest {

    public static void main(String[] args) {
        GuessNumber guessNumber = new GuessNumber();
        Player playerOne = new Player(guessNumber.setUserName(), guessNumber.setUserNumber());
        guessNumber.setNumber();
        System.out.println(playerOne.getName() + ", компьютер загадал число. Начинаем игру.");
        System.out.println(guessNumber.guess(playerOne.getNumber(), guessNumber.getNumber()));
        Player playerTwo = new Player(guessNumber.setUserName(), guessNumber.setUserNumber());
        guessNumber.setNumber();
        System.out.println(playerTwo.getName() + ", компьютер загадал число. Начинаем игру.");
        System.out.println(guessNumber.guess(playerTwo.getNumber(), guessNumber.getNumber()));
    }
}