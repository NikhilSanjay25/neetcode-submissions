class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Integer.MAX_VALUE/2;
        while(r>=l){
            int m = (r+l)/2;
            int c = 0;
            for(int i=0;i<piles.length;i++){
                if(piles[i]%m==0){
                    c+=piles[i]/m;
                }
                else{
                    c=c+(piles[i]/m)+1;
                }
            }
            if(c>h){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return l;
    }
}
