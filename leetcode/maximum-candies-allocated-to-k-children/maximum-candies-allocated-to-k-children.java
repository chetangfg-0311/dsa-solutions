1class Solution {
2    public int maximumCandies(int[] candies, long k) {
3        int low = 1;
4        int high = 0;
5        int mid;
6        int sum = 0;
7        int result = 0;
8
9        for(int candy : candies){
10            
11            high = Math.max(candy, high);
12            sum += candy;
13        }
14
15        if(sum < k){
16            return 0;
17        }
18
19        while(low <= high){
20            mid = ((high - low) / 2) + low;
21
22            long childern = 0;
23            for(int candy : candies){
24                childern += candy / mid;
25            }
26
27            if(childern >= k){
28                low = mid + 1;
29                result = mid;
30            }else{
31                high = mid - 1;
32            }
33        }
34
35        return result;
36    }
37}