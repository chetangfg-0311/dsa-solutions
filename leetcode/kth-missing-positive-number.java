1class Solution {
2    public int findKthPositive(int[] arr, int k) {
3        int low = 0;
4        int high = arr.length - 1;
5        int mid;
6
7        if(k < arr[0]){
8            return k;
9        }
10
11        if(k == 1 && arr[0] != 1){
12            return 1;
13        }
14
15        while(low <= high){
16            mid = ((high - low) / 2) + low;
17            int missingNo = arr[mid] - mid - 1;
18
19            if(missingNo >= k){
20                high = mid - 1;
21            }else{
22                low = mid + 1;
23            }
24        }
25        int ans = arr[high] + k - (arr[high] - high - 1);
26        return ans;
27    }
28}