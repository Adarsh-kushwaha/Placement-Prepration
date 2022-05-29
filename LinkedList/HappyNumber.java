package LinkedList;
//202. Happy Number

public class HappyNumber {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;

        do {
            fast = findSqr(findSqr(fast));
            slow = findSqr(slow);
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }
        return false;
    }

    public int findSqr(int number) {
        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            ans = ans + rem * rem;
            number = number / 10;
        }

        return ans;
    }
}
