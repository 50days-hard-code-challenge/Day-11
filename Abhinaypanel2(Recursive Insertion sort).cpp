#include<bits/stdc++.h>
using namespace std;
void solve(int arr[],int &i,int n){
    if(i>n-1){
        return;
    }
    int j=i++;
    while(arr[j]<arr[j-1]&&j>0){
        swap(arr[j],arr[j-1]);
        j--;
    }
    solve(arr,i,n);
}
void insertionSort(int arr[], int n)
{
    //write your code here
    int i=0;
    solve(arr,i,n);
}
