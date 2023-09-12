package studyopedia;
 class demo extends Thread//implements Runnable
 {
	 public void run()
	 {
		 for(int i=0;i<=10;i++)
		 {
			 System.out.println(i);
		 }
	 }
 }
public class Threaddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d = new demo();
		Thread t = new Thread(d);
		//System.out.println(t.currentThread().getName());
		//System.out.println(t.getPriority());
		t.setDaemon(true);
		t.start();
		

	}

}
