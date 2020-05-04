package sudoku;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.sandra.kisita.sudoku.GrilleImpl;

public class GrillImplTest {
	
	@Test
	public void testSetValue() {
		GrilleImpl s = new GrilleImpl();
		s.setValue(0, 0, '1');
		Assert.assertEquals('1',s.getValue(0, 0));
	}
	
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	
	@Test
	public void testSetValueNotAllowed() {
		exceptionRule.expect(IllegalArgumentException.class);
		exceptionRule.expectMessage("Unsupported val.");
		
		GrilleImpl s = new GrilleImpl();
		s.setValue(0, 0, 's');
	}
	
	@Test
	public void testSetPositionNotAllowed() {
		exceptionRule.expect(IllegalArgumentException.class);
		exceptionRule.expectMessage("Invalid pos.");
		
		GrilleImpl s = new GrilleImpl();
		s.setValue(9, 12, '7');
	}
	
	@Test
	public void testSetValueInvalidInSubgrid() {
		exceptionRule.expect(IllegalArgumentException.class);
		exceptionRule.expectMessage("Exists in subgrid");
		
		GrilleImpl s = new GrilleImpl();
		s.setValue(0, 0, '7');
		s.setValue(1, 1, '7');
	}
	
	@Test
	public void testSetValueInvalidInRow() {
		exceptionRule.expect(IllegalArgumentException.class);
		exceptionRule.expectMessage("Exists in col. or row");
		
		GrilleImpl s = new GrilleImpl();
		s.setValue(0, 0, '7');
		s.setValue(0, 1, '7');
	}
	
	@Test
	public void testSetValueInvalidInColumn() {
		exceptionRule.expect(IllegalArgumentException.class);
		exceptionRule.expectMessage("Exists in col. or row");
		
		GrilleImpl s = new GrilleImpl();
		s.setValue(0, 0, '7');
		s.setValue(1, 0, '7');
	}
	
	@Test
	public void testPossible() {
		GrilleImpl s = new GrilleImpl();
		s.possible(0, 0, '1');
	}
	
	@Test
	public void testPossibleUnallowed() {
		exceptionRule.expect(IllegalArgumentException.class);
		exceptionRule.expectMessage("Unsupported val.");
		
		GrilleImpl s = new GrilleImpl();
		s.possible(0, 10, '1');
	}
	
	@Test
	public void testCompleteFalse() {
		GrilleImpl s = new GrilleImpl();
		s.setValue(0, 0, '1');
		Assert.assertFalse(s.complete());
	}
	
}
