import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) 
    {
        System.out.println("Code by Aaroh Gaur (22BCS17238)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for Matrix :");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns for Matrix :");
        int cols = scanner.nextInt();
        int[][] matrix1 = new int[rows][cols];
        System.out.println("Enter the elements of Matrix 1:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        int[][] matrix2 = new int[rows][cols];
        System.out.println("Enter the elements of Matrix 2:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        int[][] addition = new int[rows][cols];
        int[][] subtraction = new int[rows][cols];

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                addition[i][j] = matrix1[i][j] + matrix2[i][j];
                subtraction[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        System.out.println("Addition:");
        printMatrix(addition);

        System.out.println("Subtraction:");
        printMatrix(subtraction);

        int[][] multiplication = new int[rows][cols];
        for(int i = 0;i<rows;i++)
        {
            for (int j = 0; j < cols; j++) 
            {
                multiplication[i][j] = 0;
                for (int k = 0; k < cols; k++) 
                {
                    multiplication[i][j] += matrix1[i][k] * matrix2[k][j];

                }
            }
        }
        System.out.println("Multiplication:");

    printMatrix(multiplication);
    scanner.close();

    }

     

    

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
