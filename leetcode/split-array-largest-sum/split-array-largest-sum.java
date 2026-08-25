long mid = 0;

        for (int num : nums){
            low = Math.min(low, num);
            high = Math.max(high, num);
        }

        while (low < high){
            mid = ((high - low) / 2) + low;
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
                
            }
        }
        
    }
}