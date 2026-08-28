class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()){
            return false;
        }
        int arr[] = new int[26];
        
        for(int i = 0; i < s1.length(); i++){
            arr[s1.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < s1.length(); i++){
            arr[s2.charAt(i) - 'a']--;
        }
        
        
        for(int i : arr){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}