class Solution {
    public String largestOddNumber(String num) {
       String result = "";

        for(for int i = num.length()){
            if(c % 2 != 0){
                if(result == "" || c > result.charAt(0)){
                    result = Character.toString(c);
                }
            }
        }

        return result;
    }
}