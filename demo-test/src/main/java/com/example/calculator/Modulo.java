package com.example.calculator;

public class Modulo {
	// Phương thức tính phép chia lấy dư (modulo)
    public int modulo(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return a % b;
    }
}
