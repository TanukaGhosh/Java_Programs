//Count the number of prime numbers less than a non-negative number, n.
// Sample Input 1
// 10

// Sample Output 1
// 4

// Explanation
// There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
package src.com.example.demo;

public class CountNumberOfPrimeNumbers {
    public static boolean isPrime(int input){
      if(input<=1)
      return false;
      for(int i=2;i<input;i++){
            if(input%i==0){
                  return false;
            }

      }
      return true;

}
public static void main(String[] args){
int input=10;
int count=0;
for(int i=2;i<input;i++){
      if(isPrime(i)){
            count++;
      }
}
System.out.println(count);
      
      
}

}
