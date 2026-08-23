class Solution {
    public int aggressiveCows(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        
        int low = 1;
        int high = arr[arr.length - 1] - arr[0];
        int mid;
        while(low <= high){
            mid = ((high - low) / 2) + low;
            
            int count = 1;
            int lastPlaced = 0;
            for(int i = 1; i < arr.length; i++){
                if(arr[i] - arr[lastPlaced] >= mid){
                    count++;
                    lastPlaced = i;
                    
                    if(count == k){
                        break;
                    }
                }
            }
            
            if(count < k){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        
        return high;
    }
}