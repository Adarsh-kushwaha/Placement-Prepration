package Array;

import java.util.Arrays;

public class SpiralMatrix2 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Arrays.toString(generateMatrix(n)));
    }

    static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int d = 0, top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        int count =0;

        while(top<=bottom && right>=left){
            if(d==0){
                for (int i = left; i <= right ; i++) {
                    count++;
                    matrix[top][i]= count ;
                }
                top++;
            }

            else if (d == 1) {
                for (int i = top; i <= bottom; i++) {
                    count++;
                   matrix[i][right]=count;

                }
                right--;
            }

            else if (d == 2) {
                for (int i = right; i >= left; i--) {
                    count++;
                    matrix[bottom][i]=count;

                }
                bottom--;
            }

            else if (d == 3) {
                for (int i = bottom; i >= top; i--) {
                    count++;
                   matrix[i][left]=count;

                }
                left++;
            }

            d = (d + 1) % 4;
        }
        return matrix;
    }
}
