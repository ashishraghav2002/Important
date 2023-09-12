package studyopedia;
class accept{
	int radius;
	void accept(int r)
	{
		radius=r;
		System.out.println("radius = :"+radius);
	}
}
class area extends accept{
	float area;
	void cal_area()
	{
		area=3.14f*radius*radius;
		System.out.println("Area of circle = :"+area);
	}
}
class sphere extends area{
	float sphere;
	void cal_sphere()
	{
		sphere=4/3*(area*radius);
		System.out.println("Sphere = "+sphere);
	}
}
public class multilevelex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    sphere s = new sphere();
    s.accept(3);
    s.cal_area();
    s.cal_sphere();
    
	}

}
