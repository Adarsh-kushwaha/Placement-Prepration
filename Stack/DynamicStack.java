package Stack;

public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super();// if it is a custom stack
    }

    public DynamicStack(int size) {
        super(size);// call if it is a dynamic stack
    }

    @Override
    public boolean push(int item) {

        if (isFull()) {
            // create a double size array
            int temp[] = new int[data.length * 2];

            // copy all the item of array
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;

        }

        // now array id not full so you can push item now

        return super.push(item);
    }
}
