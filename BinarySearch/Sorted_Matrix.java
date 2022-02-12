package BinarySearch;

import java.util.Arrays;

class Sorted_Matrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 },

        };

        int target = 12;

        int[] res = search(arr, target);
        System.out.println(Arrays.toString(res));
    }

    static int[] bSearch(int[][] matrix, int row, int cStart, int cEnd, int target) {

        while (cStart <= cEnd) {
            int cMid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][cMid] == target) {
                return new int[] { row, cMid };
            }

            if (matrix[row][cMid] < target) {
                cStart = cMid + 1;
            } else {
                cEnd = cMid - 1;
            }

        }

        return new int[] { -1, -1 };
    }

    static int[] search(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length; // columns may be empty

        if (rows == 1) {
            bSearch(matrix, 0, 0, cols - 1, target);

        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;

            if (matrix[mid][cMid] == target) {
                return new int[] { mid, cMid };
            }

            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // search in first half
        if (target <= matrix[rStart][cMid - 1]) {
            return bSearch(matrix, rStart, 0, cMid - 1, target);
        }
        // search in second half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return bSearch(matrix, rStart, cMid + 1, cols - 1, target);
        }

        // search in third half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return bSearch(matrix, rStart + 1, 0, cMid - 1, target);
        } else {
            return bSearch(matrix, rStart+1, cMid + 1, cols - 1, target);
        }
    }
}
