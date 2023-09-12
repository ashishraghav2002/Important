package studyopedia;
import java.util.*;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    switch(n)
    {
    case 1:System.out.println("Monday");
    break;
    case 2:System.out.println("tuesday");
    break;
    case 3:System.out.println("wednesday");
    break;
    case 4:System.out.println("Thursday");
    break;
    case 5:System.out.println("Friday");
    break;
    case 6:System.out.println("Saturday");
    break;
    case 7:System.out.println("Sunday");
    break;
    default:
    	System.out.println("wrong choice");
    }
   sc.close();
	}

}
