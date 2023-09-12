package studyopedia;
import java.util.*;
public class Dozen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    System.out.println("Welcome to egg Market");
    System.out.println("Enter the number of eggs");
    int n=sc.nextInt();
    double d=(n/12);
    double extra=(n%12);
    System.out.println("You have ordered that much dozens" +d);
    System.out.println("The extra eggs are"+extra);
   
    if((d>=2)&&(d<=5))
    {
    	double tp=(n*6);
    	double dis=(tp*0.02);
    	double fin=(tp-dis);
     System.out.println("The final price after discount is"+fin);
	}
    else if((d>=5)&&(d<=10))
    {
    	double tp=(n*6);
    	double dis=(tp*0.05);
    	double fin=(tp-dis);
     System.out.println("The final price after discount is"+fin);
	}
    else if((d>=10)&&(d<=12))
    {
    	double tp=(n*6);
    	double dis=(tp*0.12);
    	double fin=(tp-dis);
     System.out.println("The final price after discount is"+fin);
	}
    
sc.close();
}
}
