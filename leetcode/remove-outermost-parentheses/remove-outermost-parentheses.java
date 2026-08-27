n {
    public String removeOuterParentheses(String s) {
        int count = 0;
        int outerFirst = 0;
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) == '('){
                count++;
            }else{
                count--;
            }

            if(count == 0){
                System.out.println("count 0 index " + i);
                s  = s.substring(outerFirst + 1, i) + s.substring(i + 1);
                outerFirst = i + 1;
                i = i - 2;
            }
            i++;
        }

        return s;
    }
}