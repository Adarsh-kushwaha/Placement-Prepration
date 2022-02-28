package Array;

import java.util.ArrayList;
import java.util.Arrays;

class LuckyNumber {
    public static void main(String[] args) {
        int matrix[][] = { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } };
        ArrayList<Integer> ans = luckyNumbers(matrix);
        System.out.println(ans);

    }

    static ArrayList<Integer> luckyNumbers(int[][] matrix) {
        int[] minRow = new int[matrix.length];
        int[] maxCol = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            int minVal = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                }
            }

            minRow[i] = minVal;
        }

        for (int i = 0; i < matrix[0].length; i++) {
            int maxVal = Integer.MIN_VALUE;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] > maxVal) {
                    maxVal = matrix[j][i];
                }
            }

            maxCol[i] = maxVal;
        }

        ArrayList<Integer> result = new ArrayList<Integer>(1);

     

        for (int i = 0; i < minRow.length; i++) {
            for (int j = 0; j < maxCol.length; j++) {
                if(minRow[i] == maxCol[j]){
                    result.add(minRow[i]);
                }
            }
        }

        return result;

    }
}
