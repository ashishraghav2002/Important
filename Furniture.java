package studyopedia;
import java.util.*;
public class Furniture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int price;
		System.out.println("Enter any digit 1,2,3");
		String ch= sc.next();
		switch(ch)
		{
		case "1":System.out.println("Pine table costs $ 100");
		break;
		case "2":System.out.println("Oak Table costs $225");
		break;
		case "3":System.out.println("Mahogany Table costs $310");
		break;
		default:
		 price=0;
		 System.out.println("Price is"+price);
		}
		sc.close();

	}

}
