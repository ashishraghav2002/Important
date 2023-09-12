package studyopedia;
import java.util.*;
public class Payroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user's hourly rate of pay");
		int hrp=sc.nextInt();
		System.out.println("Enter no.of hours worked");
		int nhw=sc.nextInt();
		int gp=(hrp*nhw);
		double wth=gp*15/100.0;
		double np=(gp-wth);
		System.out.println("The users gross pay is"+gp);
		System.out.println("The withholding tax is"+nhw);
		System.out.println("The net pay is"+np);
		sc.close();

	}

}
