public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    private int end=0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data=new int[size];
    }


    public boolean isEmpty(){
        return end==0;
    }
    public boolean isFull(){
        return end==data.length;

    }
    public boolean add(int item) throws Exception {
        if(isFull()){
            throw new Exception("queue is full");
        }
        data[end]=item;
        end++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()){
            throw new Exception("Queue is empty ")
        }
        int removed= data[0];
        //shift element to left

        for (int i = 0; i <end ; i++) {
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }
}
