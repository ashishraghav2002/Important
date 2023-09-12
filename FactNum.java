package studyopedia;
import java.util.Scanner;
public class FactNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int d = 0,k = 0;
		int n = 0;
		int f=n;
		System.out.println("Enter a no");
		int n1=sc.nextInt();
		for(int i=1;i<=n1;i++){
			d=n1%10;
			k=k+(d^3);
			f=f/10;
			}
		if(k==n)
			System.out.println(" Armstrong no.");
		else 
			System.out.println(" not Armstrong");
		sc.close();

}
}
