package studyopedia;
 abstract class candidate
{
	String name,post;
	candidate(String n , String p){
		name=n;
		post=p;
		
	}
	void show()
	{
		System.out.println("Name : "+name+" Post applied : "+post);
	}
	abstract void select();
}
 class HR extends candidate
 {
	 int id;
	 HR(String n , String p,int i)
	 { 
		 super(n,p);
		 id=i; 
	 }
	 void select()
	 {
		 if(id==1)
			 System.out.println("Congrats aaj se aap hmara bandhua majdur");
		 if(id==0)
			 System.out.println("chal nikal phli fursat ma");
		 if(id<0)
			 System.out.println("ruk ja abhi");
	 }
 }
public class abstractdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		candidate c= new HR("amit","trainer",1);
		c.show();
		c.select();
		HR h1 = new HR("Saksham","java",0);
		h1.show();
		h1.select();
		HR h2 = new HR("adil","java",0);
		h2.show();
		h2.select();
		
		

	}

}
