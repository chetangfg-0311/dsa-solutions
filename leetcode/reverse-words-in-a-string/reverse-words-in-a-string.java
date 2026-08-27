class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int endIdx = s.length();

        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == ' ' && i != endIdx){
                result.append(s.substring(i + 1, endIdx));
                endIdx = i;
            }
        }

        return result.toString();
        }
}