package studyopedia;
import java.util.*;
public class TicketCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int d = 0,n = 0,f=0;
		System.out.println("Enter the six digit  ticket number");
		int ticketno=sc.nextInt();
		if(ticketno>6)
		{
			d=ticketno/10;//we will get front digit leaving last digit here
			f=ticketno%10;//we will get last digit of the digit
			n=d%7;//front digit of tickets will get divided by 7 then valid                			
			if(f==n) {
		       System.out.println(" Yes Valid Ticket Number");
			}
		else if(f!=n){
			System.out.println(" No Invalid Ticket Number");
		}
		else {
			System.out.println("Ticket no.less than 6");
		}
		sc.close();

	}

}
}
