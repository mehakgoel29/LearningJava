public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data=new int[size];
    }

    private int ptr=-1;
    //it points to the top of the stack

    public boolean isEmpty(){
        return ptr==-1;
    }
    public boolean isFull(){
        return ptr==data.length-1;
        //ptr is at the top of the stack
        //if it is pointing to the last element of the array it means it is full
    }

    public int push(int item ) throws Exception {
        if(isFull()){
            throw new Exception("Stack is Full ");
        }
        ptr++;
        data[ptr]=item;
        return data[ptr];
    }
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        int toBeRemoved =data[ptr];
        ptr--;
        return toBeRemoved;

        //return data[ptr--]
        //it will first return the last element then decrease the pointer by 1 and point to the new top
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("cannot find peek from empty stack");
        }
        return data[ptr];
    }

    public void traverse() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= ptr; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
    }
}
