package couverture.code;

import org.junit.Assert;
import org.junit.Test;

public final class CalculTest {
	@Test
	public void testConstructeur() {
		//new Calcul();

	}
@Test
public void testMaFonction() {
	Assert.assertEquals(5,Calcul.maFonction(10, 5));
}

@Test
public void testMaFonctionBgreaterThan10() {
	Assert.assertEquals(1,Calcul.maFonction(10, 10));
}

@Test
public void testSomme() {
	Assert.assertEquals(5,Calcul.somme(2, 3));
}

@Test
public void testDivision() {
	Assert.assertEquals(4, Calcul.division(8,2));
}
@Test(expected = IllegalArgumentException.class)
public void testDivisionBEgal0_thenExpectationSatisfied() {
    Calcul.division(8, 0);
}
}
