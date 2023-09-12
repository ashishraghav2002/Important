package studyopedia;
import java.util.*;
public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no.");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			if(i%2==0) {
			System.out.println(i);
			System.out.println(n+"*"+i+"="+(n*i));
			}
		sc.close();
		}
	}
}
	

