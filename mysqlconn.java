package jdbc;
import java.sql.*;
import java.util.Scanner;
public class mysqlconn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter id,name,course");
		int id = sc.nextInt();
		String n = sc.next();
		String c= sc.next();
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		PreparedStatement stmt=con.prepareStatement("insert into project values(?,?,?)");
		stmt.setInt(1, id);
		stmt.setString(2, n);
		stmt.setString(3, c);
		int i=stmt.executeUpdate();
		if(i>0)
		{
			System.out.println(" Statement saved successfully");
		}
		ResultSet rs= stmt.executeQuery("select * from project");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		//int rs1=stmt.executeUpdate(" update  stu set course=python where id =1");
		con.close();
	}
		catch(Exception e)
		{
			System.out.println(e);
		}

}
}