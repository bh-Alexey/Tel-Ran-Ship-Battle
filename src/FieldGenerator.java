import java.util.Random;

public class FieldGenerator {

    private final static int R0W = 10;
    private final static int COLUMN = 10;
    private final static int SHIPS_QUANTITY = 5;

    private final static Cell[][] cells = new Cell[R0W][COLUMN];

    public Field generateField() {
        Random random = new Random();
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                int number = random.nextInt(R0W * COLUMN);
                boolean isShip = (number < SHIPS_QUANTITY);
                cells[i][j] = new Cell(isShip);
            }
        }

        Field field = new Field(cells);
        return field;
    }
}
