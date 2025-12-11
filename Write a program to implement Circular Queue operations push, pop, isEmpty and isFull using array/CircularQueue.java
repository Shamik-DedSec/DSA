public class CircularQueue {
    int[] arr = new int[5];
    int start = -1;
    int end = -1;
    int size = 0;

    void push(int v) {
        if(size==arr.length) return;
        if(start==-1) start = 0;
        end = (end+1)%arr.length;
        arr[end] = v;
        size++;
    }

    int pop() {
        if(size==0) return -1;
        int x = arr[start];
        start = (start+1)%arr.length;
        size--;
        return x;
    }

    boolean isEmpty() { return size==0; }
    boolean isFull() { return size==arr.length; }
}
