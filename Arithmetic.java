package studyopedia;
import java.util.*;
public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the value of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter any character + ,-,*,/");
		String ch= sc.next();
		switch(ch)
	    {
	    case "+":
	    System.out.println(a+b);
	    break;
	    case "-":System.out.println(a-b);
	    break;
	    case "*":System.out.println(a*b);
	    break;
	    case "/":System.out.println(a/b);
	    break;
	    case "%":System.out.println(a%b);
	    break;
	    default:
	    	System.out.println("wrong choice");
	    }
        sc.close();
	}

}
