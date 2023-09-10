public class MessagePrinter {

    public void printInfo() {
        System.out.println("GAME STARTED");
        System.out.println("------------");

    }

    public void printFirstNumber(int tries) {
        printTries(tries);
        System.out.println("Enter first number from 0 to 9:");
    }

    public void printSecondNumber() {
        System.out.println("Enter second number from 0 to 9:");
    }

    public void printWinMessage() {
        System.out.println("Well done");
    }

    public void printLoseMessage() {
        System.out.println("Lose");
    }

    public void printResult(int points) {
        System.out.println("Ships destroyed: " + points);
    }

    public void printTries(int tries) {
        System.out.println("You have " + tries + " shots");
    }

    public void gameEnd() {
        System.out.println("------------");
        System.out.println("GAME OVER");
    }

    public void printStatistic(int points) {
        System.out.println(points + " hits of " + Game.TRIES + " shots");
    }
}
