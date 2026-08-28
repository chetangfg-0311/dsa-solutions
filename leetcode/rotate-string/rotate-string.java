class Solution { 
    public boolean rotateString(String s, String goal) { 
        int n = s.length(); 
        if (n != goal.length()) { 
            return false; 
        } 
        for (int i=0;i<n;i++) {
            boolean m = true; 
            for (int j=0; j<n;j++) { 
                int index=(i+j) % n; 
                if (s.charAt(index)!=goal.charAt(j)) { 
                    m=false; 
                    break; 
                } 
            } 
            if(m) { 
                return true; 
            } 
        } 
        return false; 
    } 
}