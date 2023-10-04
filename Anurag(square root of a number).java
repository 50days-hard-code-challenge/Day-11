import java.util.* ;
import java.io.*; 

public class Solution {

	public static int sqrtN(long N) {
		/*
		 * Write your code here
		 */
		
		 if(N<2)
		 {
			 return (int) N;
		 }
		 long i=1;
		 long j=N;
		 while(i<=j)
		 {
			 long mid=(i+j)/2;
			 if(mid*mid==N)
			 {
				 return (int)mid;
			 }
			 if(mid*mid<=N)
			 {
				 i=mid+1;
			 }
			 else
			 {
				 j=mid-1;
			 }

		 }
		 return (int)j;

	}
}
