class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int endIdx = s.length() - 1;

        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charat(i) == ' ' && i != endIdx){
                result.append(s.subString())
            }
        }
    }
}