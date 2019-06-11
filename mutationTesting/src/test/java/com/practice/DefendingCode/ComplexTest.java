package com.practice.DefendingCode;

import com.practice.DefendingCode.Complex;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    double imag= 10;
    double real = 10;

    @Test(timeout = 4000)
    public void test() throws Throwable {
        Complex obj = new Complex(real, -imag);
        Complex obj1 = obj.negate();
        assertEquals(obj,obj1);

    }
}