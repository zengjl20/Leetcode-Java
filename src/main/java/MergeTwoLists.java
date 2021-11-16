public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(-1);
        ListNode prev = dummyNode;
        while (l1 != null || l2 != null){
            if (l1 == null) {
                prev.next = l2;
                l2 = l2.next;
            }
            else if(l2 == null) {
                prev.next = l1;
                l1 = l1.next;
            }
            else {
                if(l1.val > l2.val) {
                    prev.next = l2;
                    l2 = l2.next;
                } else {
                    prev.next = l1;
                    l1 = l1.next;
                }
            }
            prev = prev.next;
        }
        return dummyNode.next;
    }
}
