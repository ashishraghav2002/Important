package studyopedia;
import java.util.*;
public class Room2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and width of room");
		int length=sc.nextInt();
		int width=sc.nextInt();
		area=(length*width);
		System.out.println("The area of rectangle is"+area+"square feet");
		sc.close();
	}

}
