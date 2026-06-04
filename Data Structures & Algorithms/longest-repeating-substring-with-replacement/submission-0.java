class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hash = new HashMap<>();
        int l=0;
        int count = 0;
        int max = 0;
        if(k==s.length() || k+1 == s.length()){
            return s.length();
        }
        if(s.length()==1){
            return 1;
        }
       for(int r=0;r<s.length();r++){
            hash.put(s.charAt(r),hash.getOrDefault(s.charAt(r),0)+1);
            count = Math.max(count,hash.get(s.charAt(r)));
            while((r-l+1)-count>k){
                hash.put(s.charAt(l),hash.get(s.charAt(l))-1);
                l++;
            }
            max = Math.max(max,r-l+1);
       }
       return max;
    }
}
