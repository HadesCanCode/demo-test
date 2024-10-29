package com.example.calculator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PrimeCheckerTest {

    PrimeChecker primeChecker = new PrimeChecker();

    @Test
public void testPrimeNumber() {
        // Kiểm thử số nguyên tố
        assertTrue(primeChecker.isPrime(7));
    }

    @Test
    public void testNonPrimeNumber() {
        // Kiểm thử số không phải là nguyên tố
        assertFalse(primeChecker.isPrime(8));
    }

    @Test
    public void testNegativeNumber() {
        // Kiểm thử với số âm
        assertFalse(primeChecker.isPrime(-5));
    }

    @Test
    public void testPrimeNumberOne() {
        // Kiểm thử với số 1 (không phải số nguyên tố)
        assertFalse(primeChecker.isPrime(1));
    }
}
