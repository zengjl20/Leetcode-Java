import java.util.ArrayList;
import java.util.List;

public class ReversePrint {
    public int[] reversePrint(ListNode head) {
        ListNode p = head;
        int n = 0;
        while (p != null){
            n++;
            p = p.next;
        }
        p = head;
        int[] result = new int[n];
        while (p != null){
            n--;
            result[n] = p.val;
            p = p.next;
        }
        return result;
    }
}
