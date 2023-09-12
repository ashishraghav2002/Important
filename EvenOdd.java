package studyopedia;
import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		if(n%2!=0) {
			System.out.println("Odd Number is there");
		}
		else {
			System.out.println("Even Number is there");
		}
        sc.close();
	}

}
