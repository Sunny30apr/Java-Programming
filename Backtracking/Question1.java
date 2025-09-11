public class Question1 {
    public static void ratInAMaze(int arr[][], int i, int j, int row, int col, int ans[][]) {
        if(i < 0 || j < 0 || i >= row || j >= col || arr[i][j] == 0 || ans[i][j] == 1) {
            return;
        }
        
        if(i == row-1 && j == col-1) {
            ans[i][j]=1;
            printSolution(ans);
            ans[i][j]=0; //backtrack
            return;
        }

        ans[i][j]=1;

        ratInAMaze(arr, i+1, j, row, col, ans);   
            
        ratInAMaze(arr, i, j+1, row, col, ans);

        ratInAMaze(arr, i-1, j, row, col, ans);

        ratInAMaze(arr, i, j-1, row, col, ans);

        ans[i][j]=0; //backtrack

    }

    public static void printSolution(int maze[][]) {
        for(int i=0; i<maze.length; i++) {
            for(int j=0; j<maze.length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void main(String args[]) {
        int n=4;
        int maze[][] = { { 1, 1, 1, 0 },
                        { 1, 0, 1, 1 },
                        { 1, 0, 0, 1 },
                        { 1, 1, 1, 1 } }; 

        int ans[][]= new int[n][n];

        // System.out.println(solution(maze, 0, 0, n, n, ans));
        ratInAMaze(maze, 0, 0, n, n, ans);
    }
}