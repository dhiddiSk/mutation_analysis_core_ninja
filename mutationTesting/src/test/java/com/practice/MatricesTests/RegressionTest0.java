package com.practice.MatricesTests;

import com.practice.Matrix;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        Matrix matrix6 = null;
        boolean boolean7 = matrix5.equals(matrix6);
        int[] intArray9 = new int[] { (short) 0 };
        int[] intArray11 = new int[] { (short) 0 };
        int[][] intArray12 = new int[][] { intArray9, intArray11 };
        Matrix matrix13 = new Matrix(intArray12);
        Matrix matrix14 = matrix5.minus(matrix13);
        Matrix matrix15 = null;
        try {
            Matrix matrix16 = matrix14.minus(matrix15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(matrix14);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        int[] intArray7 = new int[] { (short) 0 };
        int[] intArray9 = new int[] { (short) 0 };
        int[][] intArray10 = new int[][] { intArray7, intArray9 };
        Matrix matrix11 = new Matrix(intArray10);
        Matrix matrix12 = null;
        boolean boolean13 = matrix11.equals(matrix12);
        int[] intArray15 = new int[] { (short) 0 };
        int[] intArray17 = new int[] { (short) 0 };
        int[][] intArray18 = new int[][] { intArray15, intArray17 };
        Matrix matrix19 = new Matrix(intArray18);
        Matrix matrix20 = matrix11.minus(matrix19);
        Matrix matrix21 = matrix5.plus(matrix20);
        Matrix matrix22 = matrix5.transpose();
        Class<?> wildcardClass23 = matrix5.getClass();
        try {
            int int26 = matrix5.getElement(0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(matrix22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        int[] intArray7 = new int[] { (short) 0 };
        int[] intArray9 = new int[] { (short) 0 };
        int[][] intArray10 = new int[][] { intArray7, intArray9 };
        Matrix matrix11 = new Matrix(intArray10);
        Matrix matrix12 = null;
        boolean boolean13 = matrix11.equals(matrix12);
        int[] intArray15 = new int[] { (short) 0 };
        int[] intArray17 = new int[] { (short) 0 };
        int[][] intArray18 = new int[][] { intArray15, intArray17 };
        Matrix matrix19 = new Matrix(intArray18);
        Matrix matrix20 = matrix11.minus(matrix19);
        Matrix matrix21 = matrix5.plus(matrix20);
        Matrix matrix22 = matrix5.transpose();
        Class<?> wildcardClass23 = matrix5.getClass();
        int[] intArray25 = new int[] { (short) 0 };
        int[] intArray27 = new int[] { (short) 0 };
        int[][] intArray28 = new int[][] { intArray25, intArray27 };
        Matrix matrix29 = new Matrix(intArray28);
        Matrix matrix30 = null;
        boolean boolean31 = matrix29.equals(matrix30);
        int[] intArray33 = new int[] { (short) 0 };
        int[] intArray35 = new int[] { (short) 0 };
        int[][] intArray36 = new int[][] { intArray33, intArray35 };
        Matrix matrix37 = new Matrix(intArray36);
        Matrix matrix38 = matrix29.minus(matrix37);
        Matrix matrix40 = matrix37.scale(1);
        String str41 = matrix37.toString();
        try {
            Matrix matrix42 = matrix5.multiply(matrix37);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The two matrices cannot be multiplied.");
        } catch (RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(matrix22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertNotNull(matrix40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "[ 0 ]\n[ 0 ]\n" + "'", str41.equals("[ 0 ]\n[ 0 ]\n"));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        Matrix matrix6 = null;
        boolean boolean7 = matrix5.equals(matrix6);
        int[] intArray9 = new int[] { (short) 0 };
        int[] intArray11 = new int[] { (short) 0 };
        int[][] intArray12 = new int[][] { intArray9, intArray11 };
        Matrix matrix13 = new Matrix(intArray12);
        Matrix matrix14 = matrix5.minus(matrix13);
        Matrix matrix16 = matrix13.scale(1);
        String str17 = matrix13.toString();
        Class<?> wildcardClass18 = matrix13.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[ 0 ]\n[ 0 ]\n" + "'", str17.equals("[ 0 ]\n[ 0 ]\n"));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        int[] intArray7 = new int[] { (short) 0 };
        int[] intArray9 = new int[] { (short) 0 };
        int[][] intArray10 = new int[][] { intArray7, intArray9 };
        Matrix matrix11 = new Matrix(intArray10);
        Matrix matrix12 = null;
        boolean boolean13 = matrix11.equals(matrix12);
        int[] intArray15 = new int[] { (short) 0 };
        int[] intArray17 = new int[] { (short) 0 };
        int[][] intArray18 = new int[][] { intArray15, intArray17 };
        Matrix matrix19 = new Matrix(intArray18);
        Matrix matrix20 = matrix11.minus(matrix19);
        Matrix matrix21 = matrix5.plus(matrix20);
        Matrix matrix22 = matrix5.transpose();
        int[] intArray24 = new int[] { (short) 0 };
        int[] intArray26 = new int[] { (short) 0 };
        int[][] intArray27 = new int[][] { intArray24, intArray26 };
        Matrix matrix28 = new Matrix(intArray27);
        Matrix matrix29 = null;
        boolean boolean30 = matrix28.equals(matrix29);
        int[] intArray32 = new int[] { (short) 0 };
        int[] intArray34 = new int[] { (short) 0 };
        int[][] intArray35 = new int[][] { intArray32, intArray34 };
        Matrix matrix36 = new Matrix(intArray35);
        Matrix matrix37 = matrix28.minus(matrix36);
        Matrix matrix39 = matrix36.scale(1);
        Matrix matrix41 = matrix39.scale(100);
        Matrix matrix42 = matrix5.minus(matrix41);
        int[] intArray44 = new int[] { (short) 0 };
        int[] intArray46 = new int[] { (short) 0 };
        int[][] intArray47 = new int[][] { intArray44, intArray46 };
        Matrix matrix48 = new Matrix(intArray47);
        int[] intArray50 = new int[] { (short) 0 };
        int[] intArray52 = new int[] { (short) 0 };
        int[][] intArray53 = new int[][] { intArray50, intArray52 };
        Matrix matrix54 = new Matrix(intArray53);
        Matrix matrix55 = null;
        boolean boolean56 = matrix54.equals(matrix55);
        int[] intArray58 = new int[] { (short) 0 };
        int[] intArray60 = new int[] { (short) 0 };
        int[][] intArray61 = new int[][] { intArray58, intArray60 };
        Matrix matrix62 = new Matrix(intArray61);
        Matrix matrix63 = matrix54.minus(matrix62);
        Matrix matrix64 = matrix48.plus(matrix63);
        Matrix matrix65 = matrix5.plus(matrix64);
        int int66 = matrix64.getColumns();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(matrix22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(matrix39);
        org.junit.Assert.assertNotNull(matrix41);
        org.junit.Assert.assertNotNull(matrix42);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertNotNull(matrix63);
        org.junit.Assert.assertNotNull(matrix64);
        org.junit.Assert.assertNotNull(matrix65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        int[] intArray7 = new int[] { (short) 0 };
        int[] intArray9 = new int[] { (short) 0 };
        int[][] intArray10 = new int[][] { intArray7, intArray9 };
        Matrix matrix11 = new Matrix(intArray10);
        Matrix matrix12 = null;
        boolean boolean13 = matrix11.equals(matrix12);
        int[] intArray15 = new int[] { (short) 0 };
        int[] intArray17 = new int[] { (short) 0 };
        int[][] intArray18 = new int[][] { intArray15, intArray17 };
        Matrix matrix19 = new Matrix(intArray18);
        Matrix matrix20 = matrix11.minus(matrix19);
        Matrix matrix22 = matrix19.scale(1);
        Matrix matrix23 = matrix5.minus(matrix19);
        int[] intArray25 = new int[] { (short) 0 };
        int[] intArray27 = new int[] { (short) 0 };
        int[][] intArray28 = new int[][] { intArray25, intArray27 };
        Matrix matrix29 = new Matrix(intArray28);
        Matrix matrix30 = null;
        boolean boolean31 = matrix29.equals(matrix30);
        int[] intArray33 = new int[] { (short) 0 };
        int[] intArray35 = new int[] { (short) 0 };
        int[][] intArray36 = new int[][] { intArray33, intArray35 };
        Matrix matrix37 = new Matrix(intArray36);
        Matrix matrix38 = matrix29.minus(matrix37);
        int int39 = matrix29.getColumns();
        Matrix matrix40 = matrix29.transpose();
        int[] intArray42 = new int[] { (short) 0 };
        int[] intArray44 = new int[] { (short) 0 };
        int[][] intArray45 = new int[][] { intArray42, intArray44 };
        Matrix matrix46 = new Matrix(intArray45);
        boolean boolean47 = matrix40.equals(matrix46);
        boolean boolean48 = matrix5.equals(matrix40);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix22);
        org.junit.Assert.assertNotNull(matrix23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertNotNull(matrix38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(matrix40);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        Matrix matrix6 = null;
        boolean boolean7 = matrix5.equals(matrix6);
        int[] intArray9 = new int[] { (short) 0 };
        int[] intArray11 = new int[] { (short) 0 };
        int[][] intArray12 = new int[][] { intArray9, intArray11 };
        Matrix matrix13 = new Matrix(intArray12);
        Matrix matrix14 = matrix5.minus(matrix13);
        Matrix matrix16 = matrix13.scale(1);
        int[] intArray18 = new int[] { (short) 0 };
        int[] intArray20 = new int[] { (short) 0 };
        int[][] intArray21 = new int[][] { intArray18, intArray20 };
        Matrix matrix22 = new Matrix(intArray21);
        Matrix matrix23 = null;
        boolean boolean24 = matrix22.equals(matrix23);
        int[] intArray26 = new int[] { (short) 0 };
        int[] intArray28 = new int[] { (short) 0 };
        int[][] intArray29 = new int[][] { intArray26, intArray28 };
        Matrix matrix30 = new Matrix(intArray29);
        Matrix matrix31 = matrix22.minus(matrix30);
        Matrix matrix33 = matrix30.scale(1);
        boolean boolean34 = matrix13.equals(matrix33);
        Matrix matrix36 = matrix33.scale((int) (byte) 1);
        try {
            int int39 = matrix33.getElement((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(matrix31);
        org.junit.Assert.assertNotNull(matrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(matrix36);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        int[] intArray1 = new int[] { (short) -1 };
        int[][] intArray2 = new int[][] { intArray1 };
        Matrix matrix3 = new Matrix(intArray2);
        String str4 = matrix3.toString();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[ -1 ]\n" + "'", str4.equals("[ -1 ]\n"));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        Matrix matrix6 = null;
        boolean boolean7 = matrix5.equals(matrix6);
        try {
            Matrix matrix9 = matrix5.divide((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        Matrix matrix6 = null;
        boolean boolean7 = matrix5.equals(matrix6);
        int[] intArray9 = new int[] { (short) 0 };
        int[] intArray11 = new int[] { (short) 0 };
        int[][] intArray12 = new int[][] { intArray9, intArray11 };
        Matrix matrix13 = new Matrix(intArray12);
        Matrix matrix14 = matrix5.minus(matrix13);
        int int15 = matrix5.getColumns();
        int int18 = matrix5.getElement(0, 0);
        int[] intArray20 = new int[] { (short) 0 };
        int[] intArray22 = new int[] { (short) 0 };
        int[][] intArray23 = new int[][] { intArray20, intArray22 };
        Matrix matrix24 = new Matrix(intArray23);
        Matrix matrix25 = null;
        boolean boolean26 = matrix24.equals(matrix25);
        int[] intArray28 = new int[] { (short) 0 };
        int[] intArray30 = new int[] { (short) 0 };
        int[][] intArray31 = new int[][] { intArray28, intArray30 };
        Matrix matrix32 = new Matrix(intArray31);
        Matrix matrix33 = matrix24.minus(matrix32);
        Matrix matrix35 = matrix32.scale(1);
        int[] intArray37 = new int[] { (short) 0 };
        int[] intArray39 = new int[] { (short) 0 };
        int[][] intArray40 = new int[][] { intArray37, intArray39 };
        Matrix matrix41 = new Matrix(intArray40);
        Matrix matrix42 = null;
        boolean boolean43 = matrix41.equals(matrix42);
        int[] intArray45 = new int[] { (short) 0 };
        int[] intArray47 = new int[] { (short) 0 };
        int[][] intArray48 = new int[][] { intArray45, intArray47 };
        Matrix matrix49 = new Matrix(intArray48);
        Matrix matrix50 = matrix41.minus(matrix49);
        Matrix matrix52 = matrix49.scale(1);
        boolean boolean53 = matrix32.equals(matrix52);
        boolean boolean54 = matrix5.equals(matrix52);
        int[] intArray56 = new int[] { (short) 0 };
        int[] intArray58 = new int[] { (short) 0 };
        int[][] intArray59 = new int[][] { intArray56, intArray58 };
        Matrix matrix60 = new Matrix(intArray59);
        Matrix matrix61 = null;
        boolean boolean62 = matrix60.equals(matrix61);
        int[] intArray64 = new int[] { (short) 0 };
        int[] intArray66 = new int[] { (short) 0 };
        int[][] intArray67 = new int[][] { intArray64, intArray66 };
        Matrix matrix68 = new Matrix(intArray67);
        Matrix matrix69 = matrix60.minus(matrix68);
        try {
            Matrix matrix70 = matrix52.multiply(matrix60);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The two matrices cannot be multiplied.");
        } catch (RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertNotNull(matrix33);
        org.junit.Assert.assertNotNull(matrix35);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertNotNull(matrix50);
        org.junit.Assert.assertNotNull(matrix52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertNotNull(matrix69);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        int[] intArray7 = new int[] { (short) 0 };
        int[] intArray9 = new int[] { (short) 0 };
        int[][] intArray10 = new int[][] { intArray7, intArray9 };
        Matrix matrix11 = new Matrix(intArray10);
        Matrix matrix12 = null;
        boolean boolean13 = matrix11.equals(matrix12);
        int[] intArray15 = new int[] { (short) 0 };
        int[] intArray17 = new int[] { (short) 0 };
        int[][] intArray18 = new int[][] { intArray15, intArray17 };
        Matrix matrix19 = new Matrix(intArray18);
        Matrix matrix20 = matrix11.minus(matrix19);
        Matrix matrix21 = matrix5.plus(matrix20);
        Matrix matrix22 = matrix5.transpose();
        int[] intArray24 = new int[] { (short) 0 };
        int[] intArray26 = new int[] { (short) 0 };
        int[][] intArray27 = new int[][] { intArray24, intArray26 };
        Matrix matrix28 = new Matrix(intArray27);
        Matrix matrix29 = null;
        boolean boolean30 = matrix28.equals(matrix29);
        int[] intArray32 = new int[] { (short) 0 };
        int[] intArray34 = new int[] { (short) 0 };
        int[][] intArray35 = new int[][] { intArray32, intArray34 };
        Matrix matrix36 = new Matrix(intArray35);
        Matrix matrix37 = matrix28.minus(matrix36);
        Matrix matrix39 = matrix36.scale(1);
        Matrix matrix41 = matrix39.scale(100);
        Matrix matrix42 = matrix5.minus(matrix41);
        Matrix matrix43 = matrix41.transpose();
        String str44 = matrix43.toString();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(matrix22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(matrix39);
        org.junit.Assert.assertNotNull(matrix41);
        org.junit.Assert.assertNotNull(matrix42);
        org.junit.Assert.assertNotNull(matrix43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "[ 0 0 ]\n" + "'", str44.equals("[ 0 0 ]\n"));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        int[] intArray0 = new int[] {};
        int[][] intArray1 = new int[][] { intArray0 };
        Matrix matrix2 = new Matrix(intArray1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        int[] intArray7 = new int[] { (short) 0 };
        int[] intArray9 = new int[] { (short) 0 };
        int[][] intArray10 = new int[][] { intArray7, intArray9 };
        Matrix matrix11 = new Matrix(intArray10);
        Matrix matrix12 = null;
        boolean boolean13 = matrix11.equals(matrix12);
        int[] intArray15 = new int[] { (short) 0 };
        int[] intArray17 = new int[] { (short) 0 };
        int[][] intArray18 = new int[][] { intArray15, intArray17 };
        Matrix matrix19 = new Matrix(intArray18);
        Matrix matrix20 = matrix11.minus(matrix19);
        Matrix matrix22 = matrix19.scale(1);
        Matrix matrix23 = matrix5.minus(matrix19);
        try {
            int int26 = matrix19.getElement(0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix22);
        org.junit.Assert.assertNotNull(matrix23);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        Matrix matrix6 = null;
        boolean boolean7 = matrix5.equals(matrix6);
        int[] intArray9 = new int[] { (short) 0 };
        int[] intArray11 = new int[] { (short) 0 };
        int[][] intArray12 = new int[][] { intArray9, intArray11 };
        Matrix matrix13 = new Matrix(intArray12);
        Matrix matrix14 = matrix5.minus(matrix13);
        Matrix matrix16 = matrix13.scale(1);
        Matrix matrix18 = matrix16.divide(10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(matrix18);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        int[] intArray7 = new int[] { (short) 0 };
        int[] intArray9 = new int[] { (short) 0 };
        int[][] intArray10 = new int[][] { intArray7, intArray9 };
        Matrix matrix11 = new Matrix(intArray10);
        Matrix matrix12 = null;
        boolean boolean13 = matrix11.equals(matrix12);
        int[] intArray15 = new int[] { (short) 0 };
        int[] intArray17 = new int[] { (short) 0 };
        int[][] intArray18 = new int[][] { intArray15, intArray17 };
        Matrix matrix19 = new Matrix(intArray18);
        Matrix matrix20 = matrix11.minus(matrix19);
        Matrix matrix21 = matrix5.plus(matrix20);
        Matrix matrix22 = matrix5.transpose();
        int[] intArray24 = new int[] { (short) 0 };
        int[] intArray26 = new int[] { (short) 0 };
        int[][] intArray27 = new int[][] { intArray24, intArray26 };
        Matrix matrix28 = new Matrix(intArray27);
        Matrix matrix29 = null;
        boolean boolean30 = matrix28.equals(matrix29);
        int[] intArray32 = new int[] { (short) 0 };
        int[] intArray34 = new int[] { (short) 0 };
        int[][] intArray35 = new int[][] { intArray32, intArray34 };
        Matrix matrix36 = new Matrix(intArray35);
        Matrix matrix37 = matrix28.minus(matrix36);
        Matrix matrix39 = matrix36.scale(1);
        Matrix matrix41 = matrix39.scale(100);
        Matrix matrix42 = matrix5.minus(matrix41);
        int[] intArray44 = new int[] { (short) 0 };
        int[] intArray46 = new int[] { (short) 0 };
        int[][] intArray47 = new int[][] { intArray44, intArray46 };
        Matrix matrix48 = new Matrix(intArray47);
        int[] intArray50 = new int[] { (short) 0 };
        int[] intArray52 = new int[] { (short) 0 };
        int[][] intArray53 = new int[][] { intArray50, intArray52 };
        Matrix matrix54 = new Matrix(intArray53);
        Matrix matrix55 = null;
        boolean boolean56 = matrix54.equals(matrix55);
        int[] intArray58 = new int[] { (short) 0 };
        int[] intArray60 = new int[] { (short) 0 };
        int[][] intArray61 = new int[][] { intArray58, intArray60 };
        Matrix matrix62 = new Matrix(intArray61);
        Matrix matrix63 = matrix54.minus(matrix62);
        Matrix matrix64 = matrix48.plus(matrix63);
        Matrix matrix65 = matrix5.plus(matrix64);
        int int66 = matrix65.getRows();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(matrix22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(matrix39);
        org.junit.Assert.assertNotNull(matrix41);
        org.junit.Assert.assertNotNull(matrix42);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertNotNull(matrix63);
        org.junit.Assert.assertNotNull(matrix64);
        org.junit.Assert.assertNotNull(matrix65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        int int6 = matrix5.getColumns();
        Matrix matrix7 = matrix5.transpose();
        try {
            int int10 = matrix5.getElement((int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(matrix7);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        int[] intArray7 = new int[] { (short) 0 };
        int[] intArray9 = new int[] { (short) 0 };
        int[][] intArray10 = new int[][] { intArray7, intArray9 };
        Matrix matrix11 = new Matrix(intArray10);
        Matrix matrix12 = null;
        boolean boolean13 = matrix11.equals(matrix12);
        int[] intArray15 = new int[] { (short) 0 };
        int[] intArray17 = new int[] { (short) 0 };
        int[][] intArray18 = new int[][] { intArray15, intArray17 };
        Matrix matrix19 = new Matrix(intArray18);
        Matrix matrix20 = matrix11.minus(matrix19);
        Matrix matrix21 = matrix5.plus(matrix20);
        String str22 = matrix21.toString();
        try {
            Matrix matrix24 = matrix21.divide((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[ 0 ]\n[ 0 ]\n" + "'", str22.equals("[ 0 ]\n[ 0 ]\n"));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        int[] intArray7 = new int[] { (short) 0 };
        int[] intArray9 = new int[] { (short) 0 };
        int[][] intArray10 = new int[][] { intArray7, intArray9 };
        Matrix matrix11 = new Matrix(intArray10);
        int[] intArray13 = new int[] { (short) 0 };
        int[] intArray15 = new int[] { (short) 0 };
        int[][] intArray16 = new int[][] { intArray13, intArray15 };
        Matrix matrix17 = new Matrix(intArray16);
        Matrix matrix18 = null;
        boolean boolean19 = matrix17.equals(matrix18);
        int[] intArray21 = new int[] { (short) 0 };
        int[] intArray23 = new int[] { (short) 0 };
        int[][] intArray24 = new int[][] { intArray21, intArray23 };
        Matrix matrix25 = new Matrix(intArray24);
        Matrix matrix26 = matrix17.minus(matrix25);
        Matrix matrix27 = matrix11.plus(matrix26);
        Matrix matrix28 = matrix11.transpose();
        int[] intArray30 = new int[] { (short) 0 };
        int[] intArray32 = new int[] { (short) 0 };
        int[][] intArray33 = new int[][] { intArray30, intArray32 };
        Matrix matrix34 = new Matrix(intArray33);
        Matrix matrix35 = null;
        boolean boolean36 = matrix34.equals(matrix35);
        int[] intArray38 = new int[] { (short) 0 };
        int[] intArray40 = new int[] { (short) 0 };
        int[][] intArray41 = new int[][] { intArray38, intArray40 };
        Matrix matrix42 = new Matrix(intArray41);
        Matrix matrix43 = matrix34.minus(matrix42);
        Matrix matrix45 = matrix42.scale(1);
        Matrix matrix47 = matrix45.scale(100);
        Matrix matrix48 = matrix11.minus(matrix47);
        try {
            Matrix matrix49 = matrix5.multiply(matrix47);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The two matrices cannot be multiplied.");
        } catch (RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(matrix26);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(matrix28);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertNotNull(matrix43);
        org.junit.Assert.assertNotNull(matrix45);
        org.junit.Assert.assertNotNull(matrix47);
        org.junit.Assert.assertNotNull(matrix48);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        int[] intArray7 = new int[] { (short) 0 };
        int[] intArray9 = new int[] { (short) 0 };
        int[][] intArray10 = new int[][] { intArray7, intArray9 };
        Matrix matrix11 = new Matrix(intArray10);
        Matrix matrix12 = null;
        boolean boolean13 = matrix11.equals(matrix12);
        int[] intArray15 = new int[] { (short) 0 };
        int[] intArray17 = new int[] { (short) 0 };
        int[][] intArray18 = new int[][] { intArray15, intArray17 };
        Matrix matrix19 = new Matrix(intArray18);
        Matrix matrix20 = matrix11.minus(matrix19);
        Matrix matrix21 = matrix5.plus(matrix20);
        Matrix matrix22 = matrix5.transpose();
        int[] intArray24 = new int[] { (short) 0 };
        int[] intArray26 = new int[] { (short) 0 };
        int[][] intArray27 = new int[][] { intArray24, intArray26 };
        Matrix matrix28 = new Matrix(intArray27);
        Matrix matrix29 = null;
        boolean boolean30 = matrix28.equals(matrix29);
        int[] intArray32 = new int[] { (short) 0 };
        int[] intArray34 = new int[] { (short) 0 };
        int[][] intArray35 = new int[][] { intArray32, intArray34 };
        Matrix matrix36 = new Matrix(intArray35);
        Matrix matrix37 = matrix28.minus(matrix36);
        Matrix matrix39 = matrix36.scale(1);
        Matrix matrix41 = matrix39.scale(100);
        Matrix matrix42 = matrix5.minus(matrix41);
        int[] intArray44 = new int[] { (short) 0 };
        int[] intArray46 = new int[] { (short) 0 };
        int[][] intArray47 = new int[][] { intArray44, intArray46 };
        Matrix matrix48 = new Matrix(intArray47);
        int[] intArray50 = new int[] { (short) 0 };
        int[] intArray52 = new int[] { (short) 0 };
        int[][] intArray53 = new int[][] { intArray50, intArray52 };
        Matrix matrix54 = new Matrix(intArray53);
        Matrix matrix55 = null;
        boolean boolean56 = matrix54.equals(matrix55);
        int[] intArray58 = new int[] { (short) 0 };
        int[] intArray60 = new int[] { (short) 0 };
        int[][] intArray61 = new int[][] { intArray58, intArray60 };
        Matrix matrix62 = new Matrix(intArray61);
        Matrix matrix63 = matrix54.minus(matrix62);
        Matrix matrix64 = matrix48.plus(matrix63);
        Matrix matrix65 = matrix5.plus(matrix64);
        String str66 = matrix65.toString();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(matrix22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(matrix39);
        org.junit.Assert.assertNotNull(matrix41);
        org.junit.Assert.assertNotNull(matrix42);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertNotNull(matrix63);
        org.junit.Assert.assertNotNull(matrix64);
        org.junit.Assert.assertNotNull(matrix65);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "[ 0 ]\n[ 0 ]\n" + "'", str66.equals("[ 0 ]\n[ 0 ]\n"));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        Matrix matrix6 = null;
        boolean boolean7 = matrix5.equals(matrix6);
        int[] intArray9 = new int[] { (short) 0 };
        int[] intArray11 = new int[] { (short) 0 };
        int[][] intArray12 = new int[][] { intArray9, intArray11 };
        Matrix matrix13 = new Matrix(intArray12);
        Matrix matrix14 = matrix5.minus(matrix13);
        Matrix matrix16 = matrix13.scale(1);
        int[] intArray18 = new int[] { (short) 0 };
        int[] intArray20 = new int[] { (short) 0 };
        int[][] intArray21 = new int[][] { intArray18, intArray20 };
        Matrix matrix22 = new Matrix(intArray21);
        Matrix matrix23 = null;
        boolean boolean24 = matrix22.equals(matrix23);
        int[] intArray26 = new int[] { (short) 0 };
        int[] intArray28 = new int[] { (short) 0 };
        int[][] intArray29 = new int[][] { intArray26, intArray28 };
        Matrix matrix30 = new Matrix(intArray29);
        Matrix matrix31 = matrix22.minus(matrix30);
        Matrix matrix33 = matrix30.scale(1);
        boolean boolean34 = matrix13.equals(matrix33);
        Matrix matrix36 = matrix33.scale((int) (byte) 1);
        int[] intArray38 = new int[] { (short) 0 };
        int[] intArray40 = new int[] { (short) 0 };
        int[][] intArray41 = new int[][] { intArray38, intArray40 };
        Matrix matrix42 = new Matrix(intArray41);
        Matrix matrix43 = null;
        boolean boolean44 = matrix42.equals(matrix43);
        int[] intArray46 = new int[] { (short) 0 };
        int[] intArray48 = new int[] { (short) 0 };
        int[][] intArray49 = new int[][] { intArray46, intArray48 };
        Matrix matrix50 = new Matrix(intArray49);
        Matrix matrix51 = matrix42.minus(matrix50);
        int int52 = matrix42.getColumns();
        try {
            Matrix matrix53 = matrix33.multiply(matrix42);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The two matrices cannot be multiplied.");
        } catch (RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(matrix31);
        org.junit.Assert.assertNotNull(matrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(matrix36);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertNotNull(matrix51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        Matrix matrix6 = null;
        boolean boolean7 = matrix5.equals(matrix6);
        int[] intArray9 = new int[] { (short) 0 };
        int[] intArray11 = new int[] { (short) 0 };
        int[][] intArray12 = new int[][] { intArray9, intArray11 };
        Matrix matrix13 = new Matrix(intArray12);
        Matrix matrix14 = matrix5.minus(matrix13);
        Matrix matrix16 = matrix13.scale(1);
        String str17 = matrix13.toString();
        Matrix matrix19 = matrix13.divide((int) (byte) -1);
        int[] intArray21 = new int[] { (short) 0 };
        int[] intArray23 = new int[] { (short) 0 };
        int[][] intArray24 = new int[][] { intArray21, intArray23 };
        Matrix matrix25 = new Matrix(intArray24);
        Matrix matrix26 = null;
        boolean boolean27 = matrix25.equals(matrix26);
        int[] intArray29 = new int[] { (short) 0 };
        int[] intArray31 = new int[] { (short) 0 };
        int[][] intArray32 = new int[][] { intArray29, intArray31 };
        Matrix matrix33 = new Matrix(intArray32);
        Matrix matrix34 = matrix25.minus(matrix33);
        Matrix matrix35 = matrix19.plus(matrix33);
        int[] intArray37 = new int[] { (short) 0 };
        int[] intArray39 = new int[] { (short) 0 };
        int[][] intArray40 = new int[][] { intArray37, intArray39 };
        Matrix matrix41 = new Matrix(intArray40);
        Matrix matrix42 = null;
        boolean boolean43 = matrix41.equals(matrix42);
        int[] intArray45 = new int[] { (short) 0 };
        int[] intArray47 = new int[] { (short) 0 };
        int[][] intArray48 = new int[][] { intArray45, intArray47 };
        Matrix matrix49 = new Matrix(intArray48);
        Matrix matrix50 = matrix41.minus(matrix49);
        int int51 = matrix41.getColumns();
        Matrix matrix52 = matrix41.transpose();
        int[] intArray54 = new int[] { (short) 0 };
        int[] intArray56 = new int[] { (short) 0 };
        int[][] intArray57 = new int[][] { intArray54, intArray56 };
        Matrix matrix58 = new Matrix(intArray57);
        boolean boolean59 = matrix52.equals(matrix58);
        Class<?> wildcardClass60 = matrix58.getClass();
        int int61 = matrix58.getColumns();
        try {
            Matrix matrix62 = matrix19.multiply(matrix58);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The two matrices cannot be multiplied.");
        } catch (RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[ 0 ]\n[ 0 ]\n" + "'", str17.equals("[ 0 ]\n[ 0 ]\n"));
        org.junit.Assert.assertNotNull(matrix19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(matrix34);
        org.junit.Assert.assertNotNull(matrix35);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertNotNull(matrix50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(matrix52);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        Matrix matrix6 = null;
        boolean boolean7 = matrix5.equals(matrix6);
        int[] intArray9 = new int[] { (short) 0 };
        int[] intArray11 = new int[] { (short) 0 };
        int[][] intArray12 = new int[][] { intArray9, intArray11 };
        Matrix matrix13 = new Matrix(intArray12);
        Matrix matrix14 = matrix5.minus(matrix13);
        Matrix matrix16 = matrix13.scale(1);
        String str17 = matrix13.toString();
        Matrix matrix19 = matrix13.divide((int) (byte) -1);
        int[] intArray21 = new int[] { (short) 0 };
        int[] intArray23 = new int[] { (short) 0 };
        int[][] intArray24 = new int[][] { intArray21, intArray23 };
        Matrix matrix25 = new Matrix(intArray24);
        Matrix matrix26 = null;
        boolean boolean27 = matrix25.equals(matrix26);
        int[] intArray29 = new int[] { (short) 0 };
        int[] intArray31 = new int[] { (short) 0 };
        int[][] intArray32 = new int[][] { intArray29, intArray31 };
        Matrix matrix33 = new Matrix(intArray32);
        Matrix matrix34 = matrix25.minus(matrix33);
        Matrix matrix35 = matrix19.plus(matrix33);
        Matrix matrix37 = matrix35.divide((int) (short) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[ 0 ]\n[ 0 ]\n" + "'", str17.equals("[ 0 ]\n[ 0 ]\n"));
        org.junit.Assert.assertNotNull(matrix19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(matrix34);
        org.junit.Assert.assertNotNull(matrix35);
        org.junit.Assert.assertNotNull(matrix37);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        Matrix matrix6 = null;
        boolean boolean7 = matrix5.equals(matrix6);
        int[] intArray9 = new int[] { (short) 0 };
        int[] intArray11 = new int[] { (short) 0 };
        int[][] intArray12 = new int[][] { intArray9, intArray11 };
        Matrix matrix13 = new Matrix(intArray12);
        Matrix matrix14 = matrix5.minus(matrix13);
        int int15 = matrix5.getColumns();
        int[] intArray17 = new int[] { (short) 0 };
        int[] intArray19 = new int[] { (short) 0 };
        int[][] intArray20 = new int[][] { intArray17, intArray19 };
        Matrix matrix21 = new Matrix(intArray20);
        Matrix matrix22 = null;
        boolean boolean23 = matrix21.equals(matrix22);
        int[] intArray25 = new int[] { (short) 0 };
        int[] intArray27 = new int[] { (short) 0 };
        int[][] intArray28 = new int[][] { intArray25, intArray27 };
        Matrix matrix29 = new Matrix(intArray28);
        Matrix matrix30 = matrix21.minus(matrix29);
        int int31 = matrix21.getColumns();
        Matrix matrix32 = matrix21.transpose();
        boolean boolean33 = matrix5.equals(matrix21);
        String str34 = matrix21.toString();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(matrix30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[ 0 ]\n[ 0 ]\n" + "'", str34.equals("[ 0 ]\n[ 0 ]\n"));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        int[] intArray7 = new int[] { (short) 0 };
        int[] intArray9 = new int[] { (short) 0 };
        int[][] intArray10 = new int[][] { intArray7, intArray9 };
        Matrix matrix11 = new Matrix(intArray10);
        Matrix matrix12 = null;
        boolean boolean13 = matrix11.equals(matrix12);
        int[] intArray15 = new int[] { (short) 0 };
        int[] intArray17 = new int[] { (short) 0 };
        int[][] intArray18 = new int[][] { intArray15, intArray17 };
        Matrix matrix19 = new Matrix(intArray18);
        Matrix matrix20 = matrix11.minus(matrix19);
        Matrix matrix21 = matrix5.plus(matrix20);
        Matrix matrix22 = matrix5.transpose();
        int[] intArray24 = new int[] { (short) 0 };
        int[] intArray26 = new int[] { (short) 0 };
        int[][] intArray27 = new int[][] { intArray24, intArray26 };
        Matrix matrix28 = new Matrix(intArray27);
        Matrix matrix29 = null;
        boolean boolean30 = matrix28.equals(matrix29);
        int[] intArray32 = new int[] { (short) 0 };
        int[] intArray34 = new int[] { (short) 0 };
        int[][] intArray35 = new int[][] { intArray32, intArray34 };
        Matrix matrix36 = new Matrix(intArray35);
        Matrix matrix37 = matrix28.minus(matrix36);
        Matrix matrix39 = matrix36.scale(1);
        Matrix matrix41 = matrix39.scale(100);
        Matrix matrix42 = matrix5.minus(matrix41);
        Matrix matrix43 = matrix41.transpose();
        String str44 = matrix41.toString();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(matrix22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(matrix39);
        org.junit.Assert.assertNotNull(matrix41);
        org.junit.Assert.assertNotNull(matrix42);
        org.junit.Assert.assertNotNull(matrix43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "[ 0 ]\n[ 0 ]\n" + "'", str44.equals("[ 0 ]\n[ 0 ]\n"));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        Matrix matrix6 = null;
        boolean boolean7 = matrix5.equals(matrix6);
        int[] intArray9 = new int[] { (short) 0 };
        int[] intArray11 = new int[] { (short) 0 };
        int[][] intArray12 = new int[][] { intArray9, intArray11 };
        Matrix matrix13 = new Matrix(intArray12);
        Matrix matrix14 = matrix5.minus(matrix13);
        int int15 = matrix5.getColumns();
        int[] intArray17 = new int[] { (short) 0 };
        int[] intArray19 = new int[] { (short) 0 };
        int[][] intArray20 = new int[][] { intArray17, intArray19 };
        Matrix matrix21 = new Matrix(intArray20);
        Matrix matrix22 = null;
        boolean boolean23 = matrix21.equals(matrix22);
        int[] intArray25 = new int[] { (short) 0 };
        int[] intArray27 = new int[] { (short) 0 };
        int[][] intArray28 = new int[][] { intArray25, intArray27 };
        Matrix matrix29 = new Matrix(intArray28);
        Matrix matrix30 = matrix21.minus(matrix29);
        int int31 = matrix21.getColumns();
        Matrix matrix32 = matrix21.transpose();
        boolean boolean33 = matrix5.equals(matrix21);
        Matrix matrix34 = null;
        try {
            Matrix matrix35 = matrix5.plus(matrix34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(matrix30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        Matrix matrix6 = null;
        boolean boolean7 = matrix5.equals(matrix6);
        int[] intArray9 = new int[] { (short) 0 };
        int[] intArray11 = new int[] { (short) 0 };
        int[][] intArray12 = new int[][] { intArray9, intArray11 };
        Matrix matrix13 = new Matrix(intArray12);
        Matrix matrix14 = matrix5.minus(matrix13);
        int int15 = matrix5.getColumns();
        int[] intArray17 = new int[] { (short) 0 };
        int[] intArray19 = new int[] { (short) 0 };
        int[][] intArray20 = new int[][] { intArray17, intArray19 };
        Matrix matrix21 = new Matrix(intArray20);
        Matrix matrix22 = null;
        boolean boolean23 = matrix21.equals(matrix22);
        int[] intArray25 = new int[] { (short) 0 };
        int[] intArray27 = new int[] { (short) 0 };
        int[][] intArray28 = new int[][] { intArray25, intArray27 };
        Matrix matrix29 = new Matrix(intArray28);
        Matrix matrix30 = matrix21.minus(matrix29);
        Matrix matrix32 = matrix29.scale(1);
        Matrix matrix34 = matrix32.scale(100);
        Matrix matrix35 = matrix5.minus(matrix34);
        Matrix matrix36 = null;
        try {
            Matrix matrix37 = matrix5.minus(matrix36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(matrix30);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertNotNull(matrix34);
        org.junit.Assert.assertNotNull(matrix35);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        int[] intArray7 = new int[] { (short) 0 };
        int[] intArray9 = new int[] { (short) 0 };
        int[][] intArray10 = new int[][] { intArray7, intArray9 };
        Matrix matrix11 = new Matrix(intArray10);
        Matrix matrix12 = null;
        boolean boolean13 = matrix11.equals(matrix12);
        int[] intArray15 = new int[] { (short) 0 };
        int[] intArray17 = new int[] { (short) 0 };
        int[][] intArray18 = new int[][] { intArray15, intArray17 };
        Matrix matrix19 = new Matrix(intArray18);
        Matrix matrix20 = matrix11.minus(matrix19);
        Matrix matrix21 = matrix5.plus(matrix20);
        Matrix matrix22 = matrix5.transpose();
        int[] intArray24 = new int[] { (short) 0 };
        int[] intArray26 = new int[] { (short) 0 };
        int[][] intArray27 = new int[][] { intArray24, intArray26 };
        Matrix matrix28 = new Matrix(intArray27);
        Matrix matrix29 = null;
        boolean boolean30 = matrix28.equals(matrix29);
        int[] intArray32 = new int[] { (short) 0 };
        int[] intArray34 = new int[] { (short) 0 };
        int[][] intArray35 = new int[][] { intArray32, intArray34 };
        Matrix matrix36 = new Matrix(intArray35);
        Matrix matrix37 = matrix28.minus(matrix36);
        Matrix matrix39 = matrix36.scale(1);
        Matrix matrix41 = matrix39.scale(100);
        Matrix matrix42 = matrix5.minus(matrix41);
        Matrix matrix43 = matrix41.transpose();
        int int44 = matrix41.getRows();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(matrix22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(matrix39);
        org.junit.Assert.assertNotNull(matrix41);
        org.junit.Assert.assertNotNull(matrix42);
        org.junit.Assert.assertNotNull(matrix43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        Matrix matrix6 = null;
        boolean boolean7 = matrix5.equals(matrix6);
        int[] intArray9 = new int[] { (short) 0 };
        int[] intArray11 = new int[] { (short) 0 };
        int[][] intArray12 = new int[][] { intArray9, intArray11 };
        Matrix matrix13 = new Matrix(intArray12);
        Matrix matrix14 = matrix5.minus(matrix13);
        Matrix matrix16 = matrix13.scale(1);
        String str17 = matrix13.toString();
        Matrix matrix19 = matrix13.divide((int) (byte) -1);
        int[] intArray21 = new int[] { (short) 0 };
        int[] intArray23 = new int[] { (short) 0 };
        int[][] intArray24 = new int[][] { intArray21, intArray23 };
        Matrix matrix25 = new Matrix(intArray24);
        Matrix matrix26 = null;
        boolean boolean27 = matrix25.equals(matrix26);
        int[] intArray29 = new int[] { (short) 0 };
        int[] intArray31 = new int[] { (short) 0 };
        int[][] intArray32 = new int[][] { intArray29, intArray31 };
        Matrix matrix33 = new Matrix(intArray32);
        Matrix matrix34 = matrix25.minus(matrix33);
        Matrix matrix36 = matrix33.scale(1);
        String str37 = matrix33.toString();
        Matrix matrix39 = matrix33.divide((int) (byte) -1);
        int[] intArray41 = new int[] { (short) 0 };
        int[] intArray43 = new int[] { (short) 0 };
        int[][] intArray44 = new int[][] { intArray41, intArray43 };
        Matrix matrix45 = new Matrix(intArray44);
        Matrix matrix46 = null;
        boolean boolean47 = matrix45.equals(matrix46);
        int[] intArray49 = new int[] { (short) 0 };
        int[] intArray51 = new int[] { (short) 0 };
        int[][] intArray52 = new int[][] { intArray49, intArray51 };
        Matrix matrix53 = new Matrix(intArray52);
        Matrix matrix54 = matrix45.minus(matrix53);
        Matrix matrix55 = matrix39.plus(matrix53);
        boolean boolean56 = matrix13.equals(matrix55);
        Class<?> wildcardClass57 = matrix13.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[ 0 ]\n[ 0 ]\n" + "'", str17.equals("[ 0 ]\n[ 0 ]\n"));
        org.junit.Assert.assertNotNull(matrix19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(matrix34);
        org.junit.Assert.assertNotNull(matrix36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "[ 0 ]\n[ 0 ]\n" + "'", str37.equals("[ 0 ]\n[ 0 ]\n"));
        org.junit.Assert.assertNotNull(matrix39);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertNotNull(matrix54);
        org.junit.Assert.assertNotNull(matrix55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        Matrix matrix6 = null;
        boolean boolean7 = matrix5.equals(matrix6);
        int[] intArray9 = new int[] { (short) 0 };
        int[] intArray11 = new int[] { (short) 0 };
        int[][] intArray12 = new int[][] { intArray9, intArray11 };
        Matrix matrix13 = new Matrix(intArray12);
        Matrix matrix14 = matrix5.minus(matrix13);
        int int15 = matrix5.getColumns();
        Matrix matrix16 = matrix5.transpose();
        int[] intArray18 = new int[] { (short) 0 };
        int[] intArray20 = new int[] { (short) 0 };
        int[][] intArray21 = new int[][] { intArray18, intArray20 };
        Matrix matrix22 = new Matrix(intArray21);
        boolean boolean23 = matrix16.equals(matrix22);
        Class<?> wildcardClass24 = matrix22.getClass();
        int int25 = matrix22.getColumns();
        try {
            int int28 = matrix22.getElement((int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        Matrix matrix6 = null;
        boolean boolean7 = matrix5.equals(matrix6);
        int[] intArray9 = new int[] { (short) 0 };
        int[] intArray11 = new int[] { (short) 0 };
        int[][] intArray12 = new int[][] { intArray9, intArray11 };
        Matrix matrix13 = new Matrix(intArray12);
        Matrix matrix14 = matrix5.minus(matrix13);
        int int15 = matrix5.getColumns();
        Matrix matrix16 = matrix5.transpose();
        int[] intArray18 = new int[] { (short) 0 };
        int[] intArray20 = new int[] { (short) 0 };
        int[][] intArray21 = new int[][] { intArray18, intArray20 };
        Matrix matrix22 = new Matrix(intArray21);
        boolean boolean23 = matrix16.equals(matrix22);
        String str24 = matrix16.toString();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[ 0 0 ]\n" + "'", str24.equals("[ 0 0 ]\n"));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        Matrix matrix6 = null;
        boolean boolean7 = matrix5.equals(matrix6);
        int[] intArray9 = new int[] { (short) 0 };
        int[] intArray11 = new int[] { (short) 0 };
        int[][] intArray12 = new int[][] { intArray9, intArray11 };
        Matrix matrix13 = new Matrix(intArray12);
        Matrix matrix14 = matrix5.minus(matrix13);
        Matrix matrix16 = matrix13.scale(1);
        int[] intArray18 = new int[] { (short) 0 };
        int[] intArray20 = new int[] { (short) 0 };
        int[][] intArray21 = new int[][] { intArray18, intArray20 };
        Matrix matrix22 = new Matrix(intArray21);
        Matrix matrix23 = null;
        boolean boolean24 = matrix22.equals(matrix23);
        int[] intArray26 = new int[] { (short) 0 };
        int[] intArray28 = new int[] { (short) 0 };
        int[][] intArray29 = new int[][] { intArray26, intArray28 };
        Matrix matrix30 = new Matrix(intArray29);
        Matrix matrix31 = matrix22.minus(matrix30);
        Matrix matrix33 = matrix30.scale(1);
        boolean boolean34 = matrix13.equals(matrix33);
        int[] intArray36 = new int[] { (short) 0 };
        int[] intArray38 = new int[] { (short) 0 };
        int[][] intArray39 = new int[][] { intArray36, intArray38 };
        Matrix matrix40 = new Matrix(intArray39);
        Matrix matrix41 = null;
        boolean boolean42 = matrix40.equals(matrix41);
        int[] intArray44 = new int[] { (short) 0 };
        int[] intArray46 = new int[] { (short) 0 };
        int[][] intArray47 = new int[][] { intArray44, intArray46 };
        Matrix matrix48 = new Matrix(intArray47);
        Matrix matrix49 = matrix40.minus(matrix48);
        Matrix matrix51 = matrix48.scale(1);
        int[] intArray53 = new int[] { (short) 0 };
        int[] intArray55 = new int[] { (short) 0 };
        int[][] intArray56 = new int[][] { intArray53, intArray55 };
        Matrix matrix57 = new Matrix(intArray56);
        Matrix matrix58 = null;
        boolean boolean59 = matrix57.equals(matrix58);
        int[] intArray61 = new int[] { (short) 0 };
        int[] intArray63 = new int[] { (short) 0 };
        int[][] intArray64 = new int[][] { intArray61, intArray63 };
        Matrix matrix65 = new Matrix(intArray64);
        Matrix matrix66 = matrix57.minus(matrix65);
        Matrix matrix68 = matrix65.scale(1);
        boolean boolean69 = matrix48.equals(matrix68);
        Matrix matrix71 = matrix68.scale((int) (byte) 1);
        Matrix matrix73 = matrix68.scale((int) (byte) 0);
        boolean boolean74 = matrix13.equals(matrix68);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(matrix31);
        org.junit.Assert.assertNotNull(matrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertNotNull(matrix49);
        org.junit.Assert.assertNotNull(matrix51);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertNotNull(matrix66);
        org.junit.Assert.assertNotNull(matrix68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(matrix71);
        org.junit.Assert.assertNotNull(matrix73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        int[] intArray7 = new int[] { (short) 0 };
        int[] intArray9 = new int[] { (short) 0 };
        int[][] intArray10 = new int[][] { intArray7, intArray9 };
        Matrix matrix11 = new Matrix(intArray10);
        Matrix matrix12 = null;
        boolean boolean13 = matrix11.equals(matrix12);
        int[] intArray15 = new int[] { (short) 0 };
        int[] intArray17 = new int[] { (short) 0 };
        int[][] intArray18 = new int[][] { intArray15, intArray17 };
        Matrix matrix19 = new Matrix(intArray18);
        Matrix matrix20 = matrix11.minus(matrix19);
        Matrix matrix21 = matrix5.plus(matrix20);
        Matrix matrix22 = matrix5.transpose();
        try {
            Matrix matrix24 = matrix22.divide(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(matrix22);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        int[] intArray7 = new int[] { (short) 0 };
        int[] intArray9 = new int[] { (short) 0 };
        int[][] intArray10 = new int[][] { intArray7, intArray9 };
        Matrix matrix11 = new Matrix(intArray10);
        Matrix matrix12 = null;
        boolean boolean13 = matrix11.equals(matrix12);
        int[] intArray15 = new int[] { (short) 0 };
        int[] intArray17 = new int[] { (short) 0 };
        int[][] intArray18 = new int[][] { intArray15, intArray17 };
        Matrix matrix19 = new Matrix(intArray18);
        Matrix matrix20 = matrix11.minus(matrix19);
        Matrix matrix21 = matrix5.plus(matrix20);
        Matrix matrix22 = matrix5.transpose();
        int[] intArray24 = new int[] { (short) 0 };
        int[] intArray26 = new int[] { (short) 0 };
        int[][] intArray27 = new int[][] { intArray24, intArray26 };
        Matrix matrix28 = new Matrix(intArray27);
        Matrix matrix29 = null;
        boolean boolean30 = matrix28.equals(matrix29);
        int[] intArray32 = new int[] { (short) 0 };
        int[] intArray34 = new int[] { (short) 0 };
        int[][] intArray35 = new int[][] { intArray32, intArray34 };
        Matrix matrix36 = new Matrix(intArray35);
        Matrix matrix37 = matrix28.minus(matrix36);
        Matrix matrix39 = matrix36.scale(1);
        Matrix matrix41 = matrix39.scale(100);
        Matrix matrix42 = matrix5.minus(matrix41);
        int[] intArray44 = new int[] { (short) 0 };
        int[] intArray46 = new int[] { (short) 0 };
        int[][] intArray47 = new int[][] { intArray44, intArray46 };
        Matrix matrix48 = new Matrix(intArray47);
        int[] intArray50 = new int[] { (short) 0 };
        int[] intArray52 = new int[] { (short) 0 };
        int[][] intArray53 = new int[][] { intArray50, intArray52 };
        Matrix matrix54 = new Matrix(intArray53);
        Matrix matrix55 = null;
        boolean boolean56 = matrix54.equals(matrix55);
        int[] intArray58 = new int[] { (short) 0 };
        int[] intArray60 = new int[] { (short) 0 };
        int[][] intArray61 = new int[][] { intArray58, intArray60 };
        Matrix matrix62 = new Matrix(intArray61);
        Matrix matrix63 = matrix54.minus(matrix62);
        Matrix matrix64 = matrix48.plus(matrix63);
        Matrix matrix65 = matrix5.plus(matrix64);
        int int66 = matrix64.getRows();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(matrix22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(matrix39);
        org.junit.Assert.assertNotNull(matrix41);
        org.junit.Assert.assertNotNull(matrix42);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertNotNull(matrix63);
        org.junit.Assert.assertNotNull(matrix64);
        org.junit.Assert.assertNotNull(matrix65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        Matrix matrix6 = null;
        boolean boolean7 = matrix5.equals(matrix6);
        int[] intArray9 = new int[] { (short) 0 };
        int[] intArray11 = new int[] { (short) 0 };
        int[][] intArray12 = new int[][] { intArray9, intArray11 };
        Matrix matrix13 = new Matrix(intArray12);
        Matrix matrix14 = matrix5.minus(matrix13);
        int int15 = matrix14.getColumns();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        int[] intArray7 = new int[] { (short) 0 };
        int[] intArray9 = new int[] { (short) 0 };
        int[][] intArray10 = new int[][] { intArray7, intArray9 };
        Matrix matrix11 = new Matrix(intArray10);
        Matrix matrix12 = null;
        boolean boolean13 = matrix11.equals(matrix12);
        int[] intArray15 = new int[] { (short) 0 };
        int[] intArray17 = new int[] { (short) 0 };
        int[][] intArray18 = new int[][] { intArray15, intArray17 };
        Matrix matrix19 = new Matrix(intArray18);
        Matrix matrix20 = matrix11.minus(matrix19);
        Matrix matrix22 = matrix19.scale(1);
        Matrix matrix23 = matrix5.minus(matrix19);
        Matrix matrix25 = matrix23.scale((int) 'a');
        Matrix matrix27 = matrix23.divide((int) (short) 10);
        String str28 = matrix23.toString();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix22);
        org.junit.Assert.assertNotNull(matrix23);
        org.junit.Assert.assertNotNull(matrix25);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[ 0 ]\n[ 0 ]\n" + "'", str28.equals("[ 0 ]\n[ 0 ]\n"));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        Matrix matrix7 = matrix5.scale((int) (byte) 10);
        String str8 = matrix7.toString();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[ 0 ]\n[ 0 ]\n" + "'", str8.equals("[ 0 ]\n[ 0 ]\n"));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        Matrix matrix6 = null;
        boolean boolean7 = matrix5.equals(matrix6);
        int[] intArray9 = new int[] { (short) 0 };
        int[] intArray11 = new int[] { (short) 0 };
        int[][] intArray12 = new int[][] { intArray9, intArray11 };
        Matrix matrix13 = new Matrix(intArray12);
        Matrix matrix14 = matrix5.minus(matrix13);
        Matrix matrix16 = matrix13.scale(1);
        int[] intArray18 = new int[] { (short) 0 };
        int[] intArray20 = new int[] { (short) 0 };
        int[][] intArray21 = new int[][] { intArray18, intArray20 };
        Matrix matrix22 = new Matrix(intArray21);
        Matrix matrix23 = null;
        boolean boolean24 = matrix22.equals(matrix23);
        int[] intArray26 = new int[] { (short) 0 };
        int[] intArray28 = new int[] { (short) 0 };
        int[][] intArray29 = new int[][] { intArray26, intArray28 };
        Matrix matrix30 = new Matrix(intArray29);
        Matrix matrix31 = matrix22.minus(matrix30);
        Matrix matrix33 = matrix30.scale(1);
        String str34 = matrix30.toString();
        Matrix matrix36 = matrix30.divide((int) (byte) -1);
        int[] intArray38 = new int[] { (short) 0 };
        int[] intArray40 = new int[] { (short) 0 };
        int[][] intArray41 = new int[][] { intArray38, intArray40 };
        Matrix matrix42 = new Matrix(intArray41);
        Matrix matrix43 = null;
        boolean boolean44 = matrix42.equals(matrix43);
        int[] intArray46 = new int[] { (short) 0 };
        int[] intArray48 = new int[] { (short) 0 };
        int[][] intArray49 = new int[][] { intArray46, intArray48 };
        Matrix matrix50 = new Matrix(intArray49);
        Matrix matrix51 = matrix42.minus(matrix50);
        Matrix matrix53 = matrix50.scale(1);
        int[] intArray55 = new int[] { (short) 0 };
        int[] intArray57 = new int[] { (short) 0 };
        int[][] intArray58 = new int[][] { intArray55, intArray57 };
        Matrix matrix59 = new Matrix(intArray58);
        Matrix matrix60 = null;
        boolean boolean61 = matrix59.equals(matrix60);
        int[] intArray63 = new int[] { (short) 0 };
        int[] intArray65 = new int[] { (short) 0 };
        int[][] intArray66 = new int[][] { intArray63, intArray65 };
        Matrix matrix67 = new Matrix(intArray66);
        Matrix matrix68 = matrix59.minus(matrix67);
        Matrix matrix70 = matrix67.scale(1);
        boolean boolean71 = matrix50.equals(matrix70);
        Matrix matrix73 = matrix70.scale((int) (byte) 1);
        Matrix matrix74 = matrix30.minus(matrix73);
        boolean boolean75 = matrix16.equals(matrix73);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(matrix31);
        org.junit.Assert.assertNotNull(matrix33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[ 0 ]\n[ 0 ]\n" + "'", str34.equals("[ 0 ]\n[ 0 ]\n"));
        org.junit.Assert.assertNotNull(matrix36);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertNotNull(matrix51);
        org.junit.Assert.assertNotNull(matrix53);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertNotNull(matrix68);
        org.junit.Assert.assertNotNull(matrix70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(matrix73);
        org.junit.Assert.assertNotNull(matrix74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        Matrix matrix6 = null;
        boolean boolean7 = matrix5.equals(matrix6);
        int[] intArray9 = new int[] { (short) 0 };
        int[] intArray11 = new int[] { (short) 0 };
        int[][] intArray12 = new int[][] { intArray9, intArray11 };
        Matrix matrix13 = new Matrix(intArray12);
        Matrix matrix14 = matrix5.minus(matrix13);
        int int15 = matrix5.getColumns();
        Matrix matrix16 = matrix5.transpose();
        Matrix matrix18 = matrix5.scale((int) '4');
        int[] intArray20 = new int[] { (short) 0 };
        int[] intArray22 = new int[] { (short) 0 };
        int[][] intArray23 = new int[][] { intArray20, intArray22 };
        Matrix matrix24 = new Matrix(intArray23);
        int[] intArray26 = new int[] { (short) 0 };
        int[] intArray28 = new int[] { (short) 0 };
        int[][] intArray29 = new int[][] { intArray26, intArray28 };
        Matrix matrix30 = new Matrix(intArray29);
        Matrix matrix31 = null;
        boolean boolean32 = matrix30.equals(matrix31);
        int[] intArray34 = new int[] { (short) 0 };
        int[] intArray36 = new int[] { (short) 0 };
        int[][] intArray37 = new int[][] { intArray34, intArray36 };
        Matrix matrix38 = new Matrix(intArray37);
        Matrix matrix39 = matrix30.minus(matrix38);
        Matrix matrix40 = matrix24.plus(matrix39);
        Matrix matrix41 = matrix24.transpose();
        int[] intArray43 = new int[] { (short) 0 };
        int[] intArray45 = new int[] { (short) 0 };
        int[][] intArray46 = new int[][] { intArray43, intArray45 };
        Matrix matrix47 = new Matrix(intArray46);
        Matrix matrix48 = null;
        boolean boolean49 = matrix47.equals(matrix48);
        int[] intArray51 = new int[] { (short) 0 };
        int[] intArray53 = new int[] { (short) 0 };
        int[][] intArray54 = new int[][] { intArray51, intArray53 };
        Matrix matrix55 = new Matrix(intArray54);
        Matrix matrix56 = matrix47.minus(matrix55);
        Matrix matrix58 = matrix55.scale(1);
        Matrix matrix60 = matrix58.scale(100);
        Matrix matrix61 = matrix24.minus(matrix60);
        String str62 = matrix60.toString();
        try {
            Matrix matrix63 = matrix5.multiply(matrix60);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The two matrices cannot be multiplied.");
        } catch (RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(matrix18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(matrix39);
        org.junit.Assert.assertNotNull(matrix40);
        org.junit.Assert.assertNotNull(matrix41);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertNotNull(matrix56);
        org.junit.Assert.assertNotNull(matrix58);
        org.junit.Assert.assertNotNull(matrix60);
        org.junit.Assert.assertNotNull(matrix61);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "[ 0 ]\n[ 0 ]\n" + "'", str62.equals("[ 0 ]\n[ 0 ]\n"));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        Matrix matrix6 = null;
        boolean boolean7 = matrix5.equals(matrix6);
        int[] intArray9 = new int[] { (short) 0 };
        int[] intArray11 = new int[] { (short) 0 };
        int[][] intArray12 = new int[][] { intArray9, intArray11 };
        Matrix matrix13 = new Matrix(intArray12);
        Matrix matrix14 = matrix5.minus(matrix13);
        int int15 = matrix5.getColumns();
        int int18 = matrix5.getElement(0, 0);
        int[] intArray20 = new int[] { (short) 0 };
        int[] intArray22 = new int[] { (short) 0 };
        int[][] intArray23 = new int[][] { intArray20, intArray22 };
        Matrix matrix24 = new Matrix(intArray23);
        Matrix matrix25 = null;
        boolean boolean26 = matrix24.equals(matrix25);
        int[] intArray28 = new int[] { (short) 0 };
        int[] intArray30 = new int[] { (short) 0 };
        int[][] intArray31 = new int[][] { intArray28, intArray30 };
        Matrix matrix32 = new Matrix(intArray31);
        Matrix matrix33 = matrix24.minus(matrix32);
        Matrix matrix35 = matrix32.scale(1);
        int[] intArray37 = new int[] { (short) 0 };
        int[] intArray39 = new int[] { (short) 0 };
        int[][] intArray40 = new int[][] { intArray37, intArray39 };
        Matrix matrix41 = new Matrix(intArray40);
        Matrix matrix42 = null;
        boolean boolean43 = matrix41.equals(matrix42);
        int[] intArray45 = new int[] { (short) 0 };
        int[] intArray47 = new int[] { (short) 0 };
        int[][] intArray48 = new int[][] { intArray45, intArray47 };
        Matrix matrix49 = new Matrix(intArray48);
        Matrix matrix50 = matrix41.minus(matrix49);
        Matrix matrix52 = matrix49.scale(1);
        boolean boolean53 = matrix32.equals(matrix52);
        boolean boolean54 = matrix5.equals(matrix52);
        int[] intArray56 = new int[] { (short) 0 };
        int[] intArray58 = new int[] { (short) 0 };
        int[][] intArray59 = new int[][] { intArray56, intArray58 };
        Matrix matrix60 = new Matrix(intArray59);
        Matrix matrix61 = null;
        boolean boolean62 = matrix60.equals(matrix61);
        int[] intArray64 = new int[] { (short) 0 };
        int[] intArray66 = new int[] { (short) 0 };
        int[][] intArray67 = new int[][] { intArray64, intArray66 };
        Matrix matrix68 = new Matrix(intArray67);
        Matrix matrix69 = matrix60.minus(matrix68);
        int int70 = matrix60.getColumns();
        int int73 = matrix60.getElement(0, 0);
        int[] intArray75 = new int[] { (short) 0 };
        int[] intArray77 = new int[] { (short) 0 };
        int[][] intArray78 = new int[][] { intArray75, intArray77 };
        Matrix matrix79 = new Matrix(intArray78);
        Matrix matrix80 = null;
        boolean boolean81 = matrix79.equals(matrix80);
        int[] intArray83 = new int[] { (short) 0 };
        int[] intArray85 = new int[] { (short) 0 };
        int[][] intArray86 = new int[][] { intArray83, intArray85 };
        Matrix matrix87 = new Matrix(intArray86);
        Matrix matrix88 = matrix79.minus(matrix87);
        String str89 = matrix88.toString();
        Matrix matrix90 = matrix60.plus(matrix88);
        Matrix matrix91 = matrix52.plus(matrix60);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertNotNull(matrix33);
        org.junit.Assert.assertNotNull(matrix35);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertNotNull(matrix50);
        org.junit.Assert.assertNotNull(matrix52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertNotNull(matrix69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertNotNull(matrix88);
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "[ 0 ]\n[ 0 ]\n" + "'", str89.equals("[ 0 ]\n[ 0 ]\n"));
        org.junit.Assert.assertNotNull(matrix90);
        org.junit.Assert.assertNotNull(matrix91);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        Matrix matrix6 = null;
        boolean boolean7 = matrix5.equals(matrix6);
        int[] intArray9 = new int[] { (short) 0 };
        int[] intArray11 = new int[] { (short) 0 };
        int[][] intArray12 = new int[][] { intArray9, intArray11 };
        Matrix matrix13 = new Matrix(intArray12);
        Matrix matrix14 = matrix5.minus(matrix13);
        int int15 = matrix5.getColumns();
        Matrix matrix16 = matrix5.transpose();
        Matrix matrix18 = matrix5.scale((int) '4');
        int[] intArray20 = new int[] { (short) 0 };
        int[] intArray22 = new int[] { (short) 0 };
        int[][] intArray23 = new int[][] { intArray20, intArray22 };
        Matrix matrix24 = new Matrix(intArray23);
        int[] intArray26 = new int[] { (short) 0 };
        int[] intArray28 = new int[] { (short) 0 };
        int[][] intArray29 = new int[][] { intArray26, intArray28 };
        Matrix matrix30 = new Matrix(intArray29);
        Matrix matrix31 = null;
        boolean boolean32 = matrix30.equals(matrix31);
        int[] intArray34 = new int[] { (short) 0 };
        int[] intArray36 = new int[] { (short) 0 };
        int[][] intArray37 = new int[][] { intArray34, intArray36 };
        Matrix matrix38 = new Matrix(intArray37);
        Matrix matrix39 = matrix30.minus(matrix38);
        Matrix matrix40 = matrix24.plus(matrix39);
        Matrix matrix41 = matrix24.transpose();
        int[] intArray43 = new int[] { (short) 0 };
        int[] intArray45 = new int[] { (short) 0 };
        int[][] intArray46 = new int[][] { intArray43, intArray45 };
        Matrix matrix47 = new Matrix(intArray46);
        Matrix matrix48 = null;
        boolean boolean49 = matrix47.equals(matrix48);
        int[] intArray51 = new int[] { (short) 0 };
        int[] intArray53 = new int[] { (short) 0 };
        int[][] intArray54 = new int[][] { intArray51, intArray53 };
        Matrix matrix55 = new Matrix(intArray54);
        Matrix matrix56 = matrix47.minus(matrix55);
        Matrix matrix58 = matrix55.scale(1);
        Matrix matrix60 = matrix58.scale(100);
        Matrix matrix61 = matrix24.minus(matrix60);
        Matrix matrix62 = matrix18.plus(matrix24);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(matrix18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(matrix39);
        org.junit.Assert.assertNotNull(matrix40);
        org.junit.Assert.assertNotNull(matrix41);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertNotNull(matrix56);
        org.junit.Assert.assertNotNull(matrix58);
        org.junit.Assert.assertNotNull(matrix60);
        org.junit.Assert.assertNotNull(matrix61);
        org.junit.Assert.assertNotNull(matrix62);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        int[] intArray1 = new int[] { (short) -1 };
        int[][] intArray2 = new int[][] { intArray1 };
        Matrix matrix3 = new Matrix(intArray2);
        Matrix matrix4 = new Matrix(intArray2);
        String str5 = matrix4.toString();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[ -1 ]\n" + "'", str5.equals("[ -1 ]\n"));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        Matrix matrix7 = matrix5.scale((int) (byte) 10);
        Class<?> wildcardClass8 = matrix5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(matrix7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        Matrix matrix6 = null;
        boolean boolean7 = matrix5.equals(matrix6);
        int[] intArray9 = new int[] { (short) 0 };
        int[] intArray11 = new int[] { (short) 0 };
        int[][] intArray12 = new int[][] { intArray9, intArray11 };
        Matrix matrix13 = new Matrix(intArray12);
        Matrix matrix14 = matrix5.minus(matrix13);
        int int15 = matrix5.getColumns();
        int int18 = matrix5.getElement(0, 0);
        int[] intArray20 = new int[] { (short) 0 };
        int[] intArray22 = new int[] { (short) 0 };
        int[][] intArray23 = new int[][] { intArray20, intArray22 };
        Matrix matrix24 = new Matrix(intArray23);
        Matrix matrix25 = null;
        boolean boolean26 = matrix24.equals(matrix25);
        int[] intArray28 = new int[] { (short) 0 };
        int[] intArray30 = new int[] { (short) 0 };
        int[][] intArray31 = new int[][] { intArray28, intArray30 };
        Matrix matrix32 = new Matrix(intArray31);
        Matrix matrix33 = matrix24.minus(matrix32);
        String str34 = matrix33.toString();
        Matrix matrix35 = matrix5.plus(matrix33);
        int[] intArray37 = new int[] { (short) 0 };
        int[] intArray39 = new int[] { (short) 0 };
        int[][] intArray40 = new int[][] { intArray37, intArray39 };
        Matrix matrix41 = new Matrix(intArray40);
        Matrix matrix42 = null;
        boolean boolean43 = matrix41.equals(matrix42);
        int[] intArray45 = new int[] { (short) 0 };
        int[] intArray47 = new int[] { (short) 0 };
        int[][] intArray48 = new int[][] { intArray45, intArray47 };
        Matrix matrix49 = new Matrix(intArray48);
        Matrix matrix50 = matrix41.minus(matrix49);
        int int51 = matrix41.getColumns();
        int int54 = matrix41.getElement(0, 0);
        int[] intArray56 = new int[] { (short) 0 };
        int[] intArray58 = new int[] { (short) 0 };
        int[][] intArray59 = new int[][] { intArray56, intArray58 };
        Matrix matrix60 = new Matrix(intArray59);
        Matrix matrix61 = null;
        boolean boolean62 = matrix60.equals(matrix61);
        int[] intArray64 = new int[] { (short) 0 };
        int[] intArray66 = new int[] { (short) 0 };
        int[][] intArray67 = new int[][] { intArray64, intArray66 };
        Matrix matrix68 = new Matrix(intArray67);
        Matrix matrix69 = matrix60.minus(matrix68);
        String str70 = matrix69.toString();
        Matrix matrix71 = matrix41.plus(matrix69);
        Matrix matrix72 = matrix35.plus(matrix71);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertNotNull(matrix33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "[ 0 ]\n[ 0 ]\n" + "'", str34.equals("[ 0 ]\n[ 0 ]\n"));
        org.junit.Assert.assertNotNull(matrix35);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertNotNull(matrix50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertNotNull(matrix69);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "[ 0 ]\n[ 0 ]\n" + "'", str70.equals("[ 0 ]\n[ 0 ]\n"));
        org.junit.Assert.assertNotNull(matrix71);
        org.junit.Assert.assertNotNull(matrix72);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        int[] intArray7 = new int[] { (short) 0 };
        int[] intArray9 = new int[] { (short) 0 };
        int[][] intArray10 = new int[][] { intArray7, intArray9 };
        Matrix matrix11 = new Matrix(intArray10);
        Matrix matrix12 = null;
        boolean boolean13 = matrix11.equals(matrix12);
        int[] intArray15 = new int[] { (short) 0 };
        int[] intArray17 = new int[] { (short) 0 };
        int[][] intArray18 = new int[][] { intArray15, intArray17 };
        Matrix matrix19 = new Matrix(intArray18);
        Matrix matrix20 = matrix11.minus(matrix19);
        Matrix matrix21 = matrix5.plus(matrix20);
        Matrix matrix23 = matrix21.scale(100);
        Matrix matrix25 = matrix21.scale((int) ' ');
        String str26 = matrix25.toString();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(matrix23);
        org.junit.Assert.assertNotNull(matrix25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[ 0 ]\n[ 0 ]\n" + "'", str26.equals("[ 0 ]\n[ 0 ]\n"));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        Matrix matrix6 = null;
        boolean boolean7 = matrix5.equals(matrix6);
        int[] intArray9 = new int[] { (short) 0 };
        int[] intArray11 = new int[] { (short) 0 };
        int[][] intArray12 = new int[][] { intArray9, intArray11 };
        Matrix matrix13 = new Matrix(intArray12);
        Matrix matrix14 = matrix5.minus(matrix13);
        Matrix matrix16 = matrix13.scale(1);
        String str17 = matrix13.toString();
        Matrix matrix19 = matrix13.divide((int) (byte) -1);
        int[] intArray21 = new int[] { (short) 0 };
        int[] intArray23 = new int[] { (short) 0 };
        int[][] intArray24 = new int[][] { intArray21, intArray23 };
        Matrix matrix25 = new Matrix(intArray24);
        Matrix matrix26 = null;
        boolean boolean27 = matrix25.equals(matrix26);
        int[] intArray29 = new int[] { (short) 0 };
        int[] intArray31 = new int[] { (short) 0 };
        int[][] intArray32 = new int[][] { intArray29, intArray31 };
        Matrix matrix33 = new Matrix(intArray32);
        Matrix matrix34 = matrix25.minus(matrix33);
        Matrix matrix36 = matrix33.scale(1);
        int[] intArray38 = new int[] { (short) 0 };
        int[] intArray40 = new int[] { (short) 0 };
        int[][] intArray41 = new int[][] { intArray38, intArray40 };
        Matrix matrix42 = new Matrix(intArray41);
        Matrix matrix43 = null;
        boolean boolean44 = matrix42.equals(matrix43);
        int[] intArray46 = new int[] { (short) 0 };
        int[] intArray48 = new int[] { (short) 0 };
        int[][] intArray49 = new int[][] { intArray46, intArray48 };
        Matrix matrix50 = new Matrix(intArray49);
        Matrix matrix51 = matrix42.minus(matrix50);
        Matrix matrix53 = matrix50.scale(1);
        boolean boolean54 = matrix33.equals(matrix53);
        Matrix matrix56 = matrix53.scale((int) (byte) 1);
        Matrix matrix57 = matrix13.minus(matrix56);
        Matrix matrix59 = matrix57.scale((int) (short) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[ 0 ]\n[ 0 ]\n" + "'", str17.equals("[ 0 ]\n[ 0 ]\n"));
        org.junit.Assert.assertNotNull(matrix19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(matrix34);
        org.junit.Assert.assertNotNull(matrix36);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertNotNull(matrix51);
        org.junit.Assert.assertNotNull(matrix53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(matrix56);
        org.junit.Assert.assertNotNull(matrix57);
        org.junit.Assert.assertNotNull(matrix59);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        int[] intArray7 = new int[] { (short) 0 };
        int[] intArray9 = new int[] { (short) 0 };
        int[][] intArray10 = new int[][] { intArray7, intArray9 };
        Matrix matrix11 = new Matrix(intArray10);
        Matrix matrix12 = null;
        boolean boolean13 = matrix11.equals(matrix12);
        int[] intArray15 = new int[] { (short) 0 };
        int[] intArray17 = new int[] { (short) 0 };
        int[][] intArray18 = new int[][] { intArray15, intArray17 };
        Matrix matrix19 = new Matrix(intArray18);
        Matrix matrix20 = matrix11.minus(matrix19);
        Matrix matrix21 = matrix5.plus(matrix20);
        Matrix matrix22 = matrix5.transpose();
        try {
            int int25 = matrix5.getElement((int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(matrix22);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        int[] intArray7 = new int[] { (short) 0 };
        int[] intArray9 = new int[] { (short) 0 };
        int[][] intArray10 = new int[][] { intArray7, intArray9 };
        Matrix matrix11 = new Matrix(intArray10);
        Matrix matrix12 = null;
        boolean boolean13 = matrix11.equals(matrix12);
        int[] intArray15 = new int[] { (short) 0 };
        int[] intArray17 = new int[] { (short) 0 };
        int[][] intArray18 = new int[][] { intArray15, intArray17 };
        Matrix matrix19 = new Matrix(intArray18);
        Matrix matrix20 = matrix11.minus(matrix19);
        Matrix matrix21 = matrix5.plus(matrix20);
        Matrix matrix22 = matrix5.transpose();
        int[] intArray24 = new int[] { (short) 0 };
        int[] intArray26 = new int[] { (short) 0 };
        int[][] intArray27 = new int[][] { intArray24, intArray26 };
        Matrix matrix28 = new Matrix(intArray27);
        Matrix matrix29 = null;
        boolean boolean30 = matrix28.equals(matrix29);
        int[] intArray32 = new int[] { (short) 0 };
        int[] intArray34 = new int[] { (short) 0 };
        int[][] intArray35 = new int[][] { intArray32, intArray34 };
        Matrix matrix36 = new Matrix(intArray35);
        Matrix matrix37 = matrix28.minus(matrix36);
        Matrix matrix39 = matrix36.scale(1);
        Matrix matrix41 = matrix39.scale(100);
        Matrix matrix42 = matrix5.minus(matrix41);
        int[] intArray44 = new int[] { (short) 0 };
        int[] intArray46 = new int[] { (short) 0 };
        int[][] intArray47 = new int[][] { intArray44, intArray46 };
        Matrix matrix48 = new Matrix(intArray47);
        Matrix matrix49 = null;
        boolean boolean50 = matrix48.equals(matrix49);
        int[] intArray52 = new int[] { (short) 0 };
        int[] intArray54 = new int[] { (short) 0 };
        int[][] intArray55 = new int[][] { intArray52, intArray54 };
        Matrix matrix56 = new Matrix(intArray55);
        Matrix matrix57 = matrix48.minus(matrix56);
        int int58 = matrix48.getColumns();
        Matrix matrix59 = matrix48.transpose();
        int[] intArray61 = new int[] { (short) 0 };
        int[] intArray63 = new int[] { (short) 0 };
        int[][] intArray64 = new int[][] { intArray61, intArray63 };
        Matrix matrix65 = new Matrix(intArray64);
        boolean boolean66 = matrix59.equals(matrix65);
        Class<?> wildcardClass67 = matrix65.getClass();
        int int68 = matrix65.getColumns();
        boolean boolean69 = matrix5.equals(matrix65);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(matrix22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(matrix39);
        org.junit.Assert.assertNotNull(matrix41);
        org.junit.Assert.assertNotNull(matrix42);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertNotNull(matrix57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(matrix59);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        int[] intArray7 = new int[] { (short) 0 };
        int[] intArray9 = new int[] { (short) 0 };
        int[][] intArray10 = new int[][] { intArray7, intArray9 };
        Matrix matrix11 = new Matrix(intArray10);
        Matrix matrix12 = null;
        boolean boolean13 = matrix11.equals(matrix12);
        int[] intArray15 = new int[] { (short) 0 };
        int[] intArray17 = new int[] { (short) 0 };
        int[][] intArray18 = new int[][] { intArray15, intArray17 };
        Matrix matrix19 = new Matrix(intArray18);
        Matrix matrix20 = matrix11.minus(matrix19);
        Matrix matrix21 = matrix5.plus(matrix20);
        Matrix matrix22 = matrix5.transpose();
        int[] intArray24 = new int[] { (short) 0 };
        int[] intArray26 = new int[] { (short) 0 };
        int[][] intArray27 = new int[][] { intArray24, intArray26 };
        Matrix matrix28 = new Matrix(intArray27);
        Matrix matrix29 = null;
        boolean boolean30 = matrix28.equals(matrix29);
        int[] intArray32 = new int[] { (short) 0 };
        int[] intArray34 = new int[] { (short) 0 };
        int[][] intArray35 = new int[][] { intArray32, intArray34 };
        Matrix matrix36 = new Matrix(intArray35);
        Matrix matrix37 = matrix28.minus(matrix36);
        Matrix matrix39 = matrix36.scale(1);
        Matrix matrix41 = matrix39.scale(100);
        Matrix matrix42 = matrix5.minus(matrix41);
        String str43 = matrix41.toString();
        int[] intArray45 = new int[] { (short) 0 };
        int[] intArray47 = new int[] { (short) 0 };
        int[][] intArray48 = new int[][] { intArray45, intArray47 };
        Matrix matrix49 = new Matrix(intArray48);
        int[] intArray51 = new int[] { (short) 0 };
        int[] intArray53 = new int[] { (short) 0 };
        int[][] intArray54 = new int[][] { intArray51, intArray53 };
        Matrix matrix55 = new Matrix(intArray54);
        Matrix matrix56 = null;
        boolean boolean57 = matrix55.equals(matrix56);
        int[] intArray59 = new int[] { (short) 0 };
        int[] intArray61 = new int[] { (short) 0 };
        int[][] intArray62 = new int[][] { intArray59, intArray61 };
        Matrix matrix63 = new Matrix(intArray62);
        Matrix matrix64 = matrix55.minus(matrix63);
        Matrix matrix65 = matrix49.plus(matrix64);
        boolean boolean66 = matrix41.equals(matrix49);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(matrix22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(matrix39);
        org.junit.Assert.assertNotNull(matrix41);
        org.junit.Assert.assertNotNull(matrix42);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "[ 0 ]\n[ 0 ]\n" + "'", str43.equals("[ 0 ]\n[ 0 ]\n"));
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertNotNull(matrix64);
        org.junit.Assert.assertNotNull(matrix65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        int[] intArray7 = new int[] { (short) 0 };
        int[] intArray9 = new int[] { (short) 0 };
        int[][] intArray10 = new int[][] { intArray7, intArray9 };
        Matrix matrix11 = new Matrix(intArray10);
        Matrix matrix12 = null;
        boolean boolean13 = matrix11.equals(matrix12);
        int[] intArray15 = new int[] { (short) 0 };
        int[] intArray17 = new int[] { (short) 0 };
        int[][] intArray18 = new int[][] { intArray15, intArray17 };
        Matrix matrix19 = new Matrix(intArray18);
        Matrix matrix20 = matrix11.minus(matrix19);
        Matrix matrix21 = matrix5.plus(matrix20);
        Matrix matrix23 = matrix21.scale(100);
        Class<?> wildcardClass24 = matrix23.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertNotNull(matrix23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        int[] intArray7 = new int[] { (short) 0 };
        int[] intArray9 = new int[] { (short) 0 };
        int[][] intArray10 = new int[][] { intArray7, intArray9 };
        Matrix matrix11 = new Matrix(intArray10);
        Matrix matrix12 = null;
        boolean boolean13 = matrix11.equals(matrix12);
        int[] intArray15 = new int[] { (short) 0 };
        int[] intArray17 = new int[] { (short) 0 };
        int[][] intArray18 = new int[][] { intArray15, intArray17 };
        Matrix matrix19 = new Matrix(intArray18);
        Matrix matrix20 = matrix11.minus(matrix19);
        Matrix matrix21 = matrix5.plus(matrix20);
        String str22 = matrix21.toString();
        int[] intArray24 = new int[] { (short) 0 };
        int[] intArray26 = new int[] { (short) 0 };
        int[][] intArray27 = new int[][] { intArray24, intArray26 };
        Matrix matrix28 = new Matrix(intArray27);
        Matrix matrix29 = null;
        boolean boolean30 = matrix28.equals(matrix29);
        int[] intArray32 = new int[] { (short) 0 };
        int[] intArray34 = new int[] { (short) 0 };
        int[][] intArray35 = new int[][] { intArray32, intArray34 };
        Matrix matrix36 = new Matrix(intArray35);
        Matrix matrix37 = matrix28.minus(matrix36);
        Matrix matrix39 = matrix36.scale(1);
        String str40 = matrix36.toString();
        Matrix matrix42 = matrix36.divide((int) (byte) -1);
        boolean boolean43 = matrix21.equals(matrix42);
        int int44 = matrix21.getColumns();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(matrix20);
        org.junit.Assert.assertNotNull(matrix21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[ 0 ]\n[ 0 ]\n" + "'", str22.equals("[ 0 ]\n[ 0 ]\n"));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(matrix39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "[ 0 ]\n[ 0 ]\n" + "'", str40.equals("[ 0 ]\n[ 0 ]\n"));
        org.junit.Assert.assertNotNull(matrix42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        Matrix matrix6 = null;
        boolean boolean7 = matrix5.equals(matrix6);
        int[] intArray9 = new int[] { (short) 0 };
        int[] intArray11 = new int[] { (short) 0 };
        int[][] intArray12 = new int[][] { intArray9, intArray11 };
        Matrix matrix13 = new Matrix(intArray12);
        Matrix matrix14 = matrix5.minus(matrix13);
        Matrix matrix16 = matrix13.scale(1);
        Matrix matrix18 = matrix13.divide(2);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(matrix18);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        Matrix matrix6 = null;
        boolean boolean7 = matrix5.equals(matrix6);
        int[] intArray9 = new int[] { (short) 0 };
        int[] intArray11 = new int[] { (short) 0 };
        int[][] intArray12 = new int[][] { intArray9, intArray11 };
        Matrix matrix13 = new Matrix(intArray12);
        Matrix matrix14 = matrix5.minus(matrix13);
        int int15 = matrix5.getColumns();
        Matrix matrix16 = matrix5.transpose();
        Matrix matrix18 = matrix5.scale((int) '4');
        int[] intArray20 = new int[] { (short) 0 };
        int[] intArray22 = new int[] { (short) 0 };
        int[][] intArray23 = new int[][] { intArray20, intArray22 };
        Matrix matrix24 = new Matrix(intArray23);
        Matrix matrix25 = null;
        boolean boolean26 = matrix24.equals(matrix25);
        int[] intArray28 = new int[] { (short) 0 };
        int[] intArray30 = new int[] { (short) 0 };
        int[][] intArray31 = new int[][] { intArray28, intArray30 };
        Matrix matrix32 = new Matrix(intArray31);
        Matrix matrix33 = matrix24.minus(matrix32);
        int int34 = matrix24.getColumns();
        Matrix matrix35 = matrix24.transpose();
        Matrix matrix37 = matrix24.scale((int) '4');
        int[] intArray39 = new int[] { (short) 0 };
        int[] intArray41 = new int[] { (short) 0 };
        int[][] intArray42 = new int[][] { intArray39, intArray41 };
        Matrix matrix43 = new Matrix(intArray42);
        Matrix matrix44 = null;
        boolean boolean45 = matrix43.equals(matrix44);
        int[] intArray47 = new int[] { (short) 0 };
        int[] intArray49 = new int[] { (short) 0 };
        int[][] intArray50 = new int[][] { intArray47, intArray49 };
        Matrix matrix51 = new Matrix(intArray50);
        Matrix matrix52 = matrix43.minus(matrix51);
        Matrix matrix54 = matrix51.scale(1);
        String str55 = matrix51.toString();
        Matrix matrix57 = matrix51.divide((int) (byte) -1);
        int[] intArray59 = new int[] { (short) 0 };
        int[] intArray61 = new int[] { (short) 0 };
        int[][] intArray62 = new int[][] { intArray59, intArray61 };
        Matrix matrix63 = new Matrix(intArray62);
        Matrix matrix64 = null;
        boolean boolean65 = matrix63.equals(matrix64);
        int[] intArray67 = new int[] { (short) 0 };
        int[] intArray69 = new int[] { (short) 0 };
        int[][] intArray70 = new int[][] { intArray67, intArray69 };
        Matrix matrix71 = new Matrix(intArray70);
        Matrix matrix72 = matrix63.minus(matrix71);
        Matrix matrix73 = matrix57.plus(matrix71);
        Matrix matrix74 = matrix24.minus(matrix57);
        boolean boolean75 = matrix5.equals(matrix24);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(matrix18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertNotNull(matrix33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(matrix35);
        org.junit.Assert.assertNotNull(matrix37);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertNotNull(matrix52);
        org.junit.Assert.assertNotNull(matrix54);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "[ 0 ]\n[ 0 ]\n" + "'", str55.equals("[ 0 ]\n[ 0 ]\n"));
        org.junit.Assert.assertNotNull(matrix57);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertNotNull(matrix72);
        org.junit.Assert.assertNotNull(matrix73);
        org.junit.Assert.assertNotNull(matrix74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        Matrix matrix6 = null;
        boolean boolean7 = matrix5.equals(matrix6);
        int[] intArray9 = new int[] { (short) 0 };
        int[] intArray11 = new int[] { (short) 0 };
        int[][] intArray12 = new int[][] { intArray9, intArray11 };
        Matrix matrix13 = new Matrix(intArray12);
        Matrix matrix14 = matrix5.minus(matrix13);
        int int15 = matrix5.getColumns();
        Matrix matrix16 = matrix5.transpose();
        int[] intArray18 = new int[] { (short) 0 };
        int[] intArray20 = new int[] { (short) 0 };
        int[][] intArray21 = new int[][] { intArray18, intArray20 };
        Matrix matrix22 = new Matrix(intArray21);
        boolean boolean23 = matrix16.equals(matrix22);
        Class<?> wildcardClass24 = matrix22.getClass();
        String str25 = matrix22.toString();
        Matrix matrix27 = matrix22.scale((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[ 0 ]\n[ 0 ]\n" + "'", str25.equals("[ 0 ]\n[ 0 ]\n"));
        org.junit.Assert.assertNotNull(matrix27);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        int[] intArray1 = new int[] { (short) 0 };
        int[] intArray3 = new int[] { (short) 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        Matrix matrix5 = new Matrix(intArray4);
        Matrix matrix6 = new Matrix(intArray4);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
    }
}

