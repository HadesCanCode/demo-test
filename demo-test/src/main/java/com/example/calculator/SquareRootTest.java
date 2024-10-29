package com.example.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class SquareRootTest {
	  SquareRoot squareRoot = new SquareRoot();

	    @Test
	    public void testPositiveNumber() {
	        // Kiểm thử căn bậc hai của số dương
	        assertEquals(4, squareRoot.squareRoot(16), 0.0001);
	    }

	    @Test
	   public void testZero() {
	        // Kiểm thử căn bậc hai của 0
	        assertEquals(0, squareRoot.squareRoot(0), 0.0001);
	    }

	    @Test
	   public void testNegativeNumber() {
	        // Kiểm thử với số âm
	        assertThrows(IllegalArgumentException.class, () -> squareRoot.squareRoot(-1));
	    }
}
