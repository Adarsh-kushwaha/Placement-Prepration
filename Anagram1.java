// import java.util.*;
// public class Anagram1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter String 1 : ");
//         String a = sc.nextLine();
//         System.out.print("Enter String 2 : ");
//         String b = sc.nextLine();

//         boolean isAnagram = false;

//         for(int i = 0; i<a.length(); i++){
//             char c = a.charAt(i);
//             isAnagram = false;

//             for(int j =0; j<b.length(); j++){
//                 if(b.charAt(j)==c){
//                     isAnagram = true;
//                     break;
//                 }

//                 if(!isAnagram){
//                     break;
//                 }
//             }
//         }

//         if(isAnagram){
//             System.out.println("Anagram");
//         }else{
//             System.out.println("Not an Anagram");
//         }
//     }
// }

// //time complexity o(n^2)