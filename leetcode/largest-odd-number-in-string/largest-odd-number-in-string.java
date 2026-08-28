class Solution {
    public String largestOddNumber(String num) {
       String result = "";

        for(char c : num.toCharArray()){
            if(c % 2 != 0){
                if(result == "" || c > result.charAt(0)){
                    result = Character.toString(c);
                }
            }
        }

        
    }
}