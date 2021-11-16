public class GetKthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode left = head;
        ListNode right = head;
        for(int i = 0; i < k; i++){
            right = right.next;
        }
        while (right != null){
            right = right.next;
            left = left.next;
        }
        return left;
    }
}
