1class Solution {
2    public boolean rotateString(String s, String goal) {
3        s = s+s;
4
5        if(s.contains(goal)){
6            return true;
7        }
8
9        return false;
10    }
11}