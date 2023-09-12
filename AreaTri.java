package studyopedia;
import java.util.*;
public class AreaTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base and height of Triangle");
		int b=sc.nextInt();
		int h=sc.nextInt();
		double ar=(0.5*b*h);
		System.out.println("The area of triangle is"+ar);
		sc.close();
	}

}
