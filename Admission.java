package studyopedia;
import java.util.*;
public class Admission {
	/*	Write an application for a college’s admissions office. Prompt the user for a student’s numeric high school grade point average (for example, 3.2) and an admission test score from 0 to 100. Display the message “Accept” if the student has any of the following:
	u A grade point average of 3.0 or above and an admission test score of at least 60 u A grade point average below 3.0 and an admission test score of at least 80
	If the student does not meet either of the qualification criteria, display “Reject”. Save the file as Admission.java.**/


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student numeric high school grade");
		int marks=sc.nextInt();
		System.out.println("Enter grade point average");
		int avg=sc.nextInt();
		if((avg<=3)&&(marks<=60)||((avg>3)&&(marks<=80)))
		{
		if(avg<0||avg>4.0&&marks<0||marks>100)
		{
			System.out.println("Accept");
		}
		else
		{
			System.out.println("Reject");
		}
      sc.close();
	}	
}
}
