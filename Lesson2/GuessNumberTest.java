public class GuessNumberTest {

    public static void main(String[] args) {
        GuessNumber guessNumber = new GuessNumber();
        Player playerOne = new Player(guessNumber.setUserName());
        Player playerTwo = new Player(guessNumber.setUserName());
        GuessNumber game = new GuessNumber(playerOne, playerTwo);

        while (true) {
            game.repeatGame();
            if (game.getUserAnswer().equalsIgnoreCase("Да")) {
                new GuessNumber(playerOne, playerTwo);
            } else if (game.getUserAnswer().equalsIgnoreCase("Нет")) {
                break;
            }
        }
    }
}