public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public int push(int item) throws Exception {
        if (this.isFull()) {
            //double the size
            int[] temp = new int[data.length * 2];
            //copy the data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(item);
        //it will return the elements pushed by the super push method
    }
}
