int mid;
        int sum = 0;
        int result = 0;

        for(int candy : candies){
            
            high = Math.max(candy, high);
            sum += candy;
        }

        if(sum < k){
            return 0;
        }

        while(low <= high){
            mid = ((high - low) / 2) + low;

            long childern = 0;
            for(int candy : candies){
                childern += candy / mid;
            }

            if(childern > k){
                result = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return result;
    }
}