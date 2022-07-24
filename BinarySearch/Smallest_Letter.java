package BinarySearch;

class Smallest_Letter {
    public static void main(String[] args) {
        char[] letters = { 'c', 'j', 'm', 's' };
        char target = 'l';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);
    }

    static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // returning this because if target is greater then the last char of array then
        // just return first element array and this can be easily done using modulo

        return letters[start % letters.length];
    }
}
