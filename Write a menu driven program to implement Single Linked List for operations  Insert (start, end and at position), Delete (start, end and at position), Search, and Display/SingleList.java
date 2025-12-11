
class Node {
    int value;
    Node next;
    Node(int v) { value = v; }
}

public class SingleList {
    Node head;

    void insertStart(int v) {
        Node n = new Node(v);
        n.next = head;
        head = n;
    }

    void insertEnd(int v) {
        Node n = new Node(v);
        if(head==null) { head = n; return; }
        Node t = head;
        while(t.next!=null) t = t.next;
        t.next = n;
    }

    void insertPos(int v, int pos) {
        if(pos==0) { insertStart(v); return; }
        Node t = head;
        for(int i=0;i<pos-1;i++) t = t.next;
        Node n = new Node(v);
        n.next = t.next;
        t.next = n;
    }

    void deleteStart() {
        if(head!=null) head = head.next;
    }

    void deleteEnd() {
        if(head==null || head.next==null) { head=null; return; }
        Node t = head;
        while(t.next.next!=null) t = t.next;
        t.next = null;
    }

    void deletePos(int pos) {
        if(pos==0) { deleteStart(); return; }
        Node t = head;
        for(int i=0;i<pos-1;i++) t = t.next;
        t.next = t.next.next;
    }

    void search(int v) {
        Node t = head;
        int i=0;
        while(t!=null) {
            if(t.value==v) System.out.println(i);
            t = t.next;
            i++;
        }
    }

    void display() {
        Node t = head;
        while(t!=null) {
            System.out.print(t.value+" ");
            t = t.next;
        }
    }
}
