class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(0,nums.length-1,nums);
    }
     public static int[]mergeSort(int start,int end,int []arr){
        if(start==end){
            return new int[]{arr[end]};
        }
        int mid=start+(end-start)/2;
        int[]left=mergeSort(start,mid,arr);
        int[]right=mergeSort(mid+1,end,arr);
        return merge(left,right);
    }
    public static int[]merge(int[]left,int[]right){
        int i=0,j=0,index=0;
        int[]ans=new int[left.length+right.length];
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                ans[index++]=left[i++];
            }
            else{
                ans[index++]=right[j++];
            }
        }
        while(i<left.length){
            ans[index++]=left[i++];
        }
        while(j<right.length){
            ans[index++]= right[j++];
        }
        return ans;
    }
}
