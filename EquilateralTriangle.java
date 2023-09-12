package studyopedia;
import java.util.*;
public class EquilateralTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three sides of triangle");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if((a==b)&&(b==c))
		{
			System.out.println("yahh Equilteral Triangle");
			
		}
		else
		{
			System.out.println("Not Equilateral triangle");
		}
		sc.close();

	}

}
