package LinkedList;

public class LinkedList<T> {
    public T obj;
    public LinkedList next;

    public LinkedList reverse(LinkedList head) {
        LinkedList temp = head, prev = null, front;

        while (temp != null) {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    //        1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> null
//        5 -> 6 -> 3 -> 4 -> 1 -> 2 -> null

    public LinkedList rotateRight(LinkedList head, int k) {
        int length = 0;
        LinkedList temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        k = k % length;

        LinkedList fast = head;
        while (k > 0) {
            fast = fast.next;
            k--;
        }
        LinkedList slow = head;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = head;
        LinkedList newHead = slow.next;
        slow.next = null;

        return newHead;

    }
}
