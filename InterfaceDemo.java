package studyopedia;
interface electricity
{
	void unit(int unit);
	void calBill();
	
}
class Business implements electricity
{
	int unit;
	public void unit(int unit)
	{
		this.unit=unit;
		
	}
	public void calBill()
	{
		System.out.println("Businees Electricity Bill ;"+(unit*50));
	}
}
class Industry implements electricity
{
	int unit;
	public void unit(int unit)
	{
		this.unit=unit;
		
	}
	public void calBill()
	{
		System.out.println("Businees Electricity Bill ;"+(unit*80));
	}
}
class Residential implements electricity
{
	int unit;
	public void unit(int unit)
	{
		this.unit=unit;
		
	}
	public void calBill()
	{
		System.out.println("Businees Electricity Bill ;"+(unit*80));
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    electricity e1 = new Residential();
    e1.unit(5000);
    e1.calBill();
    electricity e2 = new Industry();
    e2.unit(8000);
    e2.calBill();
    electricity e3 = new Business();
    e3.unit(8000);
    e3.calBill();
    
	}

}
