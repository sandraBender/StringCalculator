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
	//@Rule
      //  public ExpectedException thrown= ExpectedException.none();


	/*@Test
	public void testNegativeNumber(){
		assertEquals("Negatives not allowed: -1" , calculator.Add("-1,2"));
	}


    @Test
	public void testMoreNegativeNumbers(){
		assertEquals(, calculator.Add("2,-4,3,-5"));
	}*/
	@Test
	public void testNegatives(){
	try{ 
    		calculator.Add("-1,2"); 
    	}
    	catch (RuntimeException ex){
    		assertEquals("Negatives not allowed: [-1]", ex.getMessage());
    	}
    }	

    @Test
	public void testMoreNegatives(){
	try{ 
    		calculator.Add("2,-4,3,-5"); 
    	}
    	catch (RuntimeException ex){
    		assertEquals("Negatives not allowed: [-4, -5]", ex.getMessage());
    	}
    }

	@Test
	public void testNumberHigherThen1000(){
		assertEquals(2 , calculator.Add("1001,2"));
	}

	@Test
	public void testNewDelimiter(){
		assertEquals(3 , calculator.Add("//;\n1;2"));
	}

    @Test
	public void testNAnotherewDelimiter(){
		assertEquals(10 , calculator.Add("//&\n1&2,6&1"));
	}
}
