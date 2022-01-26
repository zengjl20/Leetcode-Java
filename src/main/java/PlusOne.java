public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        while (true) {
            if(n >= 0 && digits[n] == 9) {
                digits[n] = 0;
                n--;
            }else {
                if(n >= 0) digits[n]++;
                break;
            }
        }
        if(n == -1) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        }
        return digits;
    }
}
