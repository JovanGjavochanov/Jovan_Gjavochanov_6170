import java.util.Random;

public class Main {
    public static void main(String[] args) {
        char[][] matrix = new char[3][3];

        generateMatrix(matrix);

        outputMatrix(matrix);

        int countX = countLines(matrix, 'X');
        int countO = countLines(matrix, 'O');

        // Announce result
        System.out.println("\nGame result:");
        System.out.println("X wins (" + countX + ") games");
        System.out.println("O wins (" + countO + ") games");
    }

    public static void generateMatrix(char[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = random.nextBoolean() ? 'X' : 'O';
            }
        }
    }

    public static void outputMatrix(char[][] mat) {
        for (char[] row : mat) {
            for (char elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public static int countLines(char[][] matrix, char symbol) {
        int countLines = 0;

        // Check rows
        for (int i = 0; i < 3; i++) {
            if (matrix[i][0] == symbol &&
                    matrix[i][1] == symbol &&
                    matrix[i][2] == symbol) {
                countLines++;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (matrix[0][j] == symbol &&
                    matrix[1][j] == symbol &&
                    matrix[2][j] == symbol) {
                countLines++;
            }
        }

        if (matrix[0][0] == symbol &&
                matrix[1][1] == symbol &&
                matrix[2][2] == symbol) {
            countLines++;
        }

        if (matrix[2][0] == symbol &&
                matrix[1][1] == symbol &&
                matrix[0][2] == symbol) {
            countLines++;
        }

        return countLines;
    }
}
