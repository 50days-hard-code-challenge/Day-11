class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> set=new HashSet<>();
        int n=arr.length;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        for(int i=1;i<=arr[n-1]+k;i++)
        {
            if(!set.contains(i))
            {
                count++;
               
            }
            if(count==k)
                {
                    return i;
                }
        }
        return 0;
       
}    
}
