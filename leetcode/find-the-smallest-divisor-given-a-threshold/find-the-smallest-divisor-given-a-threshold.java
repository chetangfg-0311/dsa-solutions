1class Solution {
2    public int smallestDivisor(int[] nums, int threshold) {
3        int low = 1;
4        int high = 1;
5        int mid;
6
7        for(int num : nums){
8            high = Math.max(num, high);
9        }
10
11        while (low <= high){
12            mid = ((high - low) / 2) + low;
13            int sumDivisor = 0;
14
15            for(int i = 0; i < nums.length; i++){
16                if(nums[i] % mid == 0){
17                    sumDivisor += nums[i] / mid;
18                }else{
19                    sumDivisor += (nums[i] / mid) + 1;
20                }
21            }
22
23            if(sumDivisor > threshold){
24                low = mid + 1;
25            }else{
26                high = mid - 1;
27            }
28        }
29
30        return low;
31    }
32}