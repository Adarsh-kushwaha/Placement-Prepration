public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 78, 12, 7854};
        int n = 45;
        int result = linearSearchAlgo(arr, n);
        System.out.println(result);
    }

    static int linearSearchAlgo(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element == target){
                return i;
            }
        }

        return -1;
    }
}
