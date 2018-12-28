package com.lti.practise;
import java.util.*;
public class EmpidComparator  implements Comparator<Emp>{
	@Override
	public int compare(Emp e1, Emp e2) {
		{
			if(e1.getId()==e2.getId())
				return 0;
			else if(e1.getId()>e2.getId())
				return 1;
			else
				return -1;
	}
	}
}
