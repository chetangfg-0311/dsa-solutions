class Solution {
    public static int gcd(int a, int b) {
        // code here
        int low;
        int high;
        if ( a < b){
            low = a;
            high= b;
        }
        else{
            low = b;
            high = a;
        }
        int rem;
        while (high % low != 0){
            rem = high % low;
            high = low;
            low = rem;
        }
        return low;
    }
}