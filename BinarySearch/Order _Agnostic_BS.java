package BinarySearch;

 class Order_Agnostic_BS {
    public static void main(String[] args) {
        int[] arr = {11,8,6,5,3,-1,-8};
        int target = 5;
        int ans = order_ABS(arr, target);
        System.out.println(ans);
    }

    static int order_ABS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(arr[mid]==target){
                return mid;
            }

            if(arr[start]>arr[end]){
                if(arr[mid]>target){
                    start = mid+1;

                }else{
                    end= mid-1;
                }
            }else{
                if(arr[mid]<target){
                    start = mid+1;

                }else{
                    end= mid-1;
                }
            }
        }

        return -1;
    }
}
