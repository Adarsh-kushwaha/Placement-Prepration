package Queue;

public class MainQueue {
    public static void main(String[] args) throws Exception {
        CustomQueue que = new CustomQueue();
        que.insert(50);
        que.insert(55);
        que.insert(450);
        que.insert(550);

        System.out.println(que.remove());
        System.out.println(que.remove());
        System.out.println(que.remove());


    }
}
