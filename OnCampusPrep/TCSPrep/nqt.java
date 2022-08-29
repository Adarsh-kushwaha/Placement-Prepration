package OnCampusPrep.TCSPrep;

import java.util.Arrays;

public class nqt {
    public static void main(String[] args) {

    }

    static void removeDuplicate(String string, int r) {
        int index = 0;
        char[] str = string.toCharArray();
        int length = str.length;
       
        for (int i = 0; i < length; i++) {

         
            int j;
            for (j = 0; j < i; j++) {
                if (str[i] == str[j]) {
                    break;
                }
            }

            if (j == i) {
                str[index++] = str[i];
            }
        }
        System.out.println(String.valueOf(Arrays.copyOf(str, index)));
    }
}
