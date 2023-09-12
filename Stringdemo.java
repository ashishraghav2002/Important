package studyopedia;
public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="Nishant is studying Java";
    String k="Nishant is good boy";
    String s1= new String ("nishant");
    String s2="Nishant";
    //character to string
    char[]a= {'b','u','l','l'};
    String s3=new String(a);
    String s6=new String("Nishant is learning Java");
    int a1=10;
    float b=20.6f;
    System.out.println(s);
    System.out.println(s1);
    System.out.println(s3);
    System.out.println(s==s1);//false as s and s1 will be stored at different memory address space (new-will allocate different memory address space at each time.)
    System.out.println(s==s2);//true as same memory address every time here
    System.out.println(s.equals(s1));//false as it sees the content here and N & n there that's why
    System.out.println(s.equalsIgnoreCase(s1));//True as it only sees the content not the case(upper or lower)
    System.out.println(a1+b+s);//simply add all and then display them.
    System.out.println(a1+s+b);//10Nishant20.6
    System.out.println(s+a1+b);//it will consider everything as string as it comes at starting so everything which comes afterwards will be considered as string.
    System.out.println(s+(a1+b));//so not to be considered as string so we separate out them with bracket
    System.out.println(s.concat(s3));//to join two strings
    System.out.println(s.toUpperCase());//convert every character to upper case
    System.out.println(s.toLowerCase());//convert every character to lower case
    System.out.println(s.length());// calculates the no. of characters
    System.out.println(s.startsWith("N"));//checks whether any alphabet starts with that you want or not 
    System.out.println(s.charAt(0));//gives first character
    System.out.println(s.indexOf("t"));//returns the index of any character
    System.out.println(s.substring(0,4));//to take a part of string from certain indexes
    //now we will convert string to character
    char[]u=s.toCharArray();
    for(char i:u)//advance for loop
    {
    System.out.println(i);
    }
    String[] arr1=k.split(" ");
    for(String j:arr1)
    { 
    	System.out.println(j);
    }
    System.out.println(s6.replace("java", "python"));
	}
	

}
