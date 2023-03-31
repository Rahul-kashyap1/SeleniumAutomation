package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
//if any test case is taking lots of time we can go to other test case using time out with maximum
	//time out means this test should be execute in maximum 2 millisecond
//@Test(invocationTimeOut = 2,expectedExceptions = NumberFormatException.class)
//public void infiniteLoopTest() {
//	int i=1;
//	while(i==1) {
//		System.out.println(i);
//	}
//}

@Test(expectedExceptions = NumberFormatException.class)
public void test1() {
	String x="100A";
	Integer.parseInt(x);
}
	
}
