//1.	Create a class named Book that contains data fields
//for the title and number of pages.
//Include get and set methods for these fields.
//Next, create a subclass named Textbook,
//which contains an additional field that holds a grade level 
//for the Textbook and additional methods to get and
//set the grade level field. Write an application 
//that demonstrates using objects of each class. 
//Save the files as Book.java, Textbook.java, and DemoBook.java.
//single inheritance
package studyopedia;
class Book
{
	String title;
	int noofpages;
	public void setTitle(String s)
	{
		title=s;
	}
	public void setNoofPages(int n)
	{
		noofpages=n;
	}
	public String getTitle()
	{
	  return title;	
	}
	public int getNoofPages()
	{
		return noofpages;
	}
}
class Textbook extends Book
{
	String gradelevel;
	public void setGradeLevel(String g)
	{
		gradelevel=g;
	}
	public String getGradeLevel()
	{
		return gradelevel;
	}
}
public class polydemo {
	public static void main(String args[])
	{
		Textbook b=new Textbook();
		b.setTitle("Meluha");
		b.setNoofPages(400);
		b.setGradeLevel("Religios");
		System.out.println("Textbook name :"+b.getTitle());
		System.out.println("No of pages :"+b.getNoofPages());
		System.out.println("Grade level :"+b.getGradeLevel());
		
	}

} 
