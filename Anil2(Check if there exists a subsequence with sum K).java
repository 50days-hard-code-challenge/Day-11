public class Solution {
    public static boolean isSubsetPresent(int n, int k,int []a) {
        // Write your code here
        return isSubsetPresent(0, n, k, a, 0);
        
    }
    public static boolean isSubsetPresent(int i,int n, int k, int []a,int sum){
           if(i == n){
               if(sum == k){
                   return true;
               }
               else{
                   return false;
               }
           }
           if(sum>k){
               return false;
           }
           if(sum == k){
               return true;
           }
           // pick the elment
          return isSubsetPresent(i+1, n, k, a, sum+a[i]) || isSubsetPresent(i+1, n, k, a, sum);
           // Do not pick the element
           
    }
}
