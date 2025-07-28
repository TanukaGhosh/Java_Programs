package src.com.example.demo;

import java.util.Arrays;
import java.util.Collections;


public class ReverseWordsInAString {
    public static String reverseWords(String input){
        String[] words=input.trim().split(" ");
        Collections.reverse(Arrays.asList(words));
       return String.join(" ",words);
    }

    public static void main(String[] args){
    System.out.println(reverseWords("I Love Java"));


    }
    
}
