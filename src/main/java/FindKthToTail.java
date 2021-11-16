public class FindKthToTail {
    public ListNode FindKthToTail (ListNode pHead, int k) {
        //一个指针不能解决的问题，可以用两个指针来解决
        //如果有必要判断是否为环形链表，可以用快慢指针解决
        ListNode fast = pHead;
        ListNode slow = pHead;
        for(int i = 0; i < k; i++){
            if(fast == null){
                return null;
            }
            fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
