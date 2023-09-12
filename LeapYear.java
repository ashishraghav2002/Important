package studyopedia;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int y=sc.nextInt();
		//if divisible by 400 then it is a leap year
		if(y%400==0) {
			System.out.println("Leap Year");
		}
		//if number is divisible by 100 not leap year if divisible by 100 and 4 both then it is a leap year 
		else if(y%100==0){
			System.out.println("Not Leap Year");
		}
		//if only divisible by 4 then also leap year is there.
		else if(y%4==0) {
			System.out.println("Leap year");
		}
		sc.close();

	}

}
