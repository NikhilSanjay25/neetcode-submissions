class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0;i<s.length();i++){
            int l = i;
            int r = i+1;
            count++;
            while(l>=0 && r<s.length()){
                if(s.charAt(l)==s.charAt(r)){
                    l--;
                    r++;
                    count++;
                }
                else{
                    break;
                }
            }
            l = i-1;
            r = i+1;
            while(l>=0 && r<s.length()){
                if(s.charAt(l)==s.charAt(r)){
                    l--;
                    r++;
                    count++;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
}
