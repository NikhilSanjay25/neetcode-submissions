class Solution {
    List<String> op = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        ret("",0,n);
        return op;
    }
    private void ret(String s,int open,int n){
        if(s.length()==n*2){
            op.add(s);
        }
        else if(open==0){
            ret(s+"(",open+1,n);
        }
        else if(open*2==s.length()){
            ret(s+"(",open+1,n);
        }
        else if(open<n && open!=0){
            ret(s+"(",open+1,n);
            ret(s+")",open,n);
        }
        else{
            ret(s+")",open,n);
        }
    }
}
