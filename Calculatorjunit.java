public class Calculator {
//no-arg constructor
public Calculator() {
}
/**
* Sum method.
*/
public int add(int a, int b) {
return a + b;
}
/**
* Subtract method.
*/
public int subtract(int a, int b) {
return a - b;
}

/**
* Multiply method.
*/
public long multiply(int a, int b) {
return a * b;
}

/**
* Divide method.
* Note that this method throws an exception when
* b is zero.
*/
public double divide(int a, int b) {
double result;
if (b == 0) {
throw new IllegalArgumentException("Divisor cannot divide by zero");
} else {
result = Double.valueOf(a)/Double.valueOf(b);
}
return result;
}
}



//calculator  test class

import org.junit.Test; 
import org.junit.Assert; 
import org.junit.Before;

public class CalculatorTest {
private Calculator objCalcUnderTest;

@Before
public void setUp() {
//Arrange
objCalcUnderTest = new Calculator();
}

@Test
public void testAdd() { 
int a = 15; int b = 20; 
int expectedResult = 35;
//Act 
long result = objCalcUnderTest.add(a, b);
//Assert
Assert.assertEquals(expectedResult, result);
}

@Test
public void testSubtract() {
int a = 25; int b = 20; 
int expectedResult = 5; 
long result = objCalcUnderTest.subtract(a, b);
Assert.assertEquals(expectedResult, result);
}

@Test
public void testMultiply() {
int a = 10; int b = 25;
long expectedResult = 250;
long result = objCalcUnderTest.multiply(a, b);
Assert.assertEquals(expectedResult, result);
}

@Test
public void testDivide() {
int a = 56; int b = 10; 
double expectedResult = 5.6; 
double result = objCalcUnderTest.divide(a, b);
Assert.assertEquals(expectedResult, result,0.00005); 
}

@Test(expected = IllegalArgumentException.class)
public void testDivideByZero() { 
int a = 15; int b = 0;
objCalcUnderTest.divide(a, b);
}
}
