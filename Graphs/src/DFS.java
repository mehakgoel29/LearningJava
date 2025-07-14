import java.util.Stack;

public class DFS {
    public static void main(String[] args) {
        int matrix[][] = {
                {0, 1, 1, 0, 0},
                {1, 0, 1, 1, 0},
                {1, 1, 0, 0, 1},
                {0, 1, 0, 0, 1},
                {0, 0, 1, 1, 0}
        };
        Dfs(matrix);
    }

    private static void Dfs(int[][] matrix) {
        Stack<Integer> stack =new Stack<>();
        boolean visited[]=new boolean[matrix.length];
        stack.add(0);
        while(!stack.isEmpty()){
            int temp= stack.pop();
            System.out.print(temp+" ");
            visited[temp]=true;
            for (int i = 0; i < matrix.length; i++) {
                if(matrix[temp][i]==1){
                    if(visited[i]==false){
                        stack.add(i);
                        visited[i]=true;
                    }
                }
            }
        }
    }
}
