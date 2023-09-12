package studyopedia;
import java.util.*;
public class Dollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("1 dollar = 75 rupees");
		System.out.println("enter the amount");
		int amt=sc.nextInt();
		int k=amt*75;
		System.out.println(k);
        sc.close();
	}

}
