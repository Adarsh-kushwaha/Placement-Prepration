package Array;

class Sum_Of_Diagonal {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int res = diagonalSum(mat);
        System.out.println(res);
    }

    static int diagonalSum(int[][] mat) {

        int sum = 0;
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    sum = sum + mat[i][j] + mat[i][n - i - 1];
            }
        }

        if(mat.length%2 != 0){
            sum = sum - mat[n/2][n/2];
        }

        return sum;
    }
}
