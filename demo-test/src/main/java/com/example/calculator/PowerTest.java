package com.example.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PowerTest {
	 Power power = new Power();

	    @Test
	    void testPositiveExponent() {
	        // Kiểm thử với số mũ dương
	        assertEquals(8, power.power(2, 3), 0.0001);
	    }

	    @Test
	    void testZeroExponent() {
	        // Kiểm thử với số mũ bằng 0
	        assertEquals(1, power.power(5, 0), 0.0001);
	    }

	    @Test
	    void testNegativeExponent() {
	        // Kiểm thử với số mũ âm
	        assertEquals(0.125, power.power(2, -3), 0.0001);
	    }
}
