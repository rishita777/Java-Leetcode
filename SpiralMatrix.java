package Leetcode;

public class SpiralMatrix {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;

        int[][] matrix = generateSpiralMatrix(rows, cols);

        // Print the spiral matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] generateSpiralMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        int value = 1;
        int topRow = 0, bottomRow = rows - 1;
        int leftCol = 0, rightCol = cols - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {
            // Traverse top row
            for (int col = leftCol; col <= rightCol; col++) {
                matrix[topRow][col] = value++;
            }
            topRow++;

            // Traverse right column
            for (int row = topRow; row <= bottomRow; row++) {
                matrix[row][rightCol] = value++;
            }
            rightCol--;

            // Traverse bottom row
            if (topRow <= bottomRow) {
                for (int col = rightCol; col >= leftCol; col--) {
                    matrix[bottomRow][col] = value++;
                }
                bottomRow--;
            }

            // Traverse left column
            if (leftCol <= rightCol) {
                for (int row = bottomRow; row >= topRow; row--) {
                    matrix[row][leftCol] = value++;
                }
                leftCol++;
            }
        }

        return matrix;
    }
}

