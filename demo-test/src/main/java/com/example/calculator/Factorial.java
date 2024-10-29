package com.example.calculator;

public class Factorial {
	 // Phương thức tính giai thừa của một số nguyên dương
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
