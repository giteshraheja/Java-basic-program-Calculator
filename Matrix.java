import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

    int rows, columns;
    Matrix(int noOfRows, int noOfCol){
        this.rows = noOfRows;
        this.columns = noOfCol;
    }

    void printMatrix(int max[][]){
        for (int[] a:max){
                System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the rows for matrix");
        int rows = console.nextInt();
        System.out.println("Enter the columns for matrix");
        int columns = console.nextInt();

        Matrix mat = new Matrix(rows, columns);

        System.out.println("Enter the values of a matrix");

        int matrix[][] = new int[mat.rows][mat.columns];
        for (int i = 0; i < mat.rows ; i++) {
            for (int j = 0; j < mat.columns; j++) {
                System.out.println("Enter element" + i +" " + j);
                int element = console.nextInt();
                matrix[i][j] = element;
            }
        }

        System.out.println("Elements of a matrix are: ");
        mat.printMatrix(matrix);

    }

}
