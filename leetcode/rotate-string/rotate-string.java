1class Solution {
2    public boolean rotateString(String s, String goal) {
3
4        if(s.length() != goal.length()){
5            return false;
6        } 
7        s = s+s;
8
9        if(s.contains(goal)){
10            return true;
11        }
12
13        return false;
14    }
15}