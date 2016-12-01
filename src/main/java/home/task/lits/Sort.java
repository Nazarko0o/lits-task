package home.task.lits;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
	
	public static void sorting(List<User> person)
	{
	Collections.sort(person, new Comparator<User>() 
			{
	        public int compare(User o1, User o2) 
	        {
	        	if(o1.getName().getLast().equals(o2.getName().getLast()))
	        	{
	        		 return o1.getName().getFirst().compareTo(o2.getName().getFirst());
	        	}
	        	else return o1.getName().getLast().compareTo(o2.getName().getLast());
	        }});
	  for (int i = 0; i < person.size(); i++) {
	System.out.println(person.get(i).getName().getLast() + person.get(i).getName().getFirst());
	}
	}
}
