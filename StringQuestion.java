package studyopedia;
import java.util.*;
public class StringQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter your first name");
    String s=sc.next();
    System.out.println("enter your fathers name");
    String k=sc.next();
    System.out.println("enter your last name");
    String l=sc.next();
    String con=(s+l);
    System.out.println("Your name is"+s+" "+l);
    System.out.println("Your name is"+s+" "+k+" "+l);
	}

}
