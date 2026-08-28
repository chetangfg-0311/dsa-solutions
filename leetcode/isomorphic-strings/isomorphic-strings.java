class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) )
        }
        return true;
    }
}