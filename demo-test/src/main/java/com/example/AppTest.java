package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {
	 @Test
	    void testAddition() {
	        // Kiểm thử phép cộng
	        assertEquals(5, 2 + 3);
	    }

	    @Test
	    void testStringStart() {
	        // Kiểm thử một chuỗi
	        assertTrue("hello".startsWith("h"));
	    }

	    @Test
	    void testDivision() {
	        // Kiểm thử phép chia
	        assertThrows(ArithmeticException.class, () -> {
	            int result = 1 / 0;
	        });
	    }
}
