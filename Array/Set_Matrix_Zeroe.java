package Array;

class Set_Matrix_Zeroe {
    public static void main(String[] args) {
        // int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        // int[][] res = setZeroes(m);
        // System.out.println(Arrays.toString(res));
    }

    static void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        boolean rowZero = false;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;

                    if (i > 0) {
                        matrix[i][0] = 0;
                    } else {
                        rowZero = true;
                    }

                }

            }

        }

        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }

            }
        }

        if (matrix[0][0] == 0) {
            for (int i = 0; i < r; i++) {
                matrix[i][0] = 0;
            }
        }

        if (rowZero) {
            for (int j = 0; j < c; j++) {
                matrix[0][j] = 0;
            }
        }

    }
}

// other sol
