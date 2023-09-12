package studyopedia;
import java.util.*;
public class Factufkfrjb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n = 0;
		int s=0;
		int f=n;
		System.out.println("Enter a no");
		int n1=sc.nextInt();
		for(int i=1;i<=n1;i++){
			f=f*i;
			s=s+f;
			n=n/10;
	}
     if(s==n)
	System.out.println(" Strong no.");
    else 
	System.out.println(" not strong no.");
	sc.close();
}

}