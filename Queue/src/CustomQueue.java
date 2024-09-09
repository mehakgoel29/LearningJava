public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    private int ptr=0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data=new int[size];
    }

    public boolean isEmpty(){
        return ptr==0;
    }
    public boolean isFull(){
        return ptr==data.length;

    }
    public boolean add(int item) throws Exception {
        if(isFull()){
            throw new Exception("queue is full");
        }
        data[ptr]=item;
        ptr++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()){
            throw new Exception("Queue is empty ");
        }
        int removed= data[0];
        //shift element to left

        for (int i = 1; i <ptr ; i++) {
            data[i-1]=data[i];
        }
        ptr--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("cannot find front from an empty queue");
        }
        return data[0];
    }

    public void display(){
        for (int i = 0; i < ptr; i++) {
            System.out.print(data[i]+" <-");
        }
        System.out.print("end");
        System.out.println();
    }
}
