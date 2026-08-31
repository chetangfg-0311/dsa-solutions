esult = new StringBuilder();

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
            System.out
            result.append(s.substring(left + 1, right + 1));
        }

        return result.toString();
    }
}