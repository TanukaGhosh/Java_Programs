package src.com.example.demo;

public class LongestEvenLengthWord {
    public static String longestEvenLengthWord(String input){
        String words[]=input.split(" ");
        int maxLength=0;
        String longestEvenWord=null;
        for(String word: words){
            if(word.length()%2==0 && word.length()>maxLength){
                maxLength=word.length();
                longestEvenWord=word;

            }
        }
        return longestEvenWord;

    }
    public static void main(String[] args){
        String sentence="I will write great java code";
        System.out.println(shortestEvenLengthWord(sentence));
    }

    public static String longestOddLengthWord(String input){
        String words[]=input.split(" ");
        int maxLength=0;
        String longestOddWord=null;
        for(String word: words){
            if(word.length()%1==0 && word.length()>maxLength){
                maxLength=word.length();
                longestOddWord=word;

            }
        }
        return longestOddWord;

    }
    public static String shortestOddLengthWord(String input){
        String words[]=input.split(" ");
        int maxLength=Integer.MAX_VALUE;
        String shortestOddWord=null;
        for(String word: words){
            if(word.length()%1==0 && word.length()<maxLength){
                maxLength=word.length();
                shortestOddWord=word;

            }
        }
        return shortestOddWord;

    }
    public static String shortestEvenLengthWord(String input){
        String words[]=input.split(" ");
        int maxLength=Integer.MAX_VALUE;
        String shortestEvenWord=null;
        for(String word: words){
            if(word.length()%2==0 && word.length()<maxLength){
                maxLength=word.length();
                shortestEvenWord=word;

            }
        }
        return shortestEvenWord;

    }

    
}
