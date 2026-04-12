public class SudokuGenerator
{
    public static void main(String[] args)
    {
        int[][] board = createBoard();
        finalBoard(board);
    }
    
    /// Creates the initial board with all the numbers
    public static int[][] createBoard(){
        int[][] board = new int[9][9];
        int[] row = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < board.length; i++){
            int s = shift(i);
            for(int j = 0; j < board[0].length; j++){
                board[i][j] = row[(j + s) % 9];
            }
        }
        return board;
    }
    
    /// Finished board
    public static void finalBoard(int[][] board){
        for (int i = 0; i < board.length; i++){
            if (i % 3 == 0){
                System.out.println("+-------+-------+-------+");
            }
            for (int j = 0; j < board[0].length; j++){
                if (j % 3 == 0) {
                    System.out.print("| ");
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println("| ");
        }
        System.out.println("+-------+-------+-------+");
    }
    
    /// Shift is used to create a valid sudoku board
    /// Essentially what it does is it creates a board in increments of 3 until it is in range of 9
    /// Then it increases the initial number by 1
    public static int shift(int row){
        return (row * 3) + (row / 3);
    }
    
}