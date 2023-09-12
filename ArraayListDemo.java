package studyopedia;
import java.util.*;
public class ArraayListDemo {

	public static void main(String[] args) {
       ArrayList<String> al=new ArrayList<String>();
       al.add("Apple");
       al.add("Mango");
       al.add("chickoo");
       al.add("Watermelon");
       al.add("Guava");
       al.add(3,"Cherry");
       System.out.println("contents"+al);
       System.out.println("size of arraylist :"+al.size());
       
       al.remove("Apple");
       al.remove(2);
       System.out.println("contents" +al);
       System.out.println(" size of arraylist :"+al.size());
	}

}
