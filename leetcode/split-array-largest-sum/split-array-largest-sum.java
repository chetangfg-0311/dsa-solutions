class Solution {
    public int splitArray(int[] nums, int k) {
        if(k>nums.length){
            return -1;
        }
        int sum=0;
        int max=0;
        for(int x:nums){
            if(x>max){
                max=x;
            }
            sum+=x;
        }
        if(k==nums.length){
            return max;
        }
        int l=max,h=sum;
        int res=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(ispossible(nums,k,mid)){
                res=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
          return res;
        }
        public boolean ispossible(int[] nums,int k,int mid){
            int stu=0;
            int student=1;
            for(int i=0;i<nums.length;i++){
                if(stu+nums[i]<=mid){
                    stu=stu+nums[i];
                }
                else{
                    student++;
                     stu=nums[i];
                    if(student>k){
                        return false;
                    }
                }
            }
            return true;
        }
}