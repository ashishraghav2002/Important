package studyopedia;
import java.io.*;
import java.util.Arrays;
public class largestelement {

	public static void main(String[] args) {
        int[]V= {11,65,193,36,209,664,32};
        //sorting the array
        Arrays.sort(V);
        
        //taking the length of array
        int x=V.length;
        
        System.out.println("first="+V[x-1]);
        System.out.println("second="+V[x-2]);
        System.out.println("third="+V[x-3]);
	}

}
