package studyopedia;
import java.util.*;
public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int N=sc.nextInt();
		if((N%5==0)&&(N%11==0))
		{
			System.out.println("Number is divisible by 5 and 11");
		}
		else
		{
			System.out.println("Number is not divisible by 5 and 11");
		}
		sc.close();
	}
}
