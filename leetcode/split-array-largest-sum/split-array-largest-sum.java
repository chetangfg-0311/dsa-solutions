1class Solution {
2    public int splitArray(int[] nums, int k) {
3        long low = 0;
4        long high = 0;
5        long mid;
6
7        for (int num : nums){
8            low = Math.max(num, low);
9            high += num ;
10        }
11
12        while (low <= high){
13            mid = ((high - low) / 2) + low;
14            System.out.println(mid);
15            long sum = 0;
16            int subArrays = 1;
17            for(int num : nums){
18                sum += num;
19
20                if(sum > mid){
21                    sum = num;
22                    subArrays++;
23                }
24            }
25
26            if(subArrays > k){
27                low = mid + 1;
28            }else{
29                high = mid - 1;
30            }
31        }
32        return (int)low;
33    }
34}