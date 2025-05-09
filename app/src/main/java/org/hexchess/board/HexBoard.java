package org.hexchess.board;

import java.util.HashMap;

public class HexBoard {
    private HashMap<String, Hex> hexes;

    public HexBoard() {
        this.hexes = createHexes();
    }

    public HashMap<String, Hex> getHexes() {
        return this.hexes;
    }

    public void setHexes(HashMap<String, Hex> hexes) {
        this.hexes = hexes;
    }

    public HashMap<String, Hex> createHexes() {
        char[] files = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'k', 'l' };
        HashMap<String, Hex> hexes = new HashMap<>();
        char color = '0'; // set a default color for now

        for (int i = 1; i <= 11; i++) {
            if (i < 7) {
                if (i == 1) {
                    color = 'd';
                } else {
                    color = hexColoring(true, color);
                }

                for (int j = 0; j < files.length; j++) {
                    if (j != 0) {
                        color = hexColoring(j > 5, color);
                    }

                    String id = String.valueOf(i) + files[j];
                    hexes.put(id, new Hex(id, color));
                }

            } else {
                if (i == 7) {
                    color = 'm';
                } else {
                    color = hexColoring(false, color);
                }

                for (int j = i - 6; j < files.length - (i - 6); j++) {
                    if (j != i - 6) {
                        color = hexColoring(j <= 5, color);
                    }

                    String id = String.valueOf(i) + files[j];
                    System.out.printf("%s %c\n", id, color);
                    hexes.put(id, new Hex(id, color));
                }
            }
        }

        return hexes;
    }

    public char hexColoring(boolean onLeft, char color) {
        if (!onLeft) {
            if (color == 'l') {
                return 'm';
            } else if (color == 'm') {
                return 'd';
            } else if (color == 'd') {
                return 'l';
            }
        } else {
            if (color == 'd') {
                return 'm';
            } else if (color == 'm') {
                return 'l';
            } else if (color == 'l') {
                return 'd';
            }
        }

        return '0';
    }
}