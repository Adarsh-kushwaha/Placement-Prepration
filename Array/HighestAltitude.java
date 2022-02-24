package Array;

 class HighestAltitude {
    public static void main(String[] args) {
        int [] gain = {};
        int res = largestAltitude(gain);
        System.out.println(res);
    }

    static int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        int [] arr = new int[gain.length+1];
        for (int i = 0; i < gain.length; i++) {
            
            arr[0] = 0;
            arr[i+1] = arr[i] + gain[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }

        return max;
    }
}
