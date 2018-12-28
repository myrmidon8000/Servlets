package com.lti.misc;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;
import java.io.IOException; 
public class FileHandler implements Serializable {
public static void main(String agrs[])
{
	int i=0;
	/*try(FileReader fr=new FileReader("D:\\Shaggy\\a.txt");
			FileWriter fw=new FileWriter("D:\\Shaggy\\b.txt"))*/
	
	try(FileInputStream  fis=new FileInputStream("D:\\Shaggy\\g.bmp");
			FileOutputStream fq=new FileOutputStream("D:\\Shaggy\\e.png") )
	{
	//while( (i=fr.read( ))!=-1)
		while( (i=fis.read( ))!=-1)
		{
		//	System.out.print( (char) i);
			//fw.write(i);
			fq.write(i);
			System.out.println("Done...");
		}
	
		 
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		

}
}
