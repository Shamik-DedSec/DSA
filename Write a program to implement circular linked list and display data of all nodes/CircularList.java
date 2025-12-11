class CNode {
    int value;
    CNode next;
    CNode(int v) { value=v; }
}

public class CircularList {
    CNode head;

    void add(int v) {
        CNode n = new CNode(v);
        if(head==null) {
            head = n;
            n.next = head;
            return;
        }
        CNode t = head;
        while(t.next!=head) t = t.next;
        t.next = n;
        n.next = head;
    }

    void display() {
        if(head==null) return;
        CNode t = head;
        do {
            System.out.print(t.value+" ");
            t = t.next;
        } while(t!=head);
    }
}
