package studyopedia;
import java.util.*;
public class BOXQUESTION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double amt,amt1;
		System.out.println("Enter the number of units consumed");
		int k=sc.nextInt();
		if(k<50) {
			amt=0.50*k;
			amt1=amt+0.2;
			System.out.println("The amount to be paid is"+amt1);
		}
		if((k>50)&&(k<150)){
			amt=0.50*50+0.75*(k-50);
			amt1=amt+0.2;
			System.out.println("The amount to be paid is"+amt1);
		}
	    if((k>150)&&(k<250)) {
			amt=0.50*50+0.75*100+1.20*(k-150);
			amt1=amt+0.2;
			System.out.println("The amount to be paid is"+amt1);
		}
			if(k>250) {
				amt=0.50*50+0.75*100+1.20*100+1.50*(k-250);
				amt1=amt+0.2;
				System.out.println("The amount to be paid is"+amt1);
			}
		
		sc.close();

	}

}
