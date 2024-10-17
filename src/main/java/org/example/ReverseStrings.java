package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStrings {
    public static void main(String[] args) {
        String s = "  the sky   is blue";
//        String k = "   fffff ff gg ee";
        String k = " asdasd df f";
        System.out.println(reverseWords1(k));

    }
    public static String reverseWords1(String s) {
        // remove leading spaces
        s = s.trim();
        // split by multiple spaces
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }
    public static String reverseWords(String s) {
        List<String> str = new ArrayList<String>();
        StringBuilder rs = new StringBuilder();
        int len = s.length();
        System.out.println(len);
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) != ' ' && i <= s.length() - 1){
                int k = i+1;
                if(k != len) {
                    while (s.charAt(k) != ' ' && k <= s.length() - 1) {
                        k++;
                        if(k == len) {
                            break;
                        }
                        System.out.println("k::" + k);
                        System.out.println("length" + (len - 1));
                    }
                }
                System.out.println("substring" + i + " " + k);
                str.add(s.substring(i,k));
                System.out.println("str:::" + str);
                i = k;
            }
        }
        System.out.println(str.toString());
        for(int i = str.size()-1; i>=0 ; i--){
            rs.append(str.get(i));
            if(i!= 0){
                rs.append(" ");}
        }
        return rs.toString();

    }
}