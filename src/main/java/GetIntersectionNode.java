public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int n1 = 0, n2 = 0;
        ListNode slow = headA, fast = headB;
        while (slow != null){
            slow = slow.next;
            n1++;
        }
        while (fast != null){
            fast = fast.next;
            n2++;
        }
        slow = headA; fast = headB;
        for(int i  = 0; i < Math.abs(n1 - n2); i++){
            if(n1 >= n2){
                slow = slow.next;
            }else {
                fast = fast.next;
            }
        }
        while (slow != null && fast != null){
            if(slow == fast){
                return slow;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return null;
    }
}
