package studyopedia;
class mythread1 extends Thread
{
	String str;
	mythread1(String str)
	{
		this.str=str;
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(str+ ": i"+i);
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
public class theatre {

	public static void main(String[] args) {
		mythread1 obj1 = new mythread1("Cut the ticket");
		mythread1 obj2 = new mythread1("Show the Seat");
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.setPriority(10);
		t1.start();
		t2.start();

	}

}
