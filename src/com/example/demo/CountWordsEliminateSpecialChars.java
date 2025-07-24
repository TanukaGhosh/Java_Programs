package src.com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class CountWordsEliminateSpecialChars {
    public static void main(String[] args){
    String input="Hello!! This is Tanuka, I stay at Bangalore.";
    HashMap<String,Integer> hm=new HashMap<>();

    for(String word:input.split("[\\s,.!]+")){
        hm.put(word, hm.getOrDefault(word, 0)+1);

    }
    for(Map.Entry<String,Integer> entry:hm.entrySet()){
        System.out.println("Words: "+entry.getKey()+" : "+entry.getValue());

    }
}


}
