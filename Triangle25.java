package studyopedia;
import java.util.*;
public class Triangle25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sides of triangle");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if((a+b>c)&&(b+c>a)&&(c+a>b))
		{
			System.out.println("Triangle is possible");
		 if((a==b)&&(b==c)&&(c==a))
			System.out.println("Equilateral Triangle");
		else if((a==b)||(b==c)||(c==a))
			System.out.println("Isosceles Triangle");
		else if((a!=b)&&(b!=c)&&(c!=a))
			System.out.println("Scalene Triangle");
		}
		else
            System.out.println("TRIANGLE NOT POSSIBLE");
		sc.close();
		}
	}


