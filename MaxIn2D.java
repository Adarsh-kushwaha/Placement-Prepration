public class MaxIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 4, 8 },
                { 10, 18, 19, 16 },
                { 25, 26, 58 }

        };

        int ans = max(arr);
        System.out.println(ans);

    }

    public static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for(int element : ints){
                if(element > max){
                    max = element;
                }
            }
        }

        return max;
    }
}
