public class GuessNumberTest {

    public static void main(String[] args) {
        GuessNumber guessNumber = new GuessNumber();
        Player playerOne = new Player(guessNumber.setUserName());
        guessNumber.setNumber();
        guessNumber.startGame(playerOne);
        System.out.println(guessNumber.guess(playerOne.getNumber(), guessNumber.getNumber()));
        Player playerTwo = new Player(guessNumber.setUserName());
        guessNumber.setNumber();
        guessNumber.startGame(playerTwo);
        System.out.println(guessNumber.guess(playerTwo.getNumber(), guessNumber.getNumber()));
    }
}