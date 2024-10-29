package com.example.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class FactorialTest {
	 Factorial factorial = new Factorial();

	    @Test
	   public void testFactorialPositiveNumber() {
	        // Kiểm thử giai thừa của số dương
	        assertEquals(120, factorial.factorial(5));
	    }

	    @Test
	    public void testFactorialZero() {
	        // Kiểm thử giai thừa của 0 (bằng 1)
	        assertEquals(1, factorial.factorial(0));
	    }

	    @Test
	    public void testFactorialNegativeNumber() {
	        // Kiểm thử giai thừa của số âm, phải ném ngoại lệ
	        assertThrows(IllegalArgumentException.class, () -> factorial.factorial(-5));
	    }
}
