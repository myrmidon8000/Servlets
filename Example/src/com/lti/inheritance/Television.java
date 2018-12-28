package com.lti.inheritance;

public class Television extends Gadget {
private int screenSize;
private int Channelno;
private boolean maxScreen;
Television(Gadget g,int screenSize)
{
	this.manufacturer=g.manufacturer;
	this.price=g.price;
	this.yrOfMfg=g.yrOfMfg;
	this.screenSize=screenSize;
}
public void turnOn()
{
int chNum=101;
changeChannel(chNum);
maxScreen();
}
private void changeChannel(int Channelno)
{
	this.Channelno=Channelno;
}
private void maxScreen()
{
	maxScreen=true;
}
public void turnOff()
{
this.changeChannel(0);
this.maxScreen=false;
}
}
