package LinkedList;

public class Middle_of_LinkedList_876 {
    public LinkedList middleNode(LinkedList head) {
        LinkedList f = head, s = head;
        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
        }
        return s;
    }
}
