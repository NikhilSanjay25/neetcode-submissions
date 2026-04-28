class Solution {
    public int evalRPN(String[] tokens) {
        ArrayList<Integer> op = new ArrayList<>();
        for(String a:tokens){
            if(a.equals("*") ){
                int sum = op.remove(op.size()-2)*op.remove(op.size()-1);
                op.add(sum);
            }
            else if(a.equals("+")){
                int sum = op.remove(op.size()-2)+op.remove(op.size()-1);
                op.add(sum);
            }
            else if(a.equals("-")){
                int sum = op.remove(op.size()-2)-op.remove(op.size()-1);
                op.add(sum);
                
            }
            else if(a.equals("/")){
                int sum = op.remove(op.size()-2)/op.remove(op.size()-1);
                op.add(sum);
            }
            else{
                op.add(Integer.parseInt(a));
            }
        }
        return op.get(0);
    }
}
