public class SortList {
    public ListNode sortList(ListNode head) {
        if(head == null){
            return null;
        }
        int length = 0;
        ListNode p = head;
        while (p != null){
            p = p.next;
            length++;
        }
        ListNode dummyNode = new ListNode(-1, head);
        for(int subLength = 1; subLength < length; subLength <<= 1){
            ListNode prev = dummyNode;
            ListNode cur = head;
            while (cur != null) {
                // prev.next = null;
                ListNode head1 = cur;
                for (int i = 1; i < subLength && cur.next != null; i++) {
                    cur = cur.next;
                }
                ListNode head2 = cur.next;
                cur.next = null;
                cur = head2;
                for(int i = 1; i < subLength && cur != null && cur.next != null; i++){
                    cur = cur.next;
                }
                ListNode next = null;
                if(cur.next != null){
                    next = cur.next;
                    cur.next = null;
                }
                ListNode merge = mergeTwoList(head1, head2);
                prev.next = merge;
                while (prev.next != null) prev = prev.next;
                cur = next;
            }
        }
        return dummyNode.next;
    }

    public ListNode mergeTwoList(ListNode head1, ListNode head2){
        ListNode dummyHead = new ListNode(-1);
        ListNode cur = dummyHead;
        while (head1 != null && head2 != null){
            if(head1.val > head2.val){
                cur.next = head2;
                head2 = head2.next;
            }
            else {
                cur.next = head1;
                head1 = head1.next;
            }
            cur = cur.next;
        }
        if(head1 != null){
            cur.next = head1;
        }
        else if(head2 != null){
            cur.next = head2;
        }
        return dummyHead.next;
    }
}
