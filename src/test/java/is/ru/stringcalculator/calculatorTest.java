package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class calculatorTest {

	@Test
	public void testEmptyString(){
		assertEquals(0, calculator.Add(""));
	}

	@Test
	public void testOneNumber(){
		assertEquals(1 , calculator.Add("1"));
	}

	@Test
	public void testtwoNumbers(){
		assertEquals(3 , calculator.Add("1,2"));
	}
}
