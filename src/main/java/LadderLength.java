import java.util.*;

public class LadderLength {
    Map<String, Integer> map = new HashMap<>();
    List<List<Integer>> edge = new ArrayList<>();
    int numId = 0;

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        for(String word : wordList) {
            addEdge(word);
        }
        addEdge(beginWord);
        if(!map.containsKey(endWord)) {
            return 0;
        }
        int[] dis = new int[numId];
        int beginId = map.get(beginWord), endId = map.get(endWord);
        Arrays.fill(dis, Integer.MAX_VALUE);
        dis[beginId] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(beginId);
        while (!queue.isEmpty()) {
            int x = queue.poll();
            if(x == endId) {
                return dis[endId] / 2 + 1;
            }
            for(int it : edge.get(x)) {
                if(dis[it] == Integer.MAX_VALUE) {
                    dis[it] = dis[x] + 1;
                    queue.offer(it);
                }
            }
        }
        return 0;
    }

    private void addEdge(String word) {
        addWord(word);
        int id1 = map.get(word);
        char[] array = word.toCharArray();
        for(int i = 0; i < array.length; i++) {
            char tmp = array[i];
            array[i] = '*';
            String newWord = new String(array);
            addWord(newWord);
            int id2 = map.get(newWord);
            edge.get(id1).add(id2);
            edge.get(id2).add(id1);
            array[i] = tmp;
        }
    }

    private void addWord(String word) {
        if(!map.containsKey(word)) {
            map.put(word, numId++);
            edge.add(new ArrayList<>());
        }
    }
}
