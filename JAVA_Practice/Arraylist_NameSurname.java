package JFSJD;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_NameSurname {

	public static void main(String[] args) {
	    Scanner obj =new Scanner(System.in);
	    ArrayList<String> name = new ArrayList<String>();
	  

	    for(int i=0; i<=5; i++)
	    { 
	    	 System.out.println("Enter first name of student "+ (i+1));
	    	 String value = obj.next();
	    	 name.add(value);
	    }
	    System.out.println("First names are"+ name);
	    
	    
	    
	    ArrayList<String> surname = new ArrayList<String>();
		  

	    for(int i=0; i<=5; i++)
	    { 
	    	 System.out.println("Enter Surname of student "+ (i+1));
	    	 String value1 = obj.next();
	    	 surname.add(value1);
	    }
	    System.out.println("Surnames are "+ surname);
	    
	    
	    ArrayList<String> namesurname = new ArrayList<String>();
	    
	    for(int i=0; i<=5; i++)
	    { 
	    	
	    	 String value2 = name.get(i)+" " +surname.get(i);
	    	 namesurname.add(value2);
	    }
	    System.out.println("Full names are "+ namesurname);
	    
	    
	    
	    
	    

	}

}
