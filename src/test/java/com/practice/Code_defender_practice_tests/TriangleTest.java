package com.practice.Code_defender_practice_tests;

import com.practice.Code_defender_practice.Triangle;
import org.junit.Before;

import static org.junit.Assert.*;

import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {
    @Test(timeout = 4000)
    public void test() throws Throwable {
        // test here!
        Triangle obj = new Triangle();
        int x = obj.triangle(2,3,2);
        int y = obj.triangle(2,2,2);
        assertTrue(x!=y);
    }
}