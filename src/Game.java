import java.util.Scanner;

public class Game {

    private MessagePrinter messagePrinter;
    private Scanner scanner;

    public final static int TRIES = 2;

    public Game(MessagePrinter messagePrinter, Scanner scanner) {
        this.messagePrinter = messagePrinter;
        this.scanner = scanner;
    }

    public void startGame(Field field) {
        messagePrinter.printInfo();
        shooting(field);
    }

    public void shooting(Field field) {
        int points = 0;
        int shots = TRIES;
        while (shots > 0) {
            messagePrinter.printFirstNumber(shots);
            int row = scanner.nextInt();
            messagePrinter.printSecondNumber();
            int column = scanner.nextInt();

            boolean result = field.checkCell(row, column);
            if (result) {
                messagePrinter.printWinMessage();
                points++;
                messagePrinter.printResult(points);
            } else {
                messagePrinter.printLoseMessage();
                messagePrinter.printResult(points);
            }
            shots--;
        }
        messagePrinter.gameEnd();
        messagePrinter.printStatistic(points);
    }
}
