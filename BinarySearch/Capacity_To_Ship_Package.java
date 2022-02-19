package BinarySearch;

class Capacity_To_Ship_Package {
    public static void main(String[] args) {
        int[] weights = { 1, 2, 3, 4, 5, 6, 7,8,9,10 };
        int days = 5;
        System.out.println(shipWithinDays(weights, days));

    }

    static int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int sum = 0;

        for (int i = 0; i < weights.length; i++) {
            sum = sum+weights[i];
            if(max<weights[i]){
                max = weights[i];
            }
        }

        if (weights.length == days) {
            return max;
        }

        int low = max;
        int high = sum;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(days, weights, mid) == true) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    static boolean isPossible(int days, int[] weights, int mid) {
        int d = 1;
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum = sum + weights[i];
            if (sum > mid) {
                d++;
                sum = weights[i];
            }
        }

        return d <= days;
    }
}
