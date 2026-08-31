tring s) {
        StringBuilder result = new StringBuilder();

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
            result.append(s.substring(left + 1, right) + " ");
        }

        return result.toString();
    }
}