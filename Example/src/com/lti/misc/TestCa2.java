package com.lti.misc;
	import static org.junit.Assert.*;
	import org.junit.*;
	import org.junit.runner.RunWith;
	import java.util.*;
	import org.junit.*;
	import org.junit.Before;
	import org.junit.After;
	import org.junit.BeforeClass;
	import org.junit.AfterClass;
	import org.junit.runners.Parameterized;
	import org.junit.runners.Parameterized.Parameters;
	@RunWith(value=Parameterized.class)
	public class TestCa2{
	private 	long  expected;
	private int value1;
	private int value2;
	Calculator c=new Calculator();
	@BeforeClass
	public static void m1()
	{
		System.out.println("Before testing...");
	}
	@Before
	public  void m2()
	{
		System.out.println(" testing...");
	}
	@Test
	public void m7(){
		assertEquals(expected, new Calculator().Sub(value1,value2));}

		@Parameters
		public static Collection data() {
			return
					Arrays.asList(new Object[][]
							{ {1,1,0},{10,15,5},{50,100,50},{0,34,34} });
		}
		
		public  TestCa2(long expected,int value1,int value2)
		{
			this.expected =expected;
			this.value1=value1;
			this.value2=value2;	
		}
		/*@Test
		public void testAdd() {
			System.out.println("Testing Starts...");
			assertEquals(12,c.Add(6,6));
		}*/
		@Test
		public void testSub() {
			System.out.println("Testing Continues...");
			assertEquals(2,c.Sub(5,3));
		}

		@Test
		public void testMul() {
			//fail("Not yet implemented");
		}

		@Test
		public void testDiv() {
			//fail("Not yet implemented");
		}
		@After
		public void m3()
		{
			System.out.println("After testing...");
		}
	}


