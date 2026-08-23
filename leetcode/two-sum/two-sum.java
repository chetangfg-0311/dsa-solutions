1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int [] res = new int[2];
4        HashMap<Integer, Integer> map = new HashMap();
5
6        for(int i = 0; i < nums.length; i++){
7            if(map.containsKey(target - nums[i])){
8                res[0] = map.get(target - nums[i]);
9                res[1] = i;
10            }
11            map.put(nums[i], i);
12        }
13
14        return res;
15    }
16}