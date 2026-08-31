while(idx2 < s.length()){
            while(idx1 < s.length() && map1.size() <= k){
                map1.put(s.charAt(idx1), map1.getOrDefault(s.charAt(idx1), 0) + 1);
                
                if(map1.size() > k){
                    map1.remove(s.charAt(idx1));
                    break;
                }
                idx1++;
            }
            
            while(idx2 < s.length() && map2.size() < k){
                map2.put(s.charAt(idx2), map2.getOrDefault(s.charAt(idx2), 0) + 1);
                if(map2.size() == k){
                    map2.remove(s.charAt(idx2));
                    break;
                }
                idx2++;
            }
            
            while(map1.size() == k && map2.size() == k - 1){
                
                totalSubstrings += idx1 - idx2; 
                
                map1.put(s.charAt(idx), map1.get(s.charAt(idx)) - 1);
                map2.put(s.charAt(idx), map2.get(s.charAt(idx)) - 1);
                
                if(map1.get(s.charAt(idx)) == 0){
                    map1.remove(s.charAt(idx));
                }
                if(map2.get(s.charAt(idx)) == 0){
                    map2.remove(s.charAt(idx));
                }
                idx++;
            }
        }