package com.kata.trade_accounting.calculationTest;

import com.kata.trade_accounting.calculation.Calculator;
import junit.framework.TestCase;
import org.testng.annotations.Test;
import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CalculatorTest {

    @Test
    public void newCalculatorShouldHaveOne(){
        Calculator calculator = new Calculator();
        //assertion
        Assert.assertEquals(1, calculator.sum(0,1));
    }

    @Test(expectedExceptions = Exception.class)
    public void newCalculatorShouldHaveThrow(){
        Calculator calculator = new Calculator();
        calculator.div(1,0);
    }

}
