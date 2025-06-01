package src.com.example.demo;

class StringPalindrome{
public boolean stringPalindrome(String str){
    
    String lower=str.toLowerCase();
    
    int left=0;
    int right= str.length()-1;
    while(left<right){
        if(lower.charAt(left)!=lower.charAt(right)){
            return false;

        }
        left++;
        right--;
    }

    return true;

}
public static void main(String[] args){
String str="madam";
StringPalindrome sp= new StringPalindrome();
System.out.println(sp.stringPalindrome(str));
}

}