/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 14 16:21:57 GMT 2018
 */

package com;

import com.unipassau.FooBar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FooBar_ESTest extends FooBar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FooBar fooBar0 = new FooBar();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[10];
      FooBar.main(stringArray0);
      assertEquals(10, stringArray0.length);
  }
}
