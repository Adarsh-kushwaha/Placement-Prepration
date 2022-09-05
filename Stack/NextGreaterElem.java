package Stack;

import java.util.Stack;

public class NextGreaterElem {
    public static void main(String[] args) {

    }

    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        Stack<Integer> st = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            while (st.isEmpty() == false && st.peek() <= nums1[i % n]) {
                st.pop();
            }

            if (i < n) {
                if (st.isEmpty() == false) {
                    nums2[i] = st.peek();
                } else {
                    nums2[i] = -1;
                }
            }

            st.push(nums1[i % n]);
        }

        return nums2;

    }
}
