import java.util.HashMap;

public class LRUCache {
    class DLinkedNode{
        int key;
        int value;
        DLinkedNode prev;
        DLinkedNode next;
        public DLinkedNode() {}
        public DLinkedNode(int _key, int _value){key = _key; value = _value;}
    }

    private HashMap<Integer, DLinkedNode> hashMap = new HashMap<>();
    private int capacity;
    private int size;
    private DLinkedNode head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.next = tail;
        tail.next = head;
    }

    public int get(int key) {
        if(!hashMap.containsKey(key)) return -1;
        DLinkedNode node = hashMap.get(key);
        moveToHead(node);
        return node.value;
    }

    private void moveToHead(DLinkedNode node) {
        removeNode(node);
        addToHead(node);
    }

    private void addToHead(DLinkedNode node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(DLinkedNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void put(int key, int value) {
        if(hashMap.containsKey(key)){
            DLinkedNode node = hashMap.get(key);
            node.value = value;
            moveToHead(node);
            return;
        }
        DLinkedNode node = new DLinkedNode(key, value);
        hashMap.put(key, node);
        addToHead(node);
        size++;
        if(size > capacity){
            DLinkedNode node1 = tail.prev;
            removeNode(node1);
            hashMap.remove(node1.key);
            size--;
        }
    }
}
