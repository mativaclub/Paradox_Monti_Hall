package ru.maria;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Game[] games = new Game[1000];
        HashMap<Integer, Boolean> hashMap = new HashMap<>();

        for (int i = 0; i < 1000; i++) {
            games[i] = new Game();
            boolean result = games[i].gameResult(true);
            hashMap.put(i, result);
        }

        Map<Integer, Boolean> heavens = hashMap.entrySet().stream()
                .filter(Map.Entry::getValue)
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));

        System.out.println(heavens.size());

    }
}