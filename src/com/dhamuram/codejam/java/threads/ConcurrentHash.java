package com.dhamuram.java.codejam.java.threads;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHash {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("tree", 30);

        System.out.println("Map : " + map.toString());

    }
}
