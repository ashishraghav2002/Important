package studyopedia;
import java.util.*;
public class Calculate{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the value of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter character 1 to add two integers,2 to subtract second integer from the first,3 to multiply the integers,4 to divide first integer by second");
		String ch= sc.next();
		
		switch(ch)
	    {
	    case "1":
	    System.out.println(a+b);
	    break;
	    case "2":System.out.println(a-b);
	    break;
	    case "3":System.out.println(a*b);
	    break;
	    case "4":
	    	if(b==0) {
	    		System.out.print("wrong choice");
	    	}
	    	else {
	    	System.out.println(a/b);
	    	}
	    break;
	    default:
	    	System.out.println("wrong choice");
	    }
        sc.close();
	}

}
