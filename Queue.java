public class Queue {
    int front;
    int rear;
    int capacity;
    int noItem;

    int queueArr[];

    Queue(int size){
        capacity = size;
        front = 0;
        rear = -1;

        queueArr = new int[size];
    }

    boolean isFull(){
        return rear + 1 == capacity;
    }

    boolean isEmpty(){
        return front > rear;
    }

    void enQueue(int x){
        if(isFull()){
            System.out.println("The Queue is Full !");
        }
        else {
            rear++;
            queueArr[rear] = x;
            System.out.println("Inserting: " + x);
        }
    }

    void deQueue(){
        if(isEmpty()){
            System.out.println("The Queue is Empty");
        }
        else {
            System.out.println("Removing : " + queueArr[front]);
            front++;
        }
    }

    void printQueue(){
        for(int i = front; i<=rear; i++){
            System.out.print(queueArr[i] + " ");
        }
    }

    public static void main(String[] arg) {
        Queue myQueue = new Queue(5);

        myQueue.enQueue(10);
        myQueue.enQueue(20);
        myQueue.enQueue(30);
        myQueue.enQueue(40);
        myQueue.enQueue(50);
        myQueue.deQueue();
        myQueue.deQueue();

        myQueue.printQueue();
    }
}
