package com.example.palindromcheckerwebapp.Util;

import java.util.ArrayList;
import java.util.List;

public class Util {

    public static List<String> getPalindrome(String str) {
        String[] words = str.toLowerCase().replace(" ", "").trim().split(",");

        List<String> palindromes = new ArrayList<>();
        
        for (int i = 0; i < words.length; i++) {

            StringBuilder reversedWord = new StringBuilder();

            reversedWord.append(words[i]);

            reversedWord = reversedWord.reverse();

            if (reversedWord.toString().equalsIgnoreCase(words[i])) {
                palindromes.add(reversedWord.toString());
            }

        }

        return palindromes;
    }

    public static List<String> getNonPalindrome(String str) {
        String[] words = str.toLowerCase().replace(" ", "").trim().split(",");

        List<String> notPalindrome = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {

            StringBuilder reversedWord = new StringBuilder();

            reversedWord.append(words[i]);

            reversedWord = reversedWord.reverse();

            if (!reversedWord.toString().equalsIgnoreCase(words[i])) {

                notPalindrome.add(words[i]);
            }
        }
        return notPalindrome;
    }
}
