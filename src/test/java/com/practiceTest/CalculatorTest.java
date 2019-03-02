package com.practiceTest;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator abc = new Calculator();
    @Test
    public void addtest(){
       assertEquals(3,abc.add(1,2));
    }

}