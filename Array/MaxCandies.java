package Array;

import java.util.ArrayList;
import java.util.List;

class MaxCandies {
    public static void main(String[] args) {
        int[] candies = { 0 };
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {

            if (max < candies[i]) {
                max = candies[i];
            }
        }
        List<Boolean> res = new ArrayList<Boolean>();
        for (int i = 0; i < candies.length; i++) {
            boolean result = false;
            if (candies[i] + extraCandies >= max) {
                result = true;
            }
            res.add(result);
        }

        return res;
    }
}
