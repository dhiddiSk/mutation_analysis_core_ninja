package com.practice;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckIgnoreCalTest {
  int i1 = 20, i =30;
  Demo abc = new Demo();
 @Ignore
  @Test
  public void sum(){
         assertEquals(80,abc.sum(20,60));
  }
@Test
    public void avg(){
     assertEquals(2,abc.avg(4));
}


}