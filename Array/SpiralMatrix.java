package Array;

import java.util.ArrayList;
import java.util.List;

class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 5 },
                { 4, 8, 9 },
                { 7, 6, 3 }
        };

        System.out.println(spiralOrder(matrix));
    };

    static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<>();
        int rows = matrix.length;
        if (rows == 0) {
            return list;
        }

        int cols = matrix[0].length;

        int d = 0;
        int l = 0;
        int r = cols - 1;
        int t = 0;
        int b = rows - 1;

        while (l <= r && t <= b) {
            if (d == 0) {
                for (int i = l; i <= r; i++) {
                    list.add(matrix[t][i]);
                    d = 1;
                    t++;
                }
            } else if (d == 1) {
                for (int i = t; i <= b; i++) {
                    list.add(matrix[i][r]);
                    d = 2;
                    r--;
                }
            } else if (d == 2) {
                for (int i = r; i >= l; i--) {
                    list.add(matrix[b][i]);
                    d = 3;
                    b--;
                }
            } else if (d == 3) {
                for (int i = b; i >= t; i--) {
                    list.add(matrix[i][l]);
                    d = 0;
                    l++;
                }
            }
        }

        return list;
    }
}
