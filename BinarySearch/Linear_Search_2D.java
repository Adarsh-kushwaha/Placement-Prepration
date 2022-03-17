package BinarySearch;

class Linear_Search_2D {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 3, 4 },
                { 5, 6, 9 }

        };
        int target = 60;

        boolean res = searchMatrix(matrix, target);
        System.out.println(res);
    }

    static boolean searchMatrix(int[][] matrix, int target) {

        int r = 0;
        int c = matrix[0].length - 1;

        while (r < matrix.length && c >= 0) {

            if (matrix[r][c] == target) {
                return true;
            }

            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }

        }

        return false;

    }

}