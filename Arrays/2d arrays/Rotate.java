public class Rotate {
    public static void main(String[] args)
    {
        int[][] mat = { { 1, 2, 3 },
                        { 4, 5, 6 },
                        { 7, 8, 9 } };
 
        rotateMatrix(mat,3);
    }
    static void rotateMatrix(int mat[][],int N)
    {
        for (int i = N - 1; i >= 0; i--) {
            for (int j = N - 1; j >= 0; j--)
                System.out.print(mat[i][j] + " ");
 
            System.out.println();
        }
    }
}

