public class VerifyPostorder {
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }

    private boolean recur(int[] postorder, int i, int j) {
        if(i >= j) return true;
        int m = i;
        while (postorder[m] < postorder[j]) m++;
        int n = m;
        while (postorder[n] > postorder[j]) n++;
        return n == j && recur(postorder, i, m - 1) && recur(postorder, m, j);
    }
}
