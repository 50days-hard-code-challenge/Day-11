import java.util.HashSet;
public class Solution {
    public static String moreSubsequence(int n, int m, String a, String b) {
        // Write your code here
        HashSet<String>set1 = new HashSet<>();
        HashSet<String>set2 = new HashSet<>();
        helper1(0,"",a,n,set1);
        helper2(0,"",b,m,set2);
        if(set1.size()>=set2.size()){
            return a;
        }
        else{
            return b;
        }
    }
    public static void helper1(int i, String current,String a,int n,HashSet<String> set1){
           // Base case 
           if(i == n){
               set1.add(current);
               return;
           }
           char ch = a.charAt(i);
           // pick the character and move ahead
           helper1(i+1,current+ch,a,n,set1);
           // do not pick the character and move ahead
           helper2(i+1,current,a,n,set1);
    }
     public static void helper2(int i, String current,String b,int m,HashSet<String>set2){
         // Base case 
           if(i == m){
               set2.add(current);
               return;
           }
           char ch = b.charAt(i);
           // pick the character and move ahead
           helper1(i+1,current+ch,b,m,set2);
           // do not pick the character and move ahead
           helper2(i+1,current,b,m,set2);
    }
}



// Optimised solution 



import java.util.HashMap;
public class Solution {
    public static String moreSubsequence(int n, int m, String a, String b) {
        // Write your code here
        int A = countSubsequences(a,n);
        int B = countSubsequences(b,m);
        if(A>=B){
            return a;
        }else{
            return b;
        }

    }
    public static int countSubsequences(String a,int n){
        HashMap<Character,Integer> map = new HashMap<>();
        int count = 1;
        for(int i = 0; i<n; i++){
            char ch = a.charAt(i);
            if(map.containsKey(ch)){
               // if duplicate character contains then get the value at given character
               int temp = map.get(ch);
                map.put(ch,count);
               count = count*2;
               count = count - temp; 
            }
            else{
                map.put(ch, count);
                count = count*2;
            }
        }
        return count;

    }
}

