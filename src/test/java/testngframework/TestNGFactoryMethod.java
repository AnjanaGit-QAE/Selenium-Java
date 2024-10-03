package testngframework;

import org.testng.Assert;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;


//@Factory method  is a feature that allows you to create instances of test classes at runtime. 
//It is particularly useful when you need to run the same test with different sets of parameters or configurations

public class TestNGFactoryMethod {

	 int a;
     int b;
     int expectedSum;
     int expectedDifference;

  
    public TestNGFactoryMethod(int a, int b, int expectedSum, int expectedDifference) {
        this.a = a;
        this.b = b;
        this.expectedSum = expectedSum;
        this.expectedDifference = expectedDifference;
    }

   
    @Test
    public void testAddition() {
       
    	int actualSum = a + b;
      
        System.out.println("Adding " + a + " and " + b + ": expected " + expectedSum + ", got " + actualSum);
        Assert.assertEquals(actualSum, expectedSum, "The addition result is incorrect");
    
    }

    
    @Test
    public void testSubtraction() {
       
    	int actualDifference = a - b;
        
    	System.out.println("Subtracting " + b + " from " + a + ": expected " + expectedDifference + ", got " + actualDifference);
        Assert.assertEquals(actualDifference, expectedDifference, "The subtraction result is incorrect");
    
    }

    // Factory method that returns an array of test instances with different data sets
    @Factory
    public static Object[] factoryMethod() {
    	
    	return new Object[]{
            new TestNGFactoryMethod(5, 3, 8, 2),      // Test case 1
            new TestNGFactoryMethod(10, 4, 14, 6),    // Test case 2
            new TestNGFactoryMethod(20, 5, 25, 15)     // Test case 3
        };
   
    }
    
}


