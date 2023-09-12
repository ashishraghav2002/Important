package studyopedia;
import java.util.*;
public class Furniture2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int price=100;
		System.out.println("Enter 1 for large table and 2 for small table");
		String s=sc.next();
		switch(s)
		{
		case "1":
			System.out.println("Pine table costs $ 100");
			price=price+35;
			System.out.println("price for large pine table is"+price);
			break;
		case"2":
			System.out.println("Oak Table costs $225");
			System.out.println("Price of oak table is 225");
			break;
		default:
			System.out.println("Wrong Choice!!");
		}
      sc.close();
	}

}
