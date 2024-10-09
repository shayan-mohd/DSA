package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    Node head = new Node(0,0) , tail = new Node(0,0);
    Map<Integer, Node> map = new HashMap<>();
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        int value = -1;
        if (map.containsKey(key)) {
            Node oldNode = map.get(key);
            value = map.get(key).value;

            Node newNode = new Node(key, value);
            newNode.next = head.next;
            newNode.prev = head;
            head.next = newNode;
            newNode.next.prev = newNode;
            map.put(key, newNode);


            Node oldPrevNode = oldNode.prev;
            oldPrevNode.next = tail;
            tail.prev = oldPrevNode;
        }
        return value;
    }

    public void put(int key, int value) {
        if (!map.containsKey(key)) {
            if (map.size() == capacity) {
                map.remove(tail.prev.key);
                tail.prev.prev.next = tail;
                tail.prev = tail.prev.prev;
            }
                Node newNode = new Node(key, value);
                Node oldNode = head.next;

                head.next = newNode;
                newNode.prev = head;

                newNode.next = oldNode;
                oldNode.prev = newNode;

                map.put(key, newNode);
        }
        else {
            map.get(key).value = value;
        }
    }

    class Node {
        int key, value;
        Node next, prev;

        Node(int key, int value) {
            this.key =  key ;
            this.value = value ;
        }
    }
}
