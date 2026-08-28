p<>();

        for(int i = 0; i < s.length(); i++){
            if(mapS.containsKey(s.charAt(i)) && mapS.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }

            mapS.put(s.charAt(i), t.charAt(i));
        }

        HashMap<Character, Character> mapT = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(mapT.containsKey(t.charAt(i)) && mapT.get(t.charAt(i)) != s.charAt(i)){
                return false;
            }

            mapT.put(t.charAt(i), s.charAt(i));
        }
        
        return true;
    }
}