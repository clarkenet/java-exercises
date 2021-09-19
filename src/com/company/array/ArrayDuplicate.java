package com.company.array;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//Accepts any Comparable object (Integer, Double, String, etc.)
public class ArrayDuplicate<T extends Comparable<T>> {
    //Cannot be static because of the parametrized types
    public List<T> removeDuplicates(List<T> list) {
        Set<T> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);
        return list;
    }
}
