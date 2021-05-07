import java.util.*;
public class ValidSudokuSolution {

    public boolean isValidSudoku(char[][] board) {
        //check row
        for(int i=0; i<board.length; i++){
            if(!isValid(toIntArray(getRow(board, i))))
                return false;
        }
        //check column
        for(int i=0; i<board.length; i++){
            if(!isValid(toIntArray(getColumn(board, i))))
                return false;
        }
        //check box
        for(int i=0; i<board.length; i++){
            if(!isValid(toIntArray(getBox(board, i))))
                return false;
        }

        return true;
    }

    private char[] getColumn(char[][] board, int columnNumber){
        char[] column = new char[board.length];
        for(int i=0; i<column.length; i++){
            column[i] = board[i][columnNumber];
        }
        return column;
    }

    private char[] getRow(char[][] board, int rowNumber){
        char[] row = board[rowNumber].clone();
        return row;
    }

    //boxNumber 0-8
    private char[] getBox(char[][] board, int boxNumber){
        int len = 9;
        char[] box = new char[len];
        int start_row = (boxNumber/3)*3;
        int start_col = (boxNumber%3)*3;
        int pos = 0;
        if(boxNumber>=0 && boxNumber<9){
            for(int row=start_row; row<start_row+3; row++){
                for(int col=start_col; col<start_col+3; col++){
                    box[pos] = board[row][col];
                    pos++;
                }
            }
        }
        return box;
    }

    private int[] toIntArray(char[] charArray){
        int[] intArray = new int[charArray.length];
        for(int i=0; i<intArray.length; i++){
            char c = charArray[i];
            if(c=='.')
                intArray[i]=0;
            else
                intArray[i]=Character.getNumericValue(c);
        }
        return intArray;

    }

    private boolean isValid(int[] rowOrColumnOrBox){
        Arrays.sort(rowOrColumnOrBox);
        int[] sorted = rowOrColumnOrBox;
        for(int i=0; i<sorted.length; i++){
            if(rowOrColumnOrBox[i]!=0){
                if(sorted[i]==sorted[i-1])
                    return false;
                if(sorted[i]>9)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        ValidSudokuSolution v = new ValidSudokuSolution();
        char[][] board = {{'8','3','.','.','7','.','.','.','.'},
                          {'6','.','.','1','9','5','.','.','.'},
                          {'.','9','8','.','.','.','.','6','.'},
                          {'8','.','.','.','6','.','.','.','3'},
                          {'4','.','.','8','.','3','.','.','1'},
                          {'7','.','.','.','2','.','.','.','6'},
                          {'.','6','.','.','.','.','2','8','.'},
                          {'.','.','.','4','1','9','.','.','5'},
                          {'.','.','.','.','8','.','.','7','9'}};

        //int[] c1 = v.toIntArray(v.getColumn(board, 0));
        //System.out.println(v.isValid(c1));
        //System.out.print(v.isValidSudoku(board));
        System.out.print(board[0][0]-'1');

    }
}
