package studyopedia;

import java.util.*;
public class LinkedlistExa {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Saksham");
		ll.add("Siddhant");
		ll.add("Akshat");
//		System.out.println("adv loop....");
//		for(String i:ll)
//		{
//			System.out.println(i);
//			
//		}
		System.out.println(" adding element.....");
		ll.addFirst("Vaibhav");
		ll.addLast("Vritti");
		ll.add(1,"bobby");
		System.out.println("Updating ele......");
		ll.set(1,"Bobby");
		System.out.println("Iterator....");
		Iterator i=ll.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
        System.out.println("deleting ele....");
        ll.removeFirst();
        ll.removeLast();
        ll.remove(1);
		System.out.println("adv loop....");
		for(String j:ll)
	{
			System.out.println(j);
			
	}
        
	}

}
