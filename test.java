// import java.text.SimpleDateFormat;
// import java.util.Arrays;
// import java.util.Date;

public class test {
  public static void main(String[] args) {
    
  }

  static int[] reverse(int arr[]) {
    int start = arr.length / 2;
    int end = arr.length - 1;

    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }

    return arr;
  }
}
