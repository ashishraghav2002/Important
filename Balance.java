package studyopedia;
import java.util.*;
public class Balance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account balance");
		int acc=sc.nextInt();
		System.out.println("Enter saving account balance");
		int svc=sc.nextInt();
		if(acc<10) {
			System.out.println("Checking account balance is low");
			
		}
		else if(svc<100)
		{
		   System.out.println("Saving account balance is low");	
		}
        sc.close();
	}

}
