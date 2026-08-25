1class Solution {
2    public int maximumCandies(int[] candies, long k) {
3        int low = 1;
4        int high = 0;
5        int mid;
6        int sum = 0;
7
8        for(int candy : candies){
9            
10            high = Math.max(candy, high);
11            sum += candy;
12        }
13
14        if(sum < k){
15            return 0;
16        }
17
18        while(low <= high){
19            mid = ((high - low) / 2) + low;
20
21            long childern = 0;
22            for(int candy : candies){
23                childern += candy / mid;
24            }
25
26            if(childern > k){
27                low = mid + 1;
28            }else{
29                high = mid - 1;
30            }
31        }
32
33        return low;
34    }
35}