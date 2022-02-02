import java.util.Arrays;

public class LinearSearchIn2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 4, 8 },
                { 10, 18, 19, 16 },
                { 25, 26, 58 }

        };

        int target = 19;

        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] search(int[][] arr, int target) {
        for(int row=0; row<arr.length; row++){
            for(int col =0; col<arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int []{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
