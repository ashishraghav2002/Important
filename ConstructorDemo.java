package studyopedia;
class student
{
	int id;
	String name,course;
	student()
	{
		id=2;
		name="saksham";
		course="fsdj";
	}
	void Student(int id,String name,String c)
	{
		this.id=id;
		this.name=name;
		course=c;
	}
	void show()
	{
		System.out.println(id+" "+name);
		System.out.println(" Course opt: "+course);
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		Student s=new Student();
		s.show();
		student s1=new student( 2,"amit","fsd");
		s1.show();

	}

}
