package Queue;

public class CircularQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int front = 0;
    protected int end = 0;
    protected int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }

        data[end++] = item;
        end = end % data.length;
        size++;

        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("queuue is empty");
        }

        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }
}
