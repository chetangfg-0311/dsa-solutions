1class Solution {
2    public int maxDepth(String s) {
3        int count = 0;
4        int ans = 0;
5
6        for(int i = 0; i < s.length(); i++){
7            if(s.charAt(i) == '('){
8                count++;
9                ans = Math.max(ans, count);
10            }
11            else if(s.charAt(i) == ')'){
12                count--;
13            }
14        }
15
16        return ans;
17    }
18}