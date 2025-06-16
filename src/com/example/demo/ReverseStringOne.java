package src.com.example.demo;

public class ReverseStringOne {
    public static void main(String[] args){
        String s="Tanuka";
        int length=s.length();
        char[] c=s.toCharArray();
        for(int i=length-1;i>=0;i--){
            System.out.print(c[i]);
        }

    }

}
