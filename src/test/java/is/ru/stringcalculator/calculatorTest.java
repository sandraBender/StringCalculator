package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class calculatorTest {

	@Test
	public void testEmptyString(){
		assertEquals(0, calculator.Add(""));
	}

	@Test
	public void testOne(){
		assertEquals(1 , calculator.Add("1"));
	}

	@Test
	public void testAnyOneNumber(){
		assertEquals(3 , calculator.Add("3"));
	}

	@Test
	public void testtwoNumbers(){
		assertEquals(3 , calculator.Add("1,2"));
	}

	@Test
	public void testtwoOrMoreNumbers(){
		assertEquals(7 , calculator.Add("1,2,3,1"));
	}

	@Test
	public void testNewLine(){
		assertEquals(6 , calculator.Add("1\n2,3"));
	}


}
