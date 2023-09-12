package studyopedia;
import java.util.*;
public class Minutes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of minutes a person worked");
        int min=sc.nextInt();
        int cslc=min/60;
        int rem=min%60;
        System.out.println("The"+min+" minuters became" +cslc+ "hours" + "and" +rem+ "minutes");
        sc.close();
	}

}
