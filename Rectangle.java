package studyopedia;
import java.util.*;
public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and breadth of rectangle");
		int l=sc.nextInt();
		int b=sc.nextInt();
		int pr=2*(l+b);
		System.out.println("The perimeter of rectangle is"+pr);
		sc.close();

	}

}
