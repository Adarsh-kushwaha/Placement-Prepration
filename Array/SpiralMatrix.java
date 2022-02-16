package Array;

// import java.util.ArrayList;
// import java.util.List;

// class SpiralMatrix {
//     public static void main(String[] args) {
//         int[][] matrix = {
//                 { 1, 2, 5 },
//                 { 4, 8, 9 },
//                 { 7, 6, 3 }
//         };

//         System.out.println(spiralOrder(matrix));
//     };

//     static List<Integer> spiralOrder(int[][] matrix) {

//         List<Integer> list = new ArrayList<>();
//         int rows = matrix.length;
//         if (rows == 0) {
//             return list;
//         }

//         int cols = matrix[0].length;

//         int d = 0;
//         int l = 0;
//         int r = cols - 1;
//         int t = 0;
//         int b = rows - 1;

//         while (l <= r && t <= b) {
//             if (d == 0) {
//                 for (int i = l; i <= r; i++) {
//                     list.add(matrix[t][i]);
//                     d = 1;
//                     t++;
//                 }
//             } else if (d == 1) {
//                 for (int i = t; i <= b; i++) {
//                     list.add(matrix[i][r]);
//                     d = 2;
//                     r--;
//                 }
//             } else if (d == 2) {
//                 for (int i = r; i >= l; i--) {
//                     list.add(matrix[b][i]);
//                     d = 3;
//                     b--;
//                 }
//             } else if (d == 3) {
//                 for (int i = b; i >= t; i--) {
//                     list.add(matrix[i][l]);
//                     d = 0;
//                     l++;
//                 }
//             }
//         }

//         return list;
//     }
// }

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 5 },
                { 4, 8, 9 },
                { 7, 6, 3 }
        };

        System.out.println(spiralOrder(matrix));
    };

    static List<Integer> spiralOrder(int[][] a) {

        List<Integer> list = new ArrayList<>();
        // for row
        int m = a.length;
        if (m == 0) {
            return list;
        }
        // for column
        int n = a[0].length;

        // Function print matrix in spiral form

        int i, k = 0, l = 0;

        while (k < m && l < n) {
            // Print the first row from the remaining rows
            for (i = l; i < n; ++i) {
                // System.out.print(a[k][i] + " ");
                list.add(a[k][i]);
            }
            k++;

            // Print the last column from the remaining
            // columns
            for (i = k; i < m; ++i) {
                // System.out.print(a[i][n - 1] + " ");
                list.add(a[i][n - 1]);
            }
            n--;

            // Print the last row from the remaining rows */
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    // System.out.print(a[m - 1][i] + " ");
                    list.add(a[m - 1][i]);
                }
                m--;
            }

            // Print the first column from the remaining
            // columns */
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    // System.out.print(a[i][l] + " ");
                    list.add(a[i][l]);
                }
               l++;
            }
        }


        return list;
    }
}