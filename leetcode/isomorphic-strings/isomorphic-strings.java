1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        if(s.length() != t.length()){
4            return false;
5        }
6        HashMap<Character, Character> mapS = new HashMap<>();
7
8        for(int i = 0; i < s.length(); i++){
9            if(mapS.containsKey(s.charAt(i)) && mapS.get(s.charAt(i)) != t.charAt(i)){
10                return false;
11            }
12
13            mapS.put(s.charAt(i), t.charAt(i));
14        }
15
16        HashMap<Character, Character> mapT = new HashMap<>();
17
18        for(int i = 0; i < s.length(); i++){
19            if(mapT.containsKey(t.charAt(i)) && mapT.get(t.charAt(i)) != s.charAt(i)){
20                return false;
21            }
22
23            mapT.put(t.charAt(i), s.charAt(i));
24        }
25        
26        return true;
27    }
28}