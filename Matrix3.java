import java.util.Arrays;
import java.util.Scanner;

public class Matrix3 {

    int rows, columns;

    void getRows(int row) {
        this.rows = row;
    }

    void getColumn(int columns) {
        this.columns = columns;
    }

    void setElement(int i, int j, int val, int mat[][]){
        mat[i][j] = val;
    }

    int[][] addMatrix(int[][] mat1, int[][] mat2){

        if (mat2[0].length != mat1[0].length | mat1.length != mat2.length){
            System.out.println("Matrices cannot be added");
            return null;
        }
        int[][] c = new int[mat1.length][mat1[0].length];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                c[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return c;
//        return null;
    }

    int[][] multiplyMatrix(int[][] mat1, int[][] mat2){
        if (mat2[0].length != mat1[0].length | mat1.length != mat2.length){
            System.out.println("Matrices cannot be multiplied");
            return null;
        }
        int[][] cm = new int[mat1.length][mat1[0].length];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                cm[i][j] = mat1[i][j] * mat2[i][j];
            }
        }
        return cm;
//        return null;
    }

    void printMatrix(int max[][]) {
        for (int[] a : max) {
            System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the rows for matrix");
        int rows = console.nextInt();
        System.out.println("Enter the columns for matrix");
        int columns = console.nextInt();

        Matrix3 mat = new Matrix3();
        mat.getRows(rows);
        mat.getColumn(columns);

        System.out.println("Enter the values of a matrix");

        int matrix3[][] = new int[mat.rows][mat.columns];
        for (int i = 0; i < mat.rows; i++) {
            for (int j = 0; j < mat.columns; j++) {
                System.out.println("Enter element" + i + " " + j);
                int element = console.nextInt();
                matrix3[i][j] = element;
            }
        }

        System.out.println("Elements of a matrix are: ");
        mat.printMatrix(matrix3);

        System.out.println("Enter the value of i, j & value by entering one at a time");
        int i = console.nextInt();
        int j = console.nextInt();
        int v = console.nextInt();
        mat.setElement(i-1,j-1,v,matrix3);

        System.out.println("New Matrix is");
        mat.printMatrix(matrix3);

        System.out.println("Addition of 2 Matrices are: ");
        int[][] addedMatrix =mat.addMatrix(matrix3, matrix3);
        if (addedMatrix!=null)
            mat.printMatrix(addedMatrix);

        System.out.println("Multiplication of 2 Matrices are: ");
        int[][] multipliedMatrix = mat.multiplyMatrix(matrix3,matrix3);
        if (multipliedMatrix!=null)
            mat.printMatrix(multipliedMatrix);

    }

}
