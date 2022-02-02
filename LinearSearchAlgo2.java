public class LinearSearchAlgo2 {
    public static void main(String[] args) {
        int[] arr = {12, 78, 12, 7854,45,256,895,236};
        int n = 45;
        int start =2;
        int end = 5;
        int result = linearSearchAlgo(arr, n, start, end);
        System.out.println(result);
    }

    static int linearSearchAlgo(int[] arr, int target, int start, int end){
        if(arr.length==0){
            return -1;
        }

        for (int i = start; i < end; i++) {
            int element = arr[i];
            if(element == target){
                return i;
            }
        }

        return -1;
    }
    
}
