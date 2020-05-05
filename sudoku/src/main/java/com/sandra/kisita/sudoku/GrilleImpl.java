package com.sandra.kisita.sudoku;

import java.util.ArrayList;
import java.util.List;

public class GrilleImpl implements Grille {
    /**
     * Dimension grille.
     */
    public static final int DIMENSION = 9;
    /**
     * SUBDIMENSION   Dimension sous grille.
     * DIMENSION      dimension grille SUDOKU.
     */
    public static final int SUBDIMENSION = 3;

    /**
     * valeurS grille Sudoku.
     */
    char[][]valeursS = new char[DIMENSION][DIMENSION];
    /**
     * @return sudoku dimension.
     */
    public int getDimension() {

        return DIMENSION;
    }

    /**
     * Affecte une valeur dans la grille.
     *
     * @param x       position x dans la grille
     * @param y       position y dans la grille
     * @param value
     *    valeur a mettre dans la case
     * @throw IllegalArgumentException si x ou y sont hors bornes (0-8)
     * @throw IllegalArgumentException si la valeur est interdite aux vues des
     *        autres valeurs de la grille
     * @throw IllegalArgumentException si value n'est pas un caractere autorise
     *        ('1',...,'9')
     */
    public void setValue(final int x, final int y, final char value) throws IllegalArgumentException {
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
        valeursS[x][y] = value;
    }
    /**
     * @param value valeur à vérifier
     * cette méthode perlmet de vérifier que la valeur saisie est valide.
     * @return
     * Caractere possible a mettre dans la grille,
     *
     * pour une grille 9x9 : 1..9
     *
     * pour une grille 16x16: 0..9-a..f
     */
    public boolean isValid(final char value) {
        for (int i = 0; i < POSSIBLE.length; i++) {
            if (POSSIBLE[i] == value) {
                return  true;
            }
        }
        return false;
    }

    /**
     * @param x      position x dans la grille
     * @param y      position y dans la grille
     * @return       retourne vrai si les valeurs de x et y
     *         sont correctes
     */
    public boolean isPositionValid(final int x, final int y) {

        if (x >= DIMENSION || y >= DIMENSION) {
            return true;
        }
        return false;
    }
    /**
     * Verifie si value existe sur la colonne x ou sur la ligne y.
     * @param x      position x dans la grille
     * @param y      position y dans la grille
     * @return       retourne  vrai si value existe déjà sur la colonne x ou,
     *         la ligne y
     * @param value  valeur saisie
     */
    public boolean isInColumnOrRow(final int x, final int y, final char value) {
        List<Character> column = new  ArrayList<Character>();
        List<Character> row = new  ArrayList<Character>();
        for (int i = 0; i < DIMENSION; i++) {
            column.add(valeursS[x][i]);
            row.add(valeursS[i][y]);
        }
        if (column.contains(value) || row.contains(value)) {
            return true;
        }
        return false;
    }
    /**
     * Verifie si value n'existe pas déjà dans le sous correspondant,
     * aux coordonnées saisies.
     * @param x      position x dans la grille
     * @param y      position y dans la grille
     * @param value        valeur entrée dans la grille
     * @return boolean
     */
    private boolean isInSubgrid(final int x, final int y, final char value) {
        int k = x - (x % SUBDIMENSION);
        int l = y - (y % SUBDIMENSION);
        for (int i = k; i < k  + SUBDIMENSION; i++) {
            for (int j = l; j < l + SUBDIMENSION; j++) {
                if (valeursS[i][j] == value) {
                    return true;
                }
            }
        }
        return false;
    }
    /**
      * Recupere une valeur de la grille.
      * @param x      position x dans la grille
      * @param y      position y dans la grille
      * @return valeur dans la case x,y
      * @throw IllegalArgumentException si x ou y sont hors bornes (0-8)
      */
    public char getValue(final int x, final int y) throws IllegalArgumentException {

        if (isPositionValid(x, y)) {
            new IllegalArgumentException("Invalid pos.");
        }
        return valeursS[x][y];
    }

    /**
     * Test si une grille est terminee.
     * @return true si la grille est complete
     */
    public boolean complete() {
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                if (valeursS[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    /**
     * Test si une valeur est possible dans la grille par rapport a ce qu'elle
     *               contient deja.
     * @return boolean
     * @param x     position x dans la grille
     * @param y     position y dans la grille
     * @param value
     *            valeur a mettre dans la case
     * @throw IllegalArgumentException si x ou y sont hors bornes (0-8)
     * @throw IllegalArgumentException si value n'est pas un caractere autorise
     *        ('1',...,'9',..),
     */
    public boolean possible(final int x, final int y, final char value) throws IllegalArgumentException {
        if (isPositionValid(x, y) || isInColumnOrRow(x, y, value)  ||  isInSubgrid(x, y, value)) {
            throw new IllegalArgumentException("Unsupported val.");
        }
        return true;
    }
}
