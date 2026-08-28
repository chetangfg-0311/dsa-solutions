for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }

            map.put(s.charAt(i), t.charAt(i));
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