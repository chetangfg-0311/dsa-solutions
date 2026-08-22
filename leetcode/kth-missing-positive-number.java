1class Solution {
2    public int findKthPositive(int[] arr, int k) {
3        int n=arr.length;
4        for(int num:arr){
5            if(num<=k)  k++;
6            else  break;
7        }
8        return k;
9    }
10}