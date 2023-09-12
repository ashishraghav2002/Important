package studyopedia;
import java.util.*;
public class Pass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of student");
		int marks=sc.nextInt();
		if((marks>=33)&&(marks<=50))
		{
			System.out.println("Pass with 3rd Division");
		}
		else if((marks>=50)&&(marks<=60))
		{
			System.out.println("Pass with 2nd Division");
			
		}
		else if((marks>=60)&&(marks<=75))
		{
			System.out.println("Pass with 1st Division");
		}
		else if((marks>=75)&&(marks<=100))
		{
			System.out.println("Pass with Distinction");
		}
		else
		{
			System.out.println("Fail");
		}
		sc.close();
	}

}
