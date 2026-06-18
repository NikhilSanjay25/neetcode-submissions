class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int high = 0;
        for(int i:piles){
            high=Math.max(high,i);
        }
        int low = 1;
        int optimal = Integer.MAX_VALUE;
        while(high>=low){
            int mid = (high+low)/2;
            int count = 0;
            for(int i:piles)
            {
                count+=Math.ceil((double)i / mid);;
                if(count>h){
                    break;
                }
            }
            if(count>h){
                low = mid+1;
            }
            else{
                high = mid-1;
                optimal = Math.min(optimal,mid);
            }
        }
        return optimal ;
    }
}
