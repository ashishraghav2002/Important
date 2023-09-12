package studyopedia;
import java.util.*;
public class Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		if(a>0) {
			System.out.println("Positive number");
		}
		else if(a<0)
		{
			System.out.println("Negative Number");
		}
		else
		{
			System.out.println("Zero input");
		}
		
       sc.close();
	}

}
