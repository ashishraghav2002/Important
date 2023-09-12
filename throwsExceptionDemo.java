package studyopedia;

public class throwsExceptionDemo extends Exception {
	public static int Accno[]= {101,102,103,104,105};
	public static String name[]= {"tyagiji","piyush","asghish","rahul","nishant","umang"};
	public static int bal[]= {10000,102000,10300,104,1050000};
	throwsExceptionDemo(String str)
	{
		super(str);
	}
	public static void main(String[] args) {
	
    try {
    	System.out.println("AccountNo"+"\t"+"CustName"+"\t"+"Balance");
    	for(int i=0;i<5;i++)
    	{
    		System.out.println(Accno[i]+"\t"+name[i]+"\t"+bal[i]);
    		if(bal[i]<=500)
    		{
    			throwsExceptionDemo me=new throwsExceptionDemo("Balance account is low");
    			throw me;
    		}
    	}
    }
    catch(throwsExceptionDemo me)
    {
    	me.printStackTrace();
    }
	}

}
