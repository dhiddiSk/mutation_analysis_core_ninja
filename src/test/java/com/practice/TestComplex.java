package com.practice;

import org.junit.*;

import static org.junit.Assert.*;

public class TestComplex {
   public double real,imag;
    Complex obj = new Complex(real,imag);
   @Test(timeout = 4000)
   public void test1() throws Throwable {
          assertNotSame(obj.negate(), new Complex(-real,-imag));
   }
}

       /**
       // test here!
       this.real=-real;
           this.imag=-imag;
           obj.negate();
           assertNotSame(new Complex(real,imag),new Complex(real,imag));


        // Complex obj1 = new Complex(real,imag);
          //  obj1.negate();
          //  assertEquals(,new Complex(10,20));**/



