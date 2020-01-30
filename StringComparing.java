package Assignment;
import java.util.Scanner;

public class StringComparing {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		
		String string1= s.nextLine();
		String string2=s.nextLine();
		
		GetResult res=new GetResult();
		res.getResult(string1, string2);
		

	}

}
