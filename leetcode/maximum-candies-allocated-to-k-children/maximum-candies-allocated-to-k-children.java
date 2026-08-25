class Solution {
    public int maximumCandies(int[] candies, long k) {
        int low = Integer.MAX_VALUE;
        int high = 0;
        int mid;

        for(int candy : candies){
            low = Math.min(candy, low);
            high = Math.max(candy, high);
        }

        while(low <= high){
            mid = ((high - low) / 2) + low;

            long childern = 0;
            for(int candy : candies){
                childern += candy / mid;
            }

            if(childern > k){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return low;
    }
}