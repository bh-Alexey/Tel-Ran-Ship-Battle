import java.util.Random;

public class FieldGenerator {

    private final static Cell[][] cells = new Cell[10][10];

    public Field generateField() {
        Random random = new Random();
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                int number = random.nextInt(100);
                boolean isShip = (number < 5);
                cells[i][j] = new Cell(isShip);
            }
        }

        Field field = new Field(cells);
        return field;
    }
}
