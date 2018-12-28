
package com.lti.misc;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class Lists {
	public static void main(String [ ]args) {
		List<Double>listofsals =new ArrayList<>( );
		listofsals.add(334.45);
		listofsals.add(4545.67);
		//listofsals.add("a"); this will give error if <Double> isnt used.
		Iterator iterator =listofsals.iterator();
while(iterator.hasNext())
{
	Double sal=(Double)iterator.next();
	System.out.println(sal);
}
	}
}
