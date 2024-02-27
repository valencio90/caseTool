package assignments;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class SmartCalculatorTestCase {
	
	Scanner sc = new Scanner(System.in);
	
	SmartCalculatorTest ob = new SmartCalculatorTest();

	@Test
	void SimpleInterest() {	
		ob.Display();
		ob.setPrincipal(sc.nextDouble());		//12,000
		ob.setRate(sc.nextDouble());			//7
		ob.setTime(sc.nextDouble());			//5
		assertEquals(4200.0,ob.simpleInterest());
						 }
		
	@Test
	void CompoundInterest() {		
		ob.Display();
		ob.setPrincipal(sc.nextDouble());		//10,000
		ob.setRate(sc.nextDouble());			//7
		ob.setTime(sc.nextDouble());			//5
		assertEquals(3.2767E8,ob.compoundInterest());
						 }
	
	@Test
	void Mean() {
		assertEquals(3.0,ob.mean());	//no of value : 5 | values = {1,2,3,4,5}
				}
	
	@Test
	void Factorial() {
		assertEquals(120,ob.factorial(5));
				     }
	
	@Test
	void Percentage() {
		ob.Display2();
		ob.setMaxMarks(sc.nextDouble());		//600
		ob.setMarks(sc.nextDouble());			//450
		assertEquals(75,ob.percentage());
				     }
	
}
