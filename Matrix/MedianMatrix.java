package Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MedianMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        
        System.out.println(median(matrix));
    }

    static int median(int[][] matrix) {
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

        Collections.sort(list);
        int r = matrix.length;
        int c = matrix[0].length;
        int ans = list.get((r * c)/2);
        return ans;
    }
}
