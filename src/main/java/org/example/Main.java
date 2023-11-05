package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 5, 1, 2, 7, 3, 4, 4, 5, 5, 6, 9, 7));
        printOddNumbers(nums);
        printEvenNumbers(nums);
        List<String> words = new ArrayList<>(List.of("abs", "abc", "abb", "add", "ads", "asd", "ads"));
        printWords(words);
        printDoubles(words);
    }

    public static void printOddNumbers(List<Integer> nums) {
        System.out.println("Задача 1");
        for (Integer num : nums)
            if (num % 2 != 0)
                System.out.println(num);
    }

    public static void printEvenNumbers(List<Integer> nums) {
        System.out.println("Задача 2");
        Collections.sort(nums);
        int prevNum = Integer.MIN_VALUE;
        for (Integer num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.println(num);
                prevNum = num;
            }
        }
    }

    public static void printWords(List<String> words) {
        System.out.println("Задача 3");
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }

    public static void printDoubles(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(words.size() - uniqueWords.size());
    }
}

