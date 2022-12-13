package com.devopsexam.calcuator.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ServiceImplTest {
    CalculatorServiceImpl service =  new CalculatorServiceImpl();

    @Test
    public void add_success() {
        int a = 15; int b = 20;
        int expectedResult = 35;

        int result = (int) service.doMath(a,b,"+");

        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void subtract_success() {
        int a = 20; int b = 20;
        int expectedResult = 0;

        int result = (int) service.doMath(a,b,"-");

        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void divide_success() {
        int a = 20; int b = 10;
        int expectedResult = 2;

        int result = (int) service.doMath(a,b,"/");

        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void multiply_success() {
        int a = 15; int b = 2;
        int expectedResult = 30;

        int result = (int) service.doMath(a,b,"*");

        Assert.assertEquals(expectedResult, result);
    }


}
