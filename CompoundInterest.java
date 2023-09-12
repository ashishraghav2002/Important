package studyopedia;
import java.util.*;
public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double p,r,t,amt,ci;
		System.out.println("Enter principal,rate and time");
		p=sc.nextInt();
		r=sc.nextInt();
		t=sc.nextInt();
		amt=p*(Math.pow(1+r/100,t));
		ci=amt-p;
		System.out.println(ci);
		sc.close();

	}

}
