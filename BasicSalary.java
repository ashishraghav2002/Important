package studyopedia;
import java.util.*;
public class BasicSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double da,hra;
		System.out.println("Enter the Basic Salary OF an Employee");
		double basicsalary=sc.nextInt();
		if(basicsalary<=10000)
		{
        da=basicsalary*20.0/100.0;
        hra=basicsalary*80.0/100.0;
        System.out.println(da);
        System.out.println(hra);
		}
		else if(basicsalary<=2000)
		{
			da=basicsalary*25.0/100.0;
			hra=basicsalary*90.0/100.0;
			System.out.println(da);
			System.out.println(hra);
		}
		else if(basicsalary>2000){
			da=basicsalary*30.0/100.0;
			hra=basicsalary*90.0/100.0;
			System.out.println(da);
			System.out.println(hra);
			
		sc.close();
		}
	}
}

