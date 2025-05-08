package org.hexchess.board;

import java.util.ArrayList;

import org.hexchess.pieces.Piece;

public class Hex {
    private char color;
    private Piece pieceOnHex;
    private final ArrayList<Hex> horizontalHexes;
    private final ArrayList<Hex> verticalHexes;
    private final ArrayList<Hex> rightDiagonalHexes;
    private final ArrayList<Hex> leftDiagonalHexes;

    public Hex(char color, ArrayList<Hex> horizontalHexes, ArrayList<Hex> verticalHexes,
            ArrayList<Hex> rightDiagonalHexes, ArrayList<Hex> leftDiagonalHexes) {
        this.color = color;
        this.pieceOnHex = null;
        this.horizontalHexes = horizontalHexes;
        this.verticalHexes = verticalHexes;
        this.rightDiagonalHexes = rightDiagonalHexes;
        this.leftDiagonalHexes = leftDiagonalHexes;
    }

    public char getColor() {
        return this.color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public Piece getPieceOnHex() {
        return this.pieceOnHex;
    }

    public void setPieceOnHex(Piece pieceOnHex) {
        this.pieceOnHex = pieceOnHex;
    }

    public ArrayList<Hex> getHorizontalHexes() {
        return this.horizontalHexes;
    }

    public ArrayList<Hex> getVerticalHexes() {
        return this.verticalHexes;
    }

    public ArrayList<Hex> getRightDiagonalHexes() {
        return this.rightDiagonalHexes;
    }

    public ArrayList<Hex> getLeftDiagonalHexes() {
        return this.leftDiagonalHexes;
    }

}
