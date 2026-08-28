class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length() == 1){
            return strs[0];
        }
        
        Arrays.sort(strs);

        for(int i = 0; i < Math.min(strs[0].length(), strs[strs.length - 1].length()); i++){
            if(strs.charAt[0] != strs.charAt[strs.length - 1]){
                return ans;
            }
        }
    }
}