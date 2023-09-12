package studyopedia;
 import java.util.*;
public class ExceptionDemo {

	
		// TODO Auto-generated method stub
     public static void main(String args[]) {
    	 System.out.println("open the file");
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter the value of a");
    	 int a=sc.nextInt();
    	 try {
    		 int b=45/a;
    		 System.out.println("value of b :"+b);
    		 int arr[]= {10,20,30,40};
    		 arr[9]=90;
    		 
     }
    	 catch(ArithmeticException e)
    	 {
    		 e.printStackTrace();
    	 }
    	 catch(ArrayIndexOutOfBoundsException aie)
    	 {
    		 aie.printStackTrace();
    		 
    	 }
    	 System.out.println("close the file");
	}

}
