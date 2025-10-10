import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int num;

        char[][] mat = new char[3][3];

        // Fill board with random X and O
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                num = random.nextInt(100);
                if (num % 2 != 0) {
                    mat[i][j] = 'X';
                } else {
                    mat[i][j] = 'O';
                }
            }
        }

        outputMatrix(mat);

        String result = checkWinner(mat);

        if (result.equals("X") || result.equals("O")) {
            System.out.println("Player " + result + " wins!");
        } else {
            System.out.println(result);
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

    public static String checkWinner(char[][] matrix) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (matrix[i][0] == matrix[i][1] &&
                    matrix[i][1] == matrix[i][2]) {
                return String.valueOf(matrix[i][0]);
            }
        }
        for (int j = 0; j < 3; j++) {
            if (matrix[0][j] == matrix[1][j] &&
                    matrix[1][j] == matrix[2][j]) {
                return String.valueOf(matrix[0][j]);
            }
        }
        if (matrix[0][0] == matrix[1][1] &&
                matrix[1][1] == matrix[2][2]) {
            return String.valueOf(matrix[0][0]);
        }

        if (matrix[0][2] == matrix[1][1] &&
                matrix[1][1] == matrix[2][0]) {
            return String.valueOf(matrix[0][2]);
        }

        return "No winner";
    }
}
