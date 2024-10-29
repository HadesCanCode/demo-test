package com.example.calculator;

public class SquareRoot {
	// Phương thức tính căn bậc hai
    public double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(number);
    }
}
