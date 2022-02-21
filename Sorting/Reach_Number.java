package Sorting;

 class Reach_Number {
    public static void main(String[] args) {
        int target = 3;
        System.out.println(reachNumber(target));
    }

    static int reachNumber(int target) {
        
        long sum =0; int steps =0;
        target = Math.abs(target);

        while(sum<target){
            sum = sum + steps;
            steps++;
        }

        while((sum-target)%2==1){
            sum = sum + steps;
            steps++;
        }

        return steps-1;

    }
}
