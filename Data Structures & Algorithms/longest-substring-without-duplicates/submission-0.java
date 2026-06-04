class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hash = new HashSet<>();
        int l = 0;
        int r = 0;
        int max =0;
        if(s.length()==0||s.length()==1){
            return s.length();
        }
        while(r<s.length()){
            if(hash.contains(s.charAt(r))){
                while(hash.contains(s.charAt(r))){
                    hash.remove(s.charAt(l));
                    l++;
                }
                hash.add(s.charAt(r));
                r++;
                max = Math.max(max,hash.size());
            }
            else{
                hash.add(s.charAt(r));
                r++;
                max = Math.max(max,hash.size());
            }
        }
        return max;
    }
}
