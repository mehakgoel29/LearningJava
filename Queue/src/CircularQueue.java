import java.util.concurrent.ExecutionException;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    protected int end=0;
    protected int front=0;
    private int size=0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data=new int[size];
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==data.length;
    }

    public boolean add(int item) throws Exception {
       if(isFull()){
            throw new Exception("queue is full");
        }
        data[end]=item;
        end++;
        end=end%data.length;
        size++;
        return true;
    }
    public boolean remove() throws Exception {
        if(isEmpty()){
            throw new Exception("queue is Empty");
        }
        int removed=data[front];
        front++;
        front=front%data.length;
        size--;
        return true;
    }

    public int front() throws Exception {
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        return data[front];
    }

    public void display(){
        for (int i = front; i < end; i++) {
            System.out.print(data[i]+" <-");
        }
        System.out.print("end");
        System.out.println();
    }


}
