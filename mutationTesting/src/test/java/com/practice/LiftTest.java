package com.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class LiftTest {
    Lift obj = new Lift(20);
    int x, y;

    // int f =0;
    @Test(timeout = 3000)
    public void test1() {
        obj.call(0);
        x = obj.getCurrentFloor();
        assertEquals(0, x);
    }

    @Test(timeout = 3000)
    public void test2() {
        y = obj.addRiders(20);
        assertEquals(10, y);
    }

    @Test(timeout = 3000)
    public void test3() {
        if (obj.getNumRiders() == obj.getCapacity()) {
            assertTrue(obj.isFull());
        }
    }

    @Test
    public void test4() {
        obj.addRiders(10);
        assertEquals(10, obj.getNumRiders());
        obj.addRiders(20);
        assertEquals(10, obj.getCapacity());

    }

  /*To kill the mutant // mutated:   {return this.topFloor != 0 ? 0 : 1;}
  write test such that when the topfloor = x then return x.
  */
    @Test
    public void test5(){
        new Lift(20);
      assertEquals(20,obj.getTopFloor());

       }
    /*      public void goDown() {
             if (this.currentFloor > 0) {
              --this.currentFloor;
                }
         }
    */

      /*One thing can be done is call the current floor method.
      and then check the go down once.
//      * */ //@Test
//    public void test6(){
//      int x =1;
//      if(x == obj.getCurrentFloor()){
//        // check in the method returns level
//             obj.goDown();
//        assertEquals(x--,x);
//      }
//    }
//// but the above test has no coverage
//   @Test
//    public void test7(){
//          if(obj.getNumRiders()==obj.getCapacity()){
//              assertEquals(true,obj.isFull());
//          }
//
//      }

@Test
    public void test6(){
    obj.call(10);
    assertEquals(10,obj.getCurrentFloor());
    obj.call(0);
    assertEquals(0,obj.getCurrentFloor());

}

}







