1class Solution {
2    public int romanToInt(String s) {
3        HashMap<Character, Integer> map = new HashMap<>();
4
5        map.put('I', 1);
6        map.put('V', 5);
7        map.put('X', 10);
8        map.put('L', 50);
9        map.put('C', 100);
10        map.put('D', 500);
11        map.put('M', 1000);
12
13        int sum = map.get(s.charAt(s.length() - 1));
14
15        for(int i = s.length() - 2; i >= 0; i--){
16            if(map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))){
17                sum += map.get(s.charAt(i));
18            }
19            else{
20                sum -= map.get(s.charAt(i));
21            }
22        }
23
24        return sum;
25    }
26}