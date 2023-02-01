package leet_code.medium;

import java.util.HashSet;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/valid-sudoku/">here</a>
 */
public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        var boardLength = board.length;
        var set = new HashSet<Character>(boardLength);
        for (int i = 0; i < boardLength; i++) {
            //Check horizontally
            var horizontalLine = board[i];
            for (char c : horizontalLine) {
                if (c == '.') continue;
                if (!set.add(c)) return false;
            }
            set.clear();

            //Check vertically
            for (int j = 0; j < boardLength; j++) {
                var c = board[j][i];
                if (c == '.') continue;
                if (!set.add(c)) return false;
            }
            set.clear();
        }

        //Check square
        for (int x = 0; x < boardLength; x=x+3) {
            for (int y = 0; y < boardLength; y=y+3) {
                for (int xShift = 0; xShift < 3; xShift++) {
                    for (int yShift = 0; yShift < 3; yShift++) {
                        var xIndex = x+xShift;
                        var yIndex = y+yShift;
                        var c = board[xIndex][yIndex];
                        if (c == '.') continue;
                        if (!set.add(c)) return false;
                    }
                }
                set.clear();
            }
        }

        return true;
    }
}
