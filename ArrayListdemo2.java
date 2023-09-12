package studyopedia;

import java.util.*;

class Book
{
	int qty,id;
	String bname,author;
	Book(int id,String name,String author,int q)
	{
		this.id=id;
		this.bname=name;
		this.author=author;
		qty=q;
	}
} 
public class ArrayListdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Book b1=new Book(101,"Complete reference","Herbert Schildt",2);
Book b2=new Book(102,"Let us c","yashwant kanetkar",10);
Book b3=new Book(103,"J2ME","Nageshwar rao",1);
  ArrayList<Book> all=new ArrayList<Book>();
  all.add(b1);
  all.add(b2);
  all.add(b3);
  for(Book b:all)
  {
	  //System.out.println(b);
	  System.out.println(b.id+" "+b.bname+" "+b.author+" "+b.qty);
  }
  
	}

}
