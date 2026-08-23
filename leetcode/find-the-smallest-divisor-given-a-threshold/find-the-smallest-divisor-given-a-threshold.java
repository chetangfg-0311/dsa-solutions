mid = ((high - low) / 2) + low;
            int sumDivisor = 0;

            for(int i = 0; i < nums.length; i++){
                if(nums[i] % mid == 0){
                    sumDivisor += nums[i] / mid;
                }else{
                    sumDivisor += (nums[i] / mid) + 1;
                }
            }

            if(sumDivisor > threshold){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return low;
    }
}