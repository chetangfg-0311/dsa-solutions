ution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        int left = s.length() - 1;
        int right = left;

        while(left > -1){
            while(left > -1 && s.charAt(left) == ' '){
                left--;
            }
            right = left + 1;

            while(left > -1 && s.charAt(left) != ' '){
                left--;
            }
            System.out.println("Left = " + left + " Right = " + right);
            if(left + 1 != r