import java.util.*;
class AvgMarks{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter The Number of Subjects: ");
    int n = sc.nextInt();
    System.out.println("Enter the marks one by one");
    int marks[] = new int[n];

    for(int i = 0; i<n; i++){
        marks[i] = sc.nextInt();
    }

    int avgMarks = 0;
    for(int i =0 ; i<n; i++){
        avgMarks = avgMarks+marks[i];
    }

    avgMarks = avgMarks/n;

    System.out.println("Your Average Marks is : " + avgMarks );
}

}