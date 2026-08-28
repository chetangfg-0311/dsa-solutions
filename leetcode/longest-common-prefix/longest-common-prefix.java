class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length() == 1){
            return strs[0];
        }
        StringBuilder ans = new StringBuilder();
        
        Arrays.sort(strs);

        for(int i = 0; i < Math.min(strs[0].length(), strs[strs.length - 1].length()); i++){
            if(strs[i].charAt[] != strs[i].charAt[i]){
                return ans.toString();
            }
            ans.append(strs[0])
        }
    }
}