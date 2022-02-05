public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,5},
                            {7,3},
                            {5,5}};

        int result = maximumWealth(accounts);
        System.out.println(result);

    }

    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int person = 0; person<accounts.length; person++){
            int sum = 0;
            for(int account = 0; account<accounts[person].length; account++){
                sum = sum + accounts[person][account];
            }

            if(sum>ans){
                ans = sum;
            }
        }


        return ans;
    }
}
