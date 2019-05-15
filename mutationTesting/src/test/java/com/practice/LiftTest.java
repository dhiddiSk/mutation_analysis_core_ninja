package com.practice;

<<<<<<< HEAD
package com.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class LiftTest  {
    Lift obj = new Lift(20);
    int x,y;
   // int f =0;
    @Test(timeout = 3000)
     public void test1() {
        obj.call(0);
          x= obj.getCurrentFloor();
        assertEquals(0,x);
       }
    @Test(timeout = 3000)
    public void test2(){
        y= obj.addRiders(20);
       assertEquals(10,y);
    }

    @Test(timeout=3000)
    public void test3(){
        if(obj.getNumRiders() == obj.getCapacity()) {
            assertTrue(obj.isFull());
        } }

        @Test
    public void test4(){
       obj.addRiders(10);
       assertEquals(10,obj.getNumRiders());
        }







=======
package com.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class LiftTest  {
    Lift obj = new Lift(20);
    int x,y;
   // int f =0;
    @Test(timeout = 3000)
     public void test1() {
        obj.call(0);
          x= obj.getCurrentFloor();
        assertEquals(0,x);
       }
    @Test(timeout = 3000)
    public void test2(){
        y= obj.addRiders(20);
       assertEquals(10,y);
    }

    @Test(timeout=3000)
    public void test3(){
        if(obj.getNumRiders() == obj.getCapacity()) {
            assertTrue(obj.isFull());
        } }

        @Test
    public void test4(){
       obj.addRiders(10);
       assertEquals(10,obj.getNumRiders());
        }







>>>>>>> 82875b54d566553229514e7883b0528a4ec24ecf
}