public class StackArray {
    int[] arr = new int[5];
    int top = -1;

    void push(int v) {
        if(top==arr.length-1) return;
        arr[++top] = v;
    }

    int pop() {
        if(top==-1) return -1;
        return arr[top--];
    }

    boolean isEmpty() { return top==-1; }
    boolean isFull() { return top==arr.length-1; }
}
