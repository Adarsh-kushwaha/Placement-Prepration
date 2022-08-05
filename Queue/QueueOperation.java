package Queue;
import java.util.*;

public class QueueOperation {
    public static void main(String[] args) {
        Queue <Integer> queue = new LinkedList<>();

        queue.add(5);
        queue.add(3);
        queue.add(1);
        queue.add(0);

        System.out.println(queue);

        queue.remove();
        queue.remove();

        System.out.println(queue);
    }
}
