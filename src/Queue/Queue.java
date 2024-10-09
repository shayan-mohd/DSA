package Queue;

public class Queue {

    int size;

    int front, back;

    int[] list;

    public Queue(int size) {
        this.size = size;
        list = new int[this.size];
        front = 0;
        back = 0;
    }

    public void enqueue(int x) throws Exception {
        if (back >= size) {
            throw new Exception("queue full");
        }
        list[back++] = x;
    }

    public int dequeue() throws Exception {
        if (front >= back) {
            throw new Exception("Queue empty");
        }
        return list[front++];
    }
}
