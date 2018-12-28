package com.lti.misc;
import java.util.*;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunTestCalc {

	public static void main(String args[])
	{
		//Result  result =JUnitCore.runClasses(TestCa.class);
		Result  result =JUnitCore.runClasses(TestSuite1.class);
				List<Failure> failures=result.getFailures();
				System.out.println("List of Failures..");
				for(Failure failure:failures)
				{
					System.out.println(failure);
	}
}
}
