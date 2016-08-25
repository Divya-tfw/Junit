package com.test;

import org.junit.*;

public class SampleTest 
{
	 @Before
	    public void setUp() throws Exception {
	       
	        System.out.println("Set Up Complete.");
	    }
	 
 
    @Test
    public void testMethod1(){
        System.out.println("Sample test Successful");
    }
}
