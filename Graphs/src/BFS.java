import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        int matrix[][] = {
                {0, 1, 1, 0, 0},
                {1, 0, 1, 1, 0},
                {1, 1, 0, 0, 1},
                {0, 1, 0, 0, 1},
                {0, 0, 1, 1, 0}
        };
        Bfs(matrix);
    }

    private static void Bfs(int[][] matrix) {
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[matrix.length];
        q.add(0);
        while(!q.isEmpty()){
            int temp=q.poll(); // remove() throws exception and poll() returns null
            System.out.print(temp+" ");
            visited[temp]=true;
            for (int i = 0; i < matrix.length; i++) {
                if(matrix[temp][i]==1){
                    if(visited[i]==false){
                        q.add(i);
                        visited[i]=true;
                    }
                }
            }
        }
    }
}
