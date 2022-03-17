package String;

public class ShuffleString {
    public static void main(String[] args) {
       
    }

    static String restoreString(String s, int[] indices) {
        int n = s.length();
        StringBuilder ans = new StringBuilder(s);
        
        for(int i=0;i<n;i++){
            ans.setCharAt(indices[i],s.charAt(i));
        }
        return ans.toString();
        
        
        
    }
}
