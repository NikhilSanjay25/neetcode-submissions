class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> op = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{'  || s.charAt(i)=='['){
                op.add(s.charAt(i));
            }
            else{
                if( op.size()!=0 &&
                   ( s.charAt(i)==')' && op.get(op.size()-1)=='(' ||
                s.charAt(i)=='}' && op.get(op.size()-1)=='{' ||
                s.charAt(i)==']' && op.get(op.size()-1)=='[' )
                ){
                    op.remove(op.size()-1);
                }
                else{
                    return false;
                }
            }
        }
        if(op.size()==0){
            return true;
        }
        return false;
    }
}
