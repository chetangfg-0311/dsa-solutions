class Solution {
    
    public int solutionForK1(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        int totalSubstrings = 0;
        int idx1 = 0;
        int idx = 0;
        while(idx < str.length()){
            while(idx1 < str.length()){
                map.put(str.charAt(idx1), map.getOrDefault(str.charAt(idx1), 0) + 1);
                if(map.size() == 2){
                    map.remove(str.charAt(idx1));
                    break;
                }
                idx1++;
            }
            
            while(map.size() == 1){
                totalSubstrings += idx1 - idx;
                map.put(str.charAt(idx), map.get(str.charAt(idx)) - 1);
                
                if(map.get(str.charAt(idx)) == 0){
                    map.remove(str.charAt(idx));
                }
                idx++;
            }
        }
        
        return totalSubstrings;
    }
    public int countSubstr(String s, int k) {
        //  code here
        if(k == 1){
            return solutionForK1(s);
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();