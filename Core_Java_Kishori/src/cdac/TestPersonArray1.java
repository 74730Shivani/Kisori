package cdac;

import java.util.Scanner;

public class TestPersonArray1 {

		public static void main(String[] args) {
			Person[] parr=new Person[2];
			PersonService.addPersonData(parr);
			PersonService.displayPersonData(parr);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter pid to search");
            int pid = sc.nextInt();
            Person p = PersonService.SearchById(parr,pid);
            {
            	if(p!=null)
            	{
            		System.out.println(p);
            	}else
            	{
            		System.out.println("not found");
            	}
            	System.out.println("Enter name to search");
            	String nm = sc.next();
            	Person[] arr = PersonService.searchByName(parr,nm);
            	if(arr!=null)
            	{
            		for(Person p1:arr)
            		{
            			if(p1!=null)
            				System.out.println(p1);
            			else
            				break;
            				
            		}
            	}
            	else
            	{
            		System.out.println("not found");
            	}
            	
            }
		}

	}

