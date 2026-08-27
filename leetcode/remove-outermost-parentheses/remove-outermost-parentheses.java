1class Solution {
2    public String removeOuterParentheses(String s) {
3        int count = 0;
4        int outerFirst = 0;
5        String ans = "";
6        for(int i = 0; i < s.length(); i++){
7            if(s.charAt(i) == '('){
8                count++;
9            }else{
10                count--;
11            }
12
13            if(count == 0){
14                System.out.println("count 0 index " + i);
15                ans  += s.substring(outerFirst + 1, i);
16                outerFirst = i + 1;
17            }
18        }
19
20        return ans;
21    }
22}