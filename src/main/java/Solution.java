public class Solution {
    public static boolean isValid(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode[] nodes = new ListNode[6];
        for(int i = 0; i < 6; i++) {
            nodes[i] = new ListNode(i);
        }
        for(int i = 0; i < 5; i++) {
            nodes[i].next = nodes[i + 1];
        }
        System.out.println(isValid(nodes[0]));
        nodes[5].next = nodes[2];
        System.out.println(isValid(nodes[0]));
    }
}
