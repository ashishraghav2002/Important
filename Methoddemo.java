package studyopedia;
class Student
{
	int id;
	String name,course;
	void student(int id,String name,String c)
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
public class Methoddemo {

	public static void main(String[] args) {
		Student s=new Student();
		s.student(1,"amit","fsd");
		s.show();

	}

}
