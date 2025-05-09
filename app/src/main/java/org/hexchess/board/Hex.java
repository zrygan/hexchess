package org.hexchess.board;

import java.util.ArrayList;

import org.hexchess.pieces.Piece;

public class Hex {
    private final String id;
    private char color;
    private Piece pieceOnHex;
    private ArrayList<Hex> horizontalHexes;
    private ArrayList<Hex> verticalHexes;
    private ArrayList<Hex> rightDiagonalHexes;
    private ArrayList<Hex> leftDiagonalHexes;

    public Hex(String id, char color) {
        this.id = id;
        this.color = color;
        this.pieceOnHex = null;
        this.horizontalHexes = null;
        this.verticalHexes = null;
        this.rightDiagonalHexes = null;
        this.leftDiagonalHexes = null;
    }

    public String getId() {
        return this.id;
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

    public void setHorizontalHexes(ArrayList<Hex> horizontalHexes) {
        this.horizontalHexes = horizontalHexes;
    }

    public ArrayList<Hex> getVerticalHexes() {
        return this.verticalHexes;
    }

    public void setVerticalHexes(ArrayList<Hex> verticalHexes) {
        this.verticalHexes = verticalHexes;
    }

    public ArrayList<Hex> getRightDiagonalHexes() {
        return this.rightDiagonalHexes;
    }

    public void setRightDiagonalHexes(ArrayList<Hex> rightDiagonalHexes) {
        this.rightDiagonalHexes = rightDiagonalHexes;
    }

    public ArrayList<Hex> getLeftDiagonalHexes() {
        return this.leftDiagonalHexes;
    }

    public void setLeftDiagonalHexes(ArrayList<Hex> leftDiagonalHexes) {
        this.leftDiagonalHexes = leftDiagonalHexes;
    }

}
