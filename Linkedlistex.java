package studyopedia;

import java.io.*;
import java.util.*;
import java.util.LinkedList;
public class Linkedlistex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("India");
		l1.add("USA");
		l1.add("UAE");
		System.out.println("Country list :"+l1);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String element;
		int position,choice=0;
		while(choice<4)
		{
			System.out.println("1 Enter the country name");
			System.out.println("2 Remove the country name");
			System.out.println("3 Change the country name");
			System.out.println("4 Exit");
			System.out.println("Enter your choice");
			choice=Integer.parseInt(br.readLine());
			switch(choice)
			{
			case 1: System.out.println("Enter a element");
			element=br.readLine();
			System.out.println("enter a position");
			position=Integer.parseInt(br.readLine());
			l1.add(position,element);
			break;
			case 2: System.out.println("Enter a position");
			position= Integer.parseInt(br.readLine());
			l1.remove(position);
			break;
			case 3:System.out.println("Enter an element");
			element=br.readLine();
			System.out.println("Enter a position");
			position=Integer.parseInt(br.readLine());
			l1.set(position, element);
			break;
			
			default:return;
			}
			System.out.println("List");
			Iterator it = l1.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}

	}

}
