package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 0);
	}

	@Test
	public void testminus(){

		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(5, 3), 2);

	}
	@Test
	public void testmultiply(){

		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(5, 3), 15);

	}
	@Test
	public void testdivide(){

		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(4, 2), 2);
		//assertEquals(calc.divide(4, 0),"Error");

	}

}
