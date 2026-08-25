1class Solution {
2    public int splitArray(int[] nums, int k) {
3        long low = nums[0];
4        long high = 0;
5        long mid = 0;
6
7        for (int num : nums){
8            high += num ;
9        }
10
11        while (low < high){
12            mid = ((high - low) / 2) + low;
13            long sum = 0;
14            int subArrays = 1;
15            for(int num : nums){
16                sum += num;
17
18                if(sum > mid){
19                    sum = num;
20                    subArrays++;
21                }
22            }
23
24            if(subArrays > k){
25                low = mid + 1;
26            }else{
27                high = mid - 1;
28            }
29        }
30        return (int)low;
31    }
32}