package org.hexchess.pieces;

import org.hexchess.board.Hex;

public class Piece {
    private boolean isAlive;
    private Hex position;

    public Piece(Hex position) {
        this.isAlive = true;
        this.position = position;
    }

    public boolean getIsAlive() {
        return this.isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public Hex getPosition() {
        return this.position;
    }

    public void setPosition(Hex position) {
        this.position = position;
    }
}
