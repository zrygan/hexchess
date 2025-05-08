package org.hexchess.board;

import java.util.ArrayList;

public class HexBoard {
    private ArrayList<Hex> hexes;

    public HexBoard(ArrayList<Hex> hexes){
        System.out.println("Hexboard created");
    }

    public ArrayList<Hex> getHexes(){
        return this.hexes;
    }

    public void setHexes(ArrayList<Hex> hexes){
        this.hexes = hexes;
    }
}