class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        HashSet<Integer> col=new HashSet<>();
        HashSet<Integer> pos=new HashSet<>();
        HashSet<Integer> neg=new HashSet<>();
        char[][] board=new char[n][n];
        for(char[] r:board)
            Arrays.fill(r,'.');
        dfs(0,n,col,pos,neg,board,res);
        return res;
    }
    public void dfs(int r, int n, HashSet<Integer> col, HashSet<Integer> pos, HashSet<Integer> neg, char[][] board, List<List<String>> res){
        if(r==n){
            List<String> copy=new ArrayList<>();
            for(char[] row:board)
                copy.add(new String(row));
            res.add(copy);
            return;
        }
        for(int c=0;c<n;c++){
            if(col.contains(c) || pos.contains(r-c) || neg.contains(r+c))
                continue;
            col.add(c);
            pos.add(r-c);
            neg.add(r+c);
            board[r][c]='Q';
            dfs(r+1,n,col,pos,neg,board,res);
            col.remove(c);
            pos.remove(r-c);
            neg.remove(r+c);
            board[r][c]='.';
        }
    }
}