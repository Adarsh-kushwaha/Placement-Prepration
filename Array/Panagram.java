package Array;
class Pnagram{
    public static void main(String [] args){
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
       boolean ans = checkIfPangram(sentence);
       System.out.println(ans);
    }

    static boolean checkIfPangram(String sentence) {

        boolean [] arr= new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            if('A'<= sentence.charAt(i) && sentence.charAt(i)<='Z'){
                int index = sentence.charAt(i) - 'A';
                arr[index] = true;
            } else if('a'<= sentence.charAt(i) && sentence.charAt(i)<='z'){
                int index = sentence.charAt(i) - 'a';
                arr[index] = true;
            }

            
        }

        for (int i = 0; i <26; i++) {
            if(!arr[i] ){
                return false;
            }
        }

        return true;
    }
}