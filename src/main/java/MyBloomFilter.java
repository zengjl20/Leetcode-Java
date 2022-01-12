import java.util.BitSet;

public class MyBloomFilter {

    private static final int DEFAULT_SIZE = 2 << 24;

    private static final int[] SEEDS = new int[]{3, 13, 45, 56, 134};

    private BitSet bits = new BitSet(DEFAULT_SIZE);

    private SimpleHash[] func = new SimpleHash[SEEDS.length];

    public MyBloomFilter() {
        for(int i = 0; i < SEEDS.length; i++) {
            func[i] = new SimpleHash(DEFAULT_SIZE, SEEDS[i]);
        }
    }

    public void add(Object value) {
        for(SimpleHash fun : func) {
            bits.set(fun.hash(value), true);
        }
    }

    public boolean contains(Object value) {
        boolean res = true;
        for(SimpleHash f : func) {
            if(!bits.get(f.hash(value))) res = false;
        }
        return res;
    }

    public static class SimpleHash {

        private int cap;
        private int seed;

        public SimpleHash(int cap, int seed) {
            this.cap = cap;
            this.seed = seed;
        }

        /**
         * 计算 hash 值
         */
        public int hash(Object value) {
            int h;
            return (value == null) ? 0 : Math.abs(seed * (cap - 1) & ((h = value.hashCode()) ^ (h >>> 16)));
        }

    }
}
