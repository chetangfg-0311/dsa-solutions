class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Character> mapS = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(mapS.containsKey(s.charAt(i)) && mapS.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }

            mapS.put(s.charAt(i), t.charAt(i));
        }

        HashMap<Character, Character> mapT = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(t.charAt(i)) && map.get(t.charAt(i)) != s.charAt(i)){
                return false;
            }

            map.put(t.charAt(i), s.charAt(i));
        }
        
        return true;
    }
}