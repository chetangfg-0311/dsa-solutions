1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3
4        if(strs.length == 1){
5            return strs[0];
6        }
7        StringBuilder ans = new StringBuilder();
8        
9        Arrays.sort(strs);
10
11        for(int i = 0; i < Math.min(strs[0].length(), strs[strs.length - 1].length()); i++){
12            if(strs[0].charAt(i) != strs[strs.length - 1].charAt(i)){
13                return ans.toString();
14            }
15            ans.append(strs[0].charAt(i));
16        }
17
18        return ans.toString();
19    }
20}