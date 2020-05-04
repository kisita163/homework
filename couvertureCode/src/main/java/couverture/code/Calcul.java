/**
 * Info about this package TODO.
 * @author sandra
 * @version 1.0
 */
package couverture.code;


public final class Calcul {

    /**
     * valeur min de la variable b.
     */
    public static final int TEN = 10;
    private Calcul() {

    }

    /**
     * @param a
     * @param b
     * @return int
     */
    public static int somme(final int a, final int b) {
        return a + b;
    }
    /**
     * @param a
     * @param b
     * @return int
     */
    public static int maFonction(final int a, final int b) {
        if (b >= TEN) {
          return a / b;
        }
        return b;

    }
    /**
     * @param a
     * @param b
     * @return a/b si b!= 0
     * @throws IllegalArgumentException si b==0
     */
    public static int division(final int a, final int b) {
        if (b == 0) {
          throw new IllegalArgumentException("b <> 0");
        }
        return a / b;
        }

}
