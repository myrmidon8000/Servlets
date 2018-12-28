package com.lti.model;

public class Prime {
public void  Prim(int a)
{
	int i,j,c=0;
	for (i=1;i<=a;i++)
	{
		for(j=2;j<=(a/2);j++)
		{
			if (i%j==0)
			{
				c++;
			break;
			}
			if (c==0 && i!=1)
				{
				System.out.println(i+ " ");
				}
}
	}
}

}
