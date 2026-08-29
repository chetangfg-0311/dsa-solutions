class Solution {
    class Pair{
        int freq;
        int alpha;

        Pair(int freq, int alpha){
            this.freq = freq;
            this.alpha = alpha;
        }
    }
    public String frequencySort(String s) {
        Comparator<Pair> comp = (o1,o2) -> o2.freq  o1.freq ?  1 : -1;

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        Pair[] pairs = new Pair[map.size()];
        int idx = 0;
        for(char c : map.keySet()){
            pairs[idx] = new Pair(map.get(c), c);
            idx++;
        }

        Arrays.sort(pairs, comp);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < pairs.length; i++){