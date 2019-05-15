package com.practice.Code_defender_practice_tests;

import org.junit.*;
import com.practice.Code_defender_practice.Stack;
import static org.junit.Assert.*;

public class StackTest extends Stack{
    @Test(timeout = 4000)
    public void test() throws Throwable {
        // test here!
        Stack obj = new Stack();
      //  boolean x = obj.isEmpty();
        assertEquals(false,obj.isEmpty());



    }
}