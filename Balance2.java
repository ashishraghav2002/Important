package studyopedia;

import java.util.Scanner;

public class Balance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account balance");
		int acc=sc.nextInt();
		System.out.println("Enter saving account balance");
		int svc=sc.nextInt();
		if((acc<10)&&(svc>100)){
			System.out.println("Account balance is stable");
		}
		
		else
		{
			System.out.println("both accounts are dangerously low");
		}
        sc.close();
	}
}

