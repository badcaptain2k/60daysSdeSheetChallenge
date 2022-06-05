import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> res =generate(n);
        printResult(res);
    }
    public static  List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new ArrayList<>();

        ArrayList<Integer> row ;
        ArrayList<Integer> previous = null;
        for(int i=0; i<numRows; i++){
            row = new ArrayList<>();
            for(int  j =0; j<=i; j++){
                if(j==0 || j==i) row.add(1);
                else row.add(previous.get(j-1)+previous.get(j));
            }
            previous = row;
            res.add(row);
        }
        return res;

    }

    static void printResult(List<List<Integer>> res){
        for(List<Integer> e : res )
            System.out.println(e);
    }


}
