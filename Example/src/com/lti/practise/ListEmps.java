package com.lti.practise;
import java.util.Iterator;
import java.util.List;
import java.util.*;

public class ListEmps {
public static void main(String[]args)
{
	Emp e1=new Emp(231,"john",33343);
	Emp e2=new Emp(232,"alex",33345);
	Emp e3=new Emp(233,"steve",24344);
	Emp e4=new Emp(234,"rude",44344);
	Emp e5=new Emp(235,"bolu",43424);
	Emp e6=new Emp(236,"golu",43144);
	List<Emp> emplist=new ArrayList<>();
	emplist.add(e1);
	emplist.add(e2);
	emplist.add(e3);
	
	List<Emp>temp_emplist=new ArrayList<>();
	temp_emplist.add(e4);
	temp_emplist.add(e5);
	temp_emplist.add(e6);
	
	List<Emp> allEmployees=new LinkedList<>();
	allEmployees.addAll(emplist);
	allEmployees.addAll(temp_emplist);
	Iterator iterator =allEmployees.iterator();
	while(iterator.hasNext())
	{
		Emp empp=(Emp)iterator.next();
				System.out.println(empp);
		
	}
	allEmployees.remove(2);
	System.out.println("After remving");
	for(Emp e:allEmployees)
	{
		System.out.println(e);
		
	}
	System.out.println(emplist);
	System.out.println(temp_emplist);
	
 //List 2 has type of linkedlist 
//	convert array to linkedlist
	List<Integer> list2=new LinkedList<>();
	Integer []arr2= {56,34,56,22,87,45,56,45,56,234};
	list2=Arrays.asList(arr2);
	for(int i:list2)
	{
		System.out.println(i);
		Set<Integer>set1=new HashSet<>();
		set1.addAll(list2);
		System.out.println(set1);
	} 
	//Sort acc to condition
	
	TreeSet<Integer>set11=new TreeSet<>();
	set11.add(34);
	Integer [] arr= {34,56,7634,23,5,65,46,67,56,65};
	List<Integer>list1=Arrays.asList(arr);
	set11.addAll(list1);
	System.out.println(set11);
	Collections.sort(allEmployees);
	for (Emp e:allEmployees)
	{
	System.out.println(e);
	}
	System.out.println("Comparator sorting");
	Collections.sort(allEmployees, new EmpidComparator());
	for (Emp e: allEmployees)
	System.out.println(e);
	System.out.println("Comparable Sorting");
	Collections.sort(allEmployees, new EmpNameCompartor());
	for (Emp e: allEmployees)
	System.out.println(e);
Map <String,Emp> empMap=new HashMap<>();
empMap.put("Admin",e1);
empMap.put("IT",e2);
empMap.put("IT",e3);

System.out.println("\n");

System.out.println("complete Set..");
System.out.println(empMap.entrySet());
System.out.println("Only Values..");
System.out.println(empMap.values());
System.out.println("Only Keys..");
System.out.println(empMap.keySet());

}




}



