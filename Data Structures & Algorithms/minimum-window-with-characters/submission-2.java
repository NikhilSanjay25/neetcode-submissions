class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }
        HashMap<Character,Integer> map = new HashMap<>();
        int bLeft = -1;
        int bRight = -1;
        for (char a : t.toCharArray()) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        int l = 0 ;
        for(int r=0;r<s.length();r++){
            if(map.containsKey(s.charAt(r))){
                map.put(s.charAt(r),map.get(s.charAt(r))-1);
                boolean flag = true;
                for(int val:map.values()){
                    if(val>0){
                        flag=false;
                        break;
                    }
                }
                while(flag){
                    while(l <= r && !map.containsKey(s.charAt(l))){
                        l++;
                    }
                    if(bLeft == -1 || (r - l + 1) < (bRight - bLeft + 1)){
                        bLeft = l;
                        bRight = r;
                    }

                    

                    if(l > r) break;

                    map.put(s.charAt(l), map.get(s.charAt(l)) + 1);
                    l++;

                    flag = true;
                    for(int val : map.values()){
                        if(val > 0){
                            flag = false;
                            break;
                        }
                    }
                }
            }
        }
        if(bRight==-1){
            return "";
        }
        return s.substring(bLeft,bRight+1);
    }
}
