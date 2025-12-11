package com.pluralsight.Week7.CustomCollections;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private List<T> items;
    private int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();

    }
    // + add(item: T)
    public boolean add(T item) {
        // Modify the add method to ensure that your list cannot grow bigger than the maxSize
        if (items.size() < maxSize) {
            items.add(item);
            return true;
        }
        return false;

        }
        public List<T> getItems() {
        return this.items;
    }
}
