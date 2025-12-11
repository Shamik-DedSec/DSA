class DNode {
    int value;
    DNode next;
    DNode prev;
    DNode(int v) { value=v; }
}

public class DoubleList {
    DNode head;

    void add(int v) {
        DNode n = new DNode(v);
        if(head==null) { head=n; return; }
        DNode t = head;
        while(t.next!=null) t = t.next;
        t.next = n;
        n.prev = t;
    }

    void display() {
        DNode t = head;
        while(t!=null) {
            System.out.print(t.value+" ");
            t = t.next;
        }
    }
}
