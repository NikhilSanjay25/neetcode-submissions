class LRUCache {
    LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
    int maxcount=0;
    int count=0;
    public LRUCache(int capacity) {
        maxcount = capacity;
    }
    
    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        int value = map.get(key);
        map.remove(key);
        map.put(key, value);

        return value;
        
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
        map.remove(key);   // update + move to recent
    } 
    else if (map.size() == maxcount) {
        int firstKey = map.keySet().iterator().next();
        map.remove(firstKey);
    }

    map.put(key, value);
        
    }
}
