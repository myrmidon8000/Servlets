package com.lti.misc;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class Testcitizen implements Serializable{
public static void main(String args[])
{
	
	Address address1=new Address("Lti","Mgm rd","Mumbai","400001");
	Address address2=new Address("Himri","Gb rd","Kolkata","40002");
	
	LocalDate date1= LocalDate.of(2002,10,2);
	LocalDate date2= LocalDate.of(2019,01,10);
	
	Citizen citizen1=new Citizen("1111_3232_ 1212","Amit",address1,date1);
	Citizen citizen2=new Citizen("1100_3132_ 1202","Shardul",address2,date2);
	date1=date1.minusYears(2);
	 //Another way
	
//	Citizen [] citizens = {citizen1,citizen2};
	System.out.println(citizen1);
	System.out.println(citizen2);
	try(FileOutputStream fos=
			new FileOutputStream("D:\\Shaggy\\w.txt") ;
			
	ObjectOutputStream oos=
			new ObjectOutputStream(fos))
		{
		//wiritng obj data
		oos.writeObject(citizen1);
		oos.writeObject(citizen2);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Done writing");
}
}
