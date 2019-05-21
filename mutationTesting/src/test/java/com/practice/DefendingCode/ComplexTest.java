package com.practice.DefendingCode;

import org.junit.Test;

import static org.junit.Assert.*;

class TestComplex {
    @Test(timeout = 4000)
    public void test() throws Throwable {
        // test here!
      double real=10, imag=-10;
        Complex obj = new Complex(real,imag);
        obj.negate();

    }
}