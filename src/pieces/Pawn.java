package pieces;

import main.Board;

import java.awt.image.BufferedImage;

public class Pawn extends Piece {
    public Pawn(Board board, int col, int row, boolean isWhite) {
        super(board);
        this.col = col;
        this.row = row;
        this.xPos = col * board.tileSize;
        this.yPos = row * board.tileSize;
        this.isWhite = isWhite;
        this.name = "Pawn";
        this.sprite = sheet.getSubimage(5 * sheetScale, isWhite ? 0 : sheetScale, sheetScale, sheetScale).getScaledInstance(board.tileSize, board.tileSize, BufferedImage.SCALE_SMOOTH);
    }

    @Override
    public boolean isValidMovement(int col, int row) {
        int colorIndex = isWhite ? 1 : -1;

        // PUSH PAWN 1
        if (this.col == col && row == this.row - colorIndex && board.getPiece(col, row) == null) return true;

        // PUSH PAWN 2
        if (isFirstMove && this.col == col && row == this.row - colorIndex * 2 && board.getPiece(col, row) == null && board.getPiece(col, row + colorIndex) == null)
            return true;

        // CAPTURE LEFT
        if (col == this.col - 1 && row == this.row - colorIndex && board.getPiece(col, row) != null) return true;

        // CAPTURE RIGHT
        if(col == this.col + 1 && row == this.row - colorIndex && board.getPiece(col, row) != null) return true;

        // EN PASSANT LEFT
        if(board.getTileNum(col, row) == board.enPassantTile && col == this.col - 1 && row == this.row - colorIndex && board.getPiece(col, row + colorIndex) != null) return true;

        // EN PASSANT RIGHT
        if(board.getTileNum(col, row) == board.enPassantTile && col == this.col + 1 && row == this.row - colorIndex && board.getPiece(col, row + colorIndex) != null) return true;

        return false;
    }
}

/**********************************************************
 **  ©Med0X All rights reserved to me @MrMdrX in Github  **
 **               https://mrmdrx.github.io               **
 *********************************************************/