public class MinNumber {
    public String minNumber(int[] nums) {
        String[] strings = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            strings[i] = String.valueOf(nums[i]);
        }
        quickSort(strings, 0, nums.length - 1);
        StringBuilder res = new StringBuilder();
        for(String string : strings){
            res.append(string);
        }
        return res.toString();
    }

    private void quickSort(String[] strings, int l, int r) {
        if(l >= r) return;
        int i = l, j = r;
        String tmp = strings[i];
        while (i < j){
            while ((strings[i] + strings[l]).compareTo(strings[l] + strings[i]) <= 0 && i < j) i++;
            while ((strings[j] + strings[l]).compareTo(strings[l] + strings[j]) >= 0 && i < j) j--;
            tmp = strings[i];
            strings[i] = strings[j];
            strings[j] = tmp;
        }
        strings[i] = strings[l];
        strings[l] = tmp;
        quickSort(strings, l, i - 1);
        quickSort(strings, i + 1, r);
    }

}
