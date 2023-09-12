package studyopedia;
import java.util.*;
public class SI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		int pi,r,t,si;
		System.out.println("Enter principal amount");
		pi=in.nextInt();
		System.out.println("Enter Rate");
		r=in.nextInt();
		System.out.println("Enter Time");
		t=in.nextInt();
		si=((pi*r*t)/100);
		System.out.println("The Simple Interset is "+si);
		in.close();

	}

}
