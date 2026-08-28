class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)){
            return true;
        }
        String A =""+s.charAt(0);
        String answer = "";
        for(int i = 1;i<s.length();i++){
            answer = s.substring(i,s.length())+A;
            if(answer.equals(goal)){
                return true;
            }
            A = A+s.charAt(i);
        }
        return false;
    }
}