import java.util.Random;

public class H05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // Create a 4-by-4 matrix
        int[][] matrix = new int[4][4];

        // Randomly fill the matrix with 0s and 1s
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(2); // Generates random number 0 or 1
            }
        }

        // Print the matrix
        System.out.println("Randomly filled 4-by-4 matrix:");
        printMatrix(matrix);

        // Find the first row with the most 1s
        int maxOnesInRow = 0;
        int rowIndexWithMostOnes = -1;
        for (int i = 0; i < matrix.length; i++) {
            int onesCount = countOnes(matrix[i]);
            if (onesCount > maxOnesInRow) {
                maxOnesInRow = onesCount;
                rowIndexWithMostOnes = i;
            }
        }

        // Find the first column with the most 1s
        int maxOnesInCol = 0;
        int colIndexWithMostOnes = -1;
        for (int j = 0; j < matrix[0].length; j++) {
            int onesCount = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1) {
                    onesCount++;
                }
            }
            if (onesCount > maxOnesInCol) {
                maxOnesInCol = onesCount;
                colIndexWithMostOnes = j;
            }
        }

        // Print the results
        System.out.println("First row with the most 1s: " + rowIndexWithMostOnes);
        System.out.println("First column with the most 1s: " + colIndexWithMostOnes);
    }

    // Method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to count the number of 1s in a row
    public static int countOnes(int[] row) {
        int count = 0;
        for (int num : row) {
            if (num == 1) {
                count++;
            }
        }
        return count;
    }
}
	
