package Queue;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    int end = 0;

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }

        data[end++] = item;
        return true;
    }

    // remove the element
    // for removing item it will take o(n) time that is not good so we will use
    // circular queue
    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("queuue is empty");
        }

        int removed = data[0];

        // left shift the element
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }

        end--;
        return removed;
    }
}
