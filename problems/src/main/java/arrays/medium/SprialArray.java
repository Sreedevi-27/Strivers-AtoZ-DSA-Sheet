package arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class SprialArray {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int total = row*col;
        int i=0,j=0,x=0;

        while(x<total){
            int a = j;
            while(x<total && a<col){
                list.add(matrix[i][a]);
                a++;
                x++;
                System.out.println(x+"--->"+total);
            }
            i++;

            int b = i;
            while(x<total && b<row){
                list.add(matrix[b][col-1]);
                b++;
                x++;
            }
            col--;

            int c = col-1;
            while(x<total && c>=j){
                list.add(matrix[row-1][c]);
                c--;
                x++;
            }
            row--;

            int d = row-1;
            while(x<total && d>=i){
                list.add(matrix[d][j]);
                d--;
                x++;
            }
            j++;
        }
        return list;
    }
}
