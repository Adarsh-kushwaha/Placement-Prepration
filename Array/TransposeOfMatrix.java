package Array;

 class TransposeOfMatrix {
    public static void main(String[] args) {
        
    }

    static int[][] transpose(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        int [][] tm = new int [row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                tm[j][i] = matrix[i][j];
            }
        }

        return tm;
    }
}
