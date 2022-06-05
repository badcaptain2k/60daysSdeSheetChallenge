import java.util.Arrays;

public class setMatrix {
    public static void main(String[] args) {
        int mat[][]={{1,1,1},{1,0,1},{1,1,1}};
        for(int[]e : mat)
            System.out.println(Arrays.toString(e));
        setZeroes(mat);
        System.out.println("- - - - - - - - - - -");
        for(int[]e : mat)
            System.out.println(Arrays.toString(e));
    }
    public static void setZeroes(int[][] matrix) {

        int col0 =1, rows = matrix.length, cols = matrix[0].length;

        for(int i = 0; i<rows; i++){
            if(matrix[i][0] == 0) col0 = 0;

            for(int j=1; j<cols; j++){
                if(matrix[i][j]==0)
                    matrix[0][j] = matrix[i][0] = 0;
            }
        }
        for(int i = rows-1; i>=0; i--){
            for(int j=cols-1; j>=1; j--){
                if(matrix[0][j]==0 || matrix[i][0]==0)
                    matrix[i][j]=0;
            }
            if(col0 == 0)matrix[i][0] = 0;

        }

    }
}
