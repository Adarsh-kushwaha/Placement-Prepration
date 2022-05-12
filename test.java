import java.util.*;  
import java.util.ArrayList ;
public class Test{

     public static  List<Character>solve(List<Character>list){
          ArrayList<Character> al = new ArrayList<Character>();
           Set<Character> s = new HashSet<Character>();

        for(Character name : list) {
            if(s.add(name) == false)
                System.out.println(name + "is duplicated");
                al.add(name);
        }
         return al;
     } 
      
      public static void main(String[] args)
     {  
         
   ArrayList<Character> list= new ArrayList<Character>();
        list.add('a');
        list.add('b');
        list.add('b');
        list.add('c');
        list.add('c');
        solve(list);
        for (int i = 0; i < list.size(); i++)
        System.out.print(list.get(i) + " ");
        

       
    }
}