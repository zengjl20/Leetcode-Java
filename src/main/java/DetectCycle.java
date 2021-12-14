import java.util.HashSet;

public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hashSet = new HashSet<>();
        ListNode cur = head;
        while(!hashSet.contains(cur) && cur != null){
            hashSet.add(cur);
            cur = cur.next;
        }
        return cur;
    }
}
