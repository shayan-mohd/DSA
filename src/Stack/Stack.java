package Stack;

public class Stack {

    int size;
    int[] list;

    int top;

    public Stack(int size) {
        this.size = size;
        list = new int[size];
        top = -1;
    }

    public void push(int x) throws Exception {

        if (top == size - 1) {
            throw new Exception("size full");
        }
        top++;
        list[top] = x;
    }

    public int pop() throws Exception {
        if (top < 0) {
            throw new Exception("stack empty");
        }
        return list[top--];
    }

    public int peek() throws Exception {
        if (top < 0) {
            throw new Exception("stack empty");
        }
        return list[top];
    }


}
