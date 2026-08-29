class Solution {
    public int myAtoi(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) >='0' && s.charAt(i) <= '9')){
                sb.append(s.charAt(i));
            }
            else if(s.charAt(i) == '-' || s.charAt(i) == '+'){
                sb.append(s.charAt(i));
                break;
            }
        }

        String str = sb.toString();

        System.out.println(str);
        return -1;