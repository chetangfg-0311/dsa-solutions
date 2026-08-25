class Solution {
    public int splitArray(int[] nums, int k) {

        int minPossible = nums[0];
        int maxPossible = 0;

        int i=0;
        while(i< nums.length){
            minPossible = Math.max(minPossible, nums[i]);
            maxPossible += nums[i];
            i++;
        }

        int left = minPossible;
        int right = maxPossible;

        while(left < right){
            int mid = left + (right - left)/2;

            if(countSubarrays(nums, mid) <=k ){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }

        return left;
    }

    private int countSubarrays(int[] nums, int maxAllowedSum){

        int partitions = 1;
        int i = 0;
        int sum = 0;
        while(i < nums.length){
            sum = sum + nums[i];
            if(sum > maxAllowedSum){
                sum = nums[i];
                partitions += 1;
            }
            i++;

         }

        return partitions;

    }

    
}