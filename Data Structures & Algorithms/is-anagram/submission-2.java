class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> op = new HashMap<>();
        for(int i=0;i<s.length();i++){
            op.put(s.charAt(i),op.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            op.put(t.charAt(i),op.getOrDefault(t.charAt(i),0)-1);
        }
        for(int i:op.values()){
            if(i!=0){
                
                return false;
            }
        }
        return true;
    }
}
