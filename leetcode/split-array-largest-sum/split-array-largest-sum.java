class Solution {
    public int splitArray(int[] nums, int k) {
        long low = 0;
        long high = 0;
        long mid;

        for (int num : nums){
            low = Math.max(num, low);
            high += num ;
        }

        while (low <= high){
            mid = ((high - low) / 2) + low;
            System.out.println(mid);
            long sum = 0;
            int subArrays = 1;
            for(int num : nums){
                sum += num;

                if(sum > mid){
                    sum = num;
                    subArrays++;
                }
            }

            if(subArrays > k){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return (int)low;