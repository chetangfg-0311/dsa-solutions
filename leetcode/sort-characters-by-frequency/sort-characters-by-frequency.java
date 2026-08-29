1class Solution {
2    class Pair{
3        int freq;
4        int alpha;
5
6        Pair(int freq, int alpha){
7            this.freq = freq;
8            this.alpha = alpha;
9        }
10    }
11    public String frequencySort(String s) {
12        Comparator<Pair> comp = (o1,o2) -> o2.freq > o1.freq ?  1 : -1;
13
14        HashMap<Character, Integer> map = new HashMap<>();
15
16        for(char c : s.toCharArray()){
17            map.put(c, map.getOrDefault(c,0) + 1);
18        }
19
20        Pair[] pairs = new Pair[map.size()];
21        int idx = 0;
22        for(char c : map.keySet()){
23            pairs[idx] = new Pair(map.get(c), c);
24            idx++;
25        }
26
27        Arrays.sort(pairs, comp);
28        StringBuilder sb = new StringBuilder();
29        for(int i = 0; i < pairs.length; i++){
30            int frequency = pairs[i].freq;
31            while (frequency != 0){
32                sb.append((char) pairs[i].alpha);
33                frequency--;
34            }
35        }
36
37        return sb.toString();
38    }
39}