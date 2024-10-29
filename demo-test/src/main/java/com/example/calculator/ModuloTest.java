package com.example.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class ModuloTest {
	 Modulo modulo = new Modulo();

	    @Test
	    public void testModuloPositive() {
	        // Kiểm thử phép chia lấy dư với số dương
	        assertEquals(1, modulo.modulo(10, 3));
	    }

	    @Test
	    public void testModuloZeroDivisor() {
	        // Kiểm thử chia cho 0, phải ném ngoại lệ
	        assertThrows(IllegalArgumentException.class, () -> modulo.modulo(10, 0));
	    }

	    @Test
	    public void testModuloNegative() {
	        // Kiểm thử phép chia lấy dư với số âm
	        assertEquals(-1, modulo.modulo(-10, 3));
	    }
}
