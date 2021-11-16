import java.util.*;

public class TweetCounts {
    private Map<String, TreeMap<Integer, Integer>> map;

    public TweetCounts() {
        map = new HashMap<>();
    }

    public void recordTweet(String tweetName, int time) {
        if(map.containsKey(tweetName)){
            TreeMap<Integer, Integer> treeMap = map.get(tweetName);
            treeMap.put(time, treeMap.getOrDefault(time, 0) + 1);
        }else {
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            treeMap.put(time, 1);
            map.put(tweetName, treeMap);
        }
    }

    public List<Integer> getTweetCountsPerFrequency(String freq, String tweetName, int startTime, int endTime) {
        TreeMap<Integer, Integer> treeMap = map.get(tweetName);
        List<Integer> list = new ArrayList<>();

        int type = 0;
        switch (freq){
            case "minute":
                type = 60;
                break;
            case "hour":
                type = 3600;
                break;
            case "day":
                type = 3600 * 24;
        }

        int pos = (endTime - startTime) / type;
        for(int i = 0; i <= pos; i++){
            int count = 0;
            int next = startTime + (i + 1) * type > endTime ? endTime + 1 : startTime + (i + 1) * type;
            for(int e : treeMap.subMap(startTime + i * type, next).values()){
                count += e;
            }
            list.add(count);
        }

        return list;
    }
}
