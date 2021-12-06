import java.util.List;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = new ListNode(-1);
        ListNode slow = prev;
        ListNode fast = head;
        slow.next = head;
        for(int i = 0; i < n; i++){
            fast = fast.next;
        }
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        ListNode tmp = slow.next.next;
        slow.next = tmp;
        return prev.next;
    }
}
