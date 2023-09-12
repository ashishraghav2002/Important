package studyopedia;
import java.io.*;
import java.util.HashMap;
public class HashMapdemo {

	public static void main(String[] args)throws IOException
	{
       HashMap<String,Long> hm=new HashMap<String,Long>();
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String name = null,str;
       Long phno;
       while(true)
       {
    	   System.out.println("1,Enter the entries");
    	   System.out.println("2,lookup in the book");
    	   System.out.println("3,names in the book");
    	   System.out.println("4,Exit");
    	   System.out.println("Enter your choice");
    	   int n=Integer.parseInt(br.readLine());
    	   switch(n)
    	   {
    	   case 1:System.out.println("Enter the name");
    	   str=br.readLine();
    	   phno=new Long(str);
    	   hm.put(name, phno);
    	   break;
    	   case 2:System.out.println("Enter the name");
    	   name=br.readLine();
    	   name=name.trim();
    	   phno=hm.get(name);
    	   System.out.println(" phno :"+phno);
    	   break;
    	    
    	   default:
    		   return;
    	   }
       }
	}

}
