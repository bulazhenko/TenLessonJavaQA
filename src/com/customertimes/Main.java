package com.customertimes;

import java.util.Set;

//Homework:
//Прочитать данные из файла и с помощью Set'a посчитать количество уникальных слов в тексте.
// То есть вы сначала читаете текст построчно и сразу сплитите его по RegExp "\W+".
// Помещаете получанный массив в сэт. В конце вызываете у сэта нужный метод и узнаете количество уникальных слов.
//Из того же файла прочитать данные. С помощью Map посчитать все уникальные слова и их количество повторений в тексте.
// Например: "this" : 24 times, "and" - 50 times и тд

public class Main {
    public static void main(String[] args) {
        TaskOne.readFileContent("src\\com\\customertimes\\alice.txt");
        Set<String> resultSet = TaskOne.putTheArrayInSet();
        System.out.println("Unique words are: " + resultSet);
        System.out.println("Count of unique words: " + resultSet.size());
        TaskTwo.wordsCount();
    }
}