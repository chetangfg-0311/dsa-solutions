1);
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
            int frequency = pairs[i].freq;
            while (frequency != 0){
                sb.append(pairs[i].alpha);
                frequency--;
            }
        }
    }
}