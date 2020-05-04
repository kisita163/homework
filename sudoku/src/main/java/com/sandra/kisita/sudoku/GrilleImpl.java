package com.sandra.kisita.sudoku;

import java.util.ArrayList;
import java.util.List;

public class GrilleImpl implements Grille {
    /**
     * Dimension grille.
     */
    public static final int DIMENSION = 9;
    /**
     * Dimension sous grille.
     */
    public static final int SUBDIMENSION = 3;
    
    char[][]valeurs_S = new char[DIMENSION][DIMENSION];
    /**
     * @return sudoku dimension.
     */
    public int getDimension() {
            
        return DIMENSION;
    }

    /* (non-Javadoc)
     * @see com.sandra.kisita.sudoku.Grille#setValue(int, int, char)
     */
    public void setValue(int x, int y, char value) throws IllegalArgumentException {
        // Convert String Array to List
        if (!isValid(value)) {
            throw new IllegalArgumentException("Unsupported val.");
        }
        
        if (isPositionValid(x, y)) {
            throw new IllegalArgumentException("Invalid pos.");
        }
        if (isInColumnOrRow(x, y, value)) {
            throw new IllegalArgumentException("Exists in col. or row");
        }
        if (isInSubgrid(x, y, value)) {
            throw new IllegalArgumentException("Exists in subgrid");
        }
        valeurs_S[x][y] = value;
    }
    public boolean isValid(final char value) {
        for (int i = 0; i < POSSIBLE.length; i++) {
            if (POSSIBLE[i] == value) {
                return  true;
            }
        }
        return false;
    }

    public boolean isPositionValid(final int x, final int y) {

        if (x >= DIMENSION || y >= DIMENSION) {
            return true;
        }
        return false;
    }

    public boolean isInColumnOrRow(final int x, final int y, final char value) { 
        List<Character> column = new  ArrayList<Character>();
        List<Character> row = new  ArrayList<Character>();
        for (int i = 0; i < DIMENSION; i++) {
            column.add(valeurs_S[x][i]);
            row.add(valeurs_S[i][y]);
        }
        if (column.contains(value) || row.contains(value)) {
            return true;
        }
        return false;
    }
    private boolean isInSubgrid(final int x, final int y, final char value) {
        int k = x - (x % SUBDIMENSION);
        int l = y - (y % SUBDIMENSION);
        for (int i = k; i < k  + SUBDIMENSION; i++) {
            for (int j = l; j < l + SUBDIMENSION; j++) {
                if (valeurs_S[i][j] == value) {
                    return true;
                }
            }
        } 
        return false;
    }

    public char getValue(int x, int y) throws IllegalArgumentException {

        if (isPositionValid(x, y)) {
            new IllegalArgumentException("Invalid pos.");
        }
        return valeurs_S[x][y];
    }

    public boolean complete() {
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                if (valeurs_S[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean possible(int x, int y, char value) throws IllegalArgumentException {
        if (isPositionValid(x, y) || isInColumnOrRow(x, y, value)  ||  isInSubgrid(x, y, value)) {
            throw new IllegalArgumentException("Unsupported val.");
        }
        return true;
    }
}
