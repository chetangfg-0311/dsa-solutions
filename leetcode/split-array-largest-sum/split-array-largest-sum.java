class Solution {
    public int splitArray(int[] nums, int k) {
        long low = Integer.MAX_VALUE;
        long high = 0;
        long mid = 0;

        for (int num : nums){
            low = Math.min(low, num);
            high = Math.max(high, num);
        }

        while (low < high){
            mid = ((high - low) / 2) + low;
            long sum = 0;
            int 
            for(int num : nums){
                sum += num;

                if(sum > mid){
                    sum = num;

                }
            }
        }
        
    }
}