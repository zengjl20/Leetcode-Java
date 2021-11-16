public class EntryNodeOfLoop {
    //应用数学推导，得出找出环入口的方法。
    //一快一慢双指针可以有效确定链表是否有环
    public ListNode EntryNodeOfLoop(ListNode pHead){
        if(pHead == null || pHead.next == null){
            return null;
        }
        ListNode fast = pHead;
        ListNode slow = pHead;
        boolean flag = false;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                flag = true;
                break;
            }
        }
        if(! flag){
            return null;
        }
        ListNode slow2 = pHead;
        while (slow2 != slow){
            slow = slow.next;
            slow2 = slow2.next;
        }
        return slow;
    }
}
