class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length() == 1){
            return strs[0];
        }
        StringBuilder ans = new StringBuilder();
        
        Arrays.sort(strs);

        for(int i = 0; i < Math.min(strs[0].length(), strs[strs.length - 1].length()); i++){
            if(strs[i].charAt[i] != strs[str].charAt[i]){
                return ans.toString();
            }
            ans.append(strs[0])
        }
    }
}