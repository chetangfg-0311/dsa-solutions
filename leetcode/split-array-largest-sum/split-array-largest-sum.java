x(high, num);
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
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return (int)low;
    }
}