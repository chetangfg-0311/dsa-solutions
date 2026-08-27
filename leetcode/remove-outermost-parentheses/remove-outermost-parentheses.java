class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        int outerFirst = 0;
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                count++;
            }else{
                count--;
            }

            if(count == 0){
                ans  += s.substring(outerFirst + 1, i) + s.substring(i + 1);
            }
        }

        return ans;
    }
}