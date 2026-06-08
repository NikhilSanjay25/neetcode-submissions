class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        int count = 0;
        int l = 0;
        for(int r=0;r<s2.length();r++){
            if(r-l+1 > s1.length()){
                if(map.containsKey(s2.charAt(l))){
                    map.put(s2.charAt(l),map.get(s2.charAt(l))+1);
                    l++;
                }
                else{
                    l++;
                }
            }
            if(map.getOrDefault(s2.charAt(r),-1001)!=-1001){

                map.put(s2.charAt(r),map.get(s2.charAt(r))-1);
                boolean flag = true;
                for (Integer value : map.values()) {
                    if (value != null && value!=0) {
                        flag = false;
                    }
                }
                if(flag){
                    return true;
                }
            }
            
        }
        return false;
    }
}
