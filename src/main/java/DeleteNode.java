public class DeleteNode {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode prev = dummyNode;
        while (head != null){
            if(head.val == val){
                prev.next = head.next;
            }
            prev = head;
            head = head.next;
        }
        return dummyNode.next;
    }
}
