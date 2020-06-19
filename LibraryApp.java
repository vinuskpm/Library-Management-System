package com.lxisoft.library;
import java.util.*;

import com.lxisoft.user.*;

public class LibraryApp {

	boolean Session;
	ArrayList <User> user=new ArrayList<User>();
	ArrayList <Book> book=new ArrayList<Book>();
	
	
	Scanner s=new Scanner(System.in);
	
	
	public void start()
	{
		// Default Admin
		User u=new Admin();
	
		u.setUname("vineeth");
		u.setPsd("123");
		u.setPlace("Koppam");
		u.setName("Vineeth");
	
		user.add(u);
		
		// Default Librarian
		
		User u1=new Librarian();
		u1.setName("Vijith");
		u1.setPsd("123");
		u1.setUname("vijith");
		u1.setPlace("Koppam");
		user.add(u1);
		
		// Default Book
		
		Book b1=new Book();
		b1.setName("Randamoozham");
		b1.setAuthor("MT Vasudevan Nair");
		book.add(b1);
		

		
		int x=0;
		//-----------
		do
		{
	    System.out.println("Login ( Admin / Librarian)");
		System.out.println("\n Enter UserName ");
		String uname=s.next();
		System.out.println("\n Enter UserPasword");
		String upsd=s.next();
					
		int l=user.size();
		
		for(int i=0;i<l;i++)
		{
		if(user.get(i).getUname().equals(uname) && user.get(i).getUpsd().equals(upsd))
		{
			
			
			if(user.get(i) instanceof Admin)  
			{
				System.out.println(user.get(i) instanceof Admin);
				System.out.println(" Its for Admin........");
				((Admin) user.get(i)).adminHome(user,book);
				break;
			}
			else
			{
				System.out.println(user.get(i) instanceof Librarian);
				System.out.println(" Its for Librarian........");
				((Librarian) user.get(i)).librarianHome(book);
				break;
			}
		}//if close
		}//for close
		
		
		
	x=1;	
	
        
	
		
		
	}while(x==1);
	}//start close
} //class close
