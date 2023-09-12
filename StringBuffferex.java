package studyopedia;

public class StringBuffferex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Intelligent");
        System.out.println(sb.length());
		sb.append("person");
		System.out.println(sb);
		sb.insert(11,"young");
		System.out.println(sb);
		sb.delete(11,16);
		System.out.println(sb);
		sb.deleteCharAt(5);
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		
		
	}

}
