package main;

import pieces.Piece;

public class Move {
    int oldCol, oldRow, newCol, newRow;
    Piece piece, capture;

    public Move(Board board, Piece piece, int newCol, int newRow) {
        this.oldCol = piece.col;
        this.oldRow = piece.row;
        this.newCol = newCol;
        this.newRow = newRow;
        this.piece = piece;
        this.capture = board.getPiece(newCol, newRow);
    }
}

/**********************************************************
 **  ©Med0X All rights reserved to me @MrMdrX in Github  **
 **               https://mrmdrx.github.io               **
 *********************************************************/