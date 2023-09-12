package studyopedia;

class synch extends Thread
{
	int available=1;
	
	int wanted;
	synch(int wanted)
	{
		this.wanted=wanted;
	}
	public void run()
	{
		synchronized(this) {
		
		System.out.println("Avaialble berth are "+available);
		if(available>=wanted)
		{
		String name=Thread.currentThread().getName();
		System.out.println(" Seat available for "+name);
		
		try
		{
			
			Thread.sleep(2000);
			available=available-wanted;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
		else
		{
			System.out.println(" no Berth available");
		}
	}
}
}
public class train {

	public static void main(String[] args) {
		synch s =new synch(1);
		
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(s);
		t1.setName("first person");
		t2.setName("second person");
		t1.start();
		t2.start();

	}

}
