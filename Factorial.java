package studyopedia;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc=new Scanner(System.in);
		int s=0;
		System.out.println("Enter a no");
		int n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				s=s+i;
			}
				if(s==n)
				{
					System.out.println("perfect no");
				}
				else {
				System.out.println(" not Perfect no.");
			}
			sc.close();
		}

	}

