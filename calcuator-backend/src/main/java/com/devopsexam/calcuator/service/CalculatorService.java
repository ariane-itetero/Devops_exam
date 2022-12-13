package com.devopsexam.calcuator.service;


import com.devopsexam.calcuator.dto.Equation;

public interface CalculatorService {
    public static Equation add(Double left, Double right) {
        return new Equation(left, right, left + right, "+");
    }

    public static Equation subtract(Double left, Double right) {
        return new Equation(left, right, left - right, "-");
    }

    public static Equation multiply(Double left, Double right) {
        return new Equation(left, right, left * right, "*");
    }

    public static Equation divide(Double left, Double right) {
        return new Equation(left, right, left / right, "/");
    }
}
