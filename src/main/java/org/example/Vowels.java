package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vowels {

    public static void main(String[] args) {
//        System.out.println("Hey");
        reverseVowels("hello");
    }

    public static void reverseVowels(String s) {
        List<Character> vowels = Arrays.asList('A','E','I','O','U','a','e','i','o','u');
        char[] ch = s.toCharArray();
        List<Character> vowelsInString = new ArrayList<>();
        int count = 0;
        for(char c : ch){
//            System.out.println(c);
            if(vowels.contains(c)){
                vowelsInString.add(c);
                count++;
                System.out.println("count::  " + count);
            }
        }
        System.out.println(vowelsInString.size());
        System.out.println(vowelsInString.get(vowelsInString.size()-1));

        for(int i = 0; i < ch.length; i++){
            if(vowels.contains(ch[i])){
                ch[i] = vowelsInString.get(count-1);
                count--;
                System.out.println(count);
            }
        }
        System.out.println(toString(ch));
    }

    public static String toString(char[] s) {
        String s1 = new String(s);
        return s1;
    }
}
