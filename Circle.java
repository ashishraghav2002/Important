package studyopedia;
import java.util.*;
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double dc,cc,ac;
         System.out.println("Enter the radius of circle");
         int r=sc.nextInt();
         dc=(2*r);
         cc=(2*3.14*r);
         ac=(3.14*r*r);
         System.out.println("The diameter of circle is"+dc);
         System.out.println("The circumference of circle is"+cc);
         System.out.println("The area of circle is"+ac);
         sc.close();
	}

}
