package studyopedia;
import java.util.*;
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two angles of Triangle");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=(180-a-b);
		System.out.println("The third angle of Triangle is"+c);
		sc.close();

	}

}
