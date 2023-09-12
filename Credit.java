package studyopedia;
import java.util.*;
public class Credit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int d;
		System.out.println("Enter no. of credit hours");
		int ch=sc.nextInt();
		System.out.println("Enter the amount spent on books");
		int money=sc.nextInt();
		d=((ch*85)+money+65);
		System.out.println(d);
	
     sc.close();
}
}