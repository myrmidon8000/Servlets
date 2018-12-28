package com.lti.inheritance;
import java.io.*;
import java.util.*;
public class FactoryClient {
public static void main(String args[])
{
	AnimalFactory factory= new AnimalFactory();
	Animal animal=null;
	try(InputStreamReader is=new InputStreamReader(System.in);
	BufferedReader br=new	BufferedReader(is))
	{
		System.out.println("Enter the type: Herbivore or Carnivore: ");
		String type=br.readLine();
		animal=factory.createAnimal(type);
		System.out.println("Created the type");
		animal.eat();
	}
	catch(IOException e)
	{
		e.getMessage();
	}
	}
}
