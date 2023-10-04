def getSingleElement(arr : List[int]) -> int:
    # Write your code here.
    
    for i in range(0,len(arr)-1,2):
        if arr[i]!=arr[i+1]:
            return arr[i]
    return arr[-1]
