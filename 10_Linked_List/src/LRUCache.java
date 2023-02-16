import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LRUCache {
    class Cache {
        int value;
        int cnt;
        private Cache(int value, int cnt){
            this.value = value;
            this.cnt = cnt;
        }
    }
    private Map<Integer, Cache> lru;
    int size;
    public LRUCache(int capacity) {
        lru = new HashMap<>();
        size = capacity;
    }
    
    public int get(int key) {
        Cache cache = lru.getOrDefault(key, null);
        if (cache == null){
            return -1;
        }
        cache.cnt++;
        return cache.value;
    }
    
    public void put(int key, int value) {
        Cache cache = lru.getOrDefault(key, new Cache(value, 0));
        cache.cnt++;
        if (lru.size() == size){
            Set rmKey = lru.keySet();
            Object[] arr = rmKey.toArray();
            Object ans = arr[0];
            for (Object keys : rmKey){
                if (lru.get(ans).cnt > lru.get(keys).cnt){
                    ans = keys;
                }
            }
            lru.remove(ans);

        }
        lru.put(key, cache);
    }
    public static void main(String[] args){
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        lruCache.get(1);
        lruCache.put(3, 3);
        lruCache.get(2);
        lruCache.put(4, 4);
        lruCache.get(1);
        lruCache.get(3);
        lruCache.get(4);

    }
}
