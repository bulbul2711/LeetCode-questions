class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        for(int i=0;i<operations.length;i++)
        {
            String str=operations[i];
           // if(!(ch=="++x" || ch=="x++" || ch=="--x" || ch=="x--"))
               // return -1;
            if(str.equals("++X"))
                X=X+1;
            else if(str.equals("X++"))
                X=X+1;
           else if(str.equals("--X"))
                X=X-1;
           else
                X=X-1;
        }
        return X;
    }
}