public class reverseBetween {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;

        ListNode prev = dummyNode;
        for(int i = 1; i < left; i++){
            prev = prev.next;
        }

        ListNode leftNode = prev.next;
        ListNode RightNode = prev.next;
        for(int i = left; i < right; i++){
            RightNode = RightNode.next;
        }

        ListNode curr = RightNode.next;
        prev.next = null;
        RightNode.next = null;

        reverseList(leftNode);
        prev.next = RightNode;
        leftNode.next = curr;

        return dummyNode.next;
    }

    public void reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    }
}
