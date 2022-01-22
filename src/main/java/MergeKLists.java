import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummyNode = new ListNode(-1);
        ListNode prev = dummyNode;
        Queue<ListNode> queue = new PriorityQueue<>(lists.length, Comparator.comparingInt((ListNode o) -> o.val));
        for(int i = 0; i < lists.length; i++) {
            if(lists[i] != null) queue.add(lists[i]);
        }
        while (!queue.isEmpty()) {
            prev.next = queue.poll();
            prev = prev.next;
            if(prev.next != null) queue.add(prev.next);
        }
        return dummyNode.next;
    }
}
