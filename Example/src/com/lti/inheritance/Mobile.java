package com.lti.inheritance;

public class Mobile extends Gadget {
private int screenSize;
private String brand;
private CoverColor covercolor;
public int getScreenSize() {
	return screenSize;
}
public void setScreenSize(int screenSize) {
	this.screenSize = screenSize;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public CoverColor getCovercolor() {
	return covercolor;
}
public void setCovercolor(CoverColor covercolor) {
	this.covercolor = covercolor;
}
public Mobile(int screenSize,String Brand, CoverColor covercolor)
{
	super();
	this.screenSize=screenSize;
	this.brand=Brand;
	this.covercolor=covercolor;
}
public void turnOn()
{
	displayLogo();
	playMusic();
	init();
}
private  static void displayLogo()
{
System.out.println("Display Logo..");	
}
private  static void playMusic()
{
System.out.println("Play Music..");	
}
private static void init()
{
System.out.println("Initialised..");
}
public void turnOff()
{
	closeAllapps();
}
private  static void closeAllapps()
{
	System.out.println("Closing..");
}
@Override
public String toString() {
	return "Mobile [screenSize=" + screenSize + ", brand=" + brand + ", covercolor=" + covercolor + "]";
}

}
