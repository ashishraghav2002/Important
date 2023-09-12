package studyopedia;
import java.util.*;
public class FarenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double far,cel;
		System.out.println("Enter temperature in fahrenheit");
		far=sc.nextInt();
		cel=(far-32)*5/9;
		System.out.println("The temperatute in fahrenheit is"+far);
		System.out.println("The temperatute in celsius after converting is"+cel);
		
		sc.close();

	}

}
