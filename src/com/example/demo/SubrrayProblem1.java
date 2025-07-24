package src.com.example.demo;
//Problem Statement: Find a subarray with minimum sum
public class SubrrayProblem1 {
    public static void printAllSubarray(int arr[]){// practice to print all subarray
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){

                    System.out.print(arr[k]+" ");
                    
                }
                System.out.println();
                count++;
            }
        }
        System.out.println(count);

    }

    public static int minSumOfSubarray(int arr[]){// practice to minimum sum of subarray
        //Take two variables holding currentSubarrayMinSum value and smallestOverallSubarraySum value
        int currentSubarrayMinSum=arr[0];
        int smallestOverallSubarraySum=arr[0];
       // System.out.println(currentSubarrayMinSum);
        for(int i=1;i<arr.length;i++){
            int currentElement=arr[i];
            currentSubarrayMinSum=Math.min(currentElement,currentElement+currentSubarrayMinSum);
            smallestOverallSubarraySum=Math.min(smallestOverallSubarraySum,currentSubarrayMinSum);


        }
        return smallestOverallSubarraySum;
    }

    public static void main(String[] args){
        int arr[]={-2,5,1,8,10};
       //printAllSubarray(arr);
       System.out.println(minSumOfSubarray(arr));
       //minSumOfSubarray(arr);

    }



}
