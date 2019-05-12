package com.practice.Code_defender_practice;

public class Triangle {

    public int triangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return -1; // invalid
        }
        if (! (a + b > c && a + c > b && b + c > a)) {
            return -1; // invalid
        }
        if (a == b && b == c) {
            return 1; // equilateral
        }
        if (a == b || b == c || a == c)           /*
                                                   here the mutant is inserted
                                                   test case is written to kill that mutant
                                                   */
        {
            return 2; // isosceles
        }
        return 3;  // scalene
    }

}
