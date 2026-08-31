1class Solution {
2    public String reverseWords(String s) {
3        StringBuilder sb = new StringBuilder();
4
5        int left = s.length() - 1;
6        int right = left;
7
8        while(left > -1){
9            while(left > -1 && s.charAt(left) == ' '){
10                left--;
11            }
12            right = left + 1;
13
14            while(left > -1 && s.charAt(left) != ' '){
15                left--;
16            }
17            System.out.println("Left = " + left + " Right = " + right);
18            if(left + 1 != right){
19                sb.append(s.substring(left + 1, right) + " ");
20            }
21        }
22
23        String result = sb.toString();
24        return result.substring(0, result.length() - 1);
25    }
26}