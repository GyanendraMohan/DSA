package Mattrix;

public class SnakePattern {
    public static int finalCell(int n, String[] commands) {
        int row = 0;
        int col = 0;

        for (String command : commands) {
            switch (command) {
                case "UP":
                    row--;
                    break;
                case "DOWN":
                    row++;
                    break;
                case "LEFT":
                    col--;
                    break;
                case "RIGHT":
                    col++;
                    break;
                default:

                    break;
            }
        }

        return row * n + col;
    }
}
