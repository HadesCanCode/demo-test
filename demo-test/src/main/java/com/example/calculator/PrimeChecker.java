package com.example.calculator;

public class PrimeChecker {
	 // Phương thức kiểm tra xem số có phải là số nguyên tố hay không
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
