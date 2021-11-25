import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        dfs(0, 0, n, new StringBuilder());
        return res;
    }

    private void dfs(int leftUsed, int rightUsed, int n, StringBuilder stringBuilder) {
        if(rightUsed > leftUsed || leftUsed > n) return;
        if(leftUsed == n && rightUsed == n) {
            res.add(stringBuilder.toString());
            return;
        }
        stringBuilder.append("(");
        dfs(leftUsed + 1, rightUsed, n, stringBuilder);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append(")");
        dfs(leftUsed, rightUsed + 1, n, stringBuilder);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
    }
}
