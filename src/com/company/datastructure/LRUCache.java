package com.company.datastructure;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
LRU cache means Least Recently Used Cache which removes the least recently used element if the cache is full
We refer to elements. If an element is consulted an already present in cache, it is moved to the beginning of cache.
If the element is not in cache, it's added to the front of the cache.
If cache is full and a new element is added, the LRU element has to be removed from the cache.
 */
public class LRUCache<T extends Comparable<T>> {
    private Set<T> cache;
    private int capacity;

    public LRUCache(int capacity) {
        this.cache = new LinkedHashSet<>(capacity);
        this.capacity = capacity;
    }

    public String display() {
        return this.cache.stream().sorted((a,b) -> -1).map(Objects::toString).collect(Collectors.joining(", "));
    }

    private boolean get(T elem) {
        if (!this.cache.contains(elem)) {
            return false;
        }
        this.cache.remove(elem);
        return this.cache.add(elem);
    }

    private void put(T elem) {
        if (this.capacity == this.cache.size()) {
            this.cache.remove(this.cache.iterator().next());
        }
        this.cache.add(elem);
    }

    public void refer(T elem) {
        if (!get(elem)) {
            put(elem);
        }
    }
}
