package com.customertimes;

import java.util.HashMap;
import java.util.Set;

public class TaskTwo extends TaskOne {
    public static void wordsCount() {
        String[] words = content.split("\\W+");
        HashMap<String, Integer> uniqueWordsCount = new HashMap<>();

        Set<String> uniqueWords = putTheArrayInSet();
        for (String uniqueWord : uniqueWords) {
            int count = 0;
            for (String word : words) {
                if (word.equals(uniqueWord))
                    count++;
            }
            uniqueWordsCount.put(uniqueWord, count);
        }
        System.out.println("Count of Unique Duplicated Words: " + uniqueWordsCount.toString());
    }
}