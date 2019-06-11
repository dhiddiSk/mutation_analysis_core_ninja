package com.practice;

import static org.junit.Assert.*;

import com.practice.DefendingCode.Triangle;
import org.junit.*;

public class TriangleTest {
    @Test(timeout = 4000)
    public void test() throws Throwable {
        // test here!
        com.practice.DefendingCode.Triangle obj = new Triangle();
        int x = obj.triangle(2,3,2);
        int y = obj.triangle(2,2,2);
        assertTrue(x!=y);
    }
}