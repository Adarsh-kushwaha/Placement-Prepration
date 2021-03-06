package Array;

import java.security.interfaces.RSAKey;
import java.util.ArrayList;
import java.util.List;

class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3,10 }, { 4, 5, 6,20 }, { 7, 8, 9,30 } };
        System.out.println(spiralOrder(matrix));
    }

    static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();

        int d = 0, top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            if (d == 0) {
                for (int i = left; i <= right; i++) {
                    list.add(matrix[top][i]);

                }
                top++;
            }

            else if (d == 1) {
                for (int i = top; i <= bottom; i++) {
                    list.add(matrix[i][right]);

                }
                right--;
            }

            else if (d == 2) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);

                }
                bottom--;
            }

            else if (d == 3) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);

                }
                left++;
            }

            d = (d + 1) % 4;

        }

        return list;
    }
}