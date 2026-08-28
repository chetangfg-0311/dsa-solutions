class Solution {
    public boolean rotateString(String s, String goal) {
        s = s+s;

        if(s.contan(goal)){
            return true;
        }

        return false;
    }
}