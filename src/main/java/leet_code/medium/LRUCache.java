package leet_code.medium;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/lru-cache/">here</a>
 */
class LRUCache extends LinkedHashMap<Integer, Integer> {

    private final int capacity;

    public LRUCache(int capacity) {
        super(16, 0.75f, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > this.capacity;
    }
}
