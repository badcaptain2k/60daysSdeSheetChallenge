import java.util.Arrays;

public class rotateImage {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] e : matrix)
            System.out.println(Arrays.toString(e));
        System.out.println("--------------");
        rotate(matrix);
        for (int[] e : matrix)
            System.out.println(Arrays.toString(e));
    }

    public static void rotate(int[][] matrix) {
        transpose(matrix);
        reverseColumns(matrix);
    }

    static void transpose(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++)
            for (int j = i; j < matrix[0].length; j++) {
                //swapping elements at (i,j) and (j,i).
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
    }


    static void reverseColumns(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix.length / 2; j++) {
                //swapping elements in each column.
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
    }

}
