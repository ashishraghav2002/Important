package studyopedia;
class bank
{
	 private int accno;
	 private String name;
	 private float bal;
	 public void setId( int a)
	 {
		 accno=a;
	 }
	 public void setName(String n)
	 {
		 name=n;
	 }
	 public void setBal(float b)
	 {
		 bal=b;
	 }
	 public  int getId()
	 {
		 return accno;
	 }
	 public String getName()
	 {
		 return name;
	 }
	 public float getBal()
	 {
		 return bal;
	 }
}
public class encapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b=new bank();
		b.setId(121);
		b.setName("Nishant");
		b.setBal(12567890.99f);
		System.out.println("Accno ="+b.getId());
		System.out.println("name ="+b.getName());
		System.out.println("Balance ="+b.getBal());

	}

}
