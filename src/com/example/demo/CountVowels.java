package src.com.example.demo;

public class CountVowels {
    public static void main(String[] args){
        int count=0;
        String input="language";
        char[] c=input.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u' ){
                count++;
            }

        }
        System.out.println(count);
    }

}
