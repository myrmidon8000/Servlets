package com.lti.misc;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
public class TestUser {
UserDetails u=new UserDetails();
	@Test
	public void test() {
		assertEquals("admin",u.username);
		assertEquals("admin@123",u.d);
		System.out.println("Hello Admin");
	}


}
