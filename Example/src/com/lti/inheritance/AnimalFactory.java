package com.lti.inheritance;

public class AnimalFactory {
public Animal createAnimal(String type)
{
	if(type.equalsIgnoreCase("Carnivore"))
		return new Carnivore();
	else 
		return new Herbivore();
}
}
