package studyopedia;
import java.util.*;
public class Lawn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int wk=0;
		System.out.println("Enter length and breadth of a lawn");
		int l=sc.nextInt();
		int w=sc.nextInt();
		int sq=(l*w);
		System.out.println("Enter 1 for once,2 for twice,3 for 20 times a year");
		String ch= sc.next();
		switch(ch)
	    {
		case"1":
		{
		if(sq<=4000) {
			wk=25*20;
			System.out.println(wk);
		}
		}
		break;
		case"2":{
			
		}
			
		}
		if(sq>=4000&&sq<6000)
		{
			wk=35*20;
			System.out.println(wk);
		}
        if(sq>=6000)
        {
        	wk=50*20;
        	System.out.println(wk);
        }
     sc.close();   
	}
}
