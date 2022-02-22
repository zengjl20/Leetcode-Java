public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode odd = head;
        ListNode evenFirst = head.next, even = evenFirst;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenFirst;
        return head;
    }
}
