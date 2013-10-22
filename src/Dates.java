//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class Dates {

	public static void main(String[] args) /*throws IOException*/ {
		System.out.println("Enter the date here: ");
		
		String dateEntered;
		
		Scanner dateTypedIn = new Scanner(System.in);
		dateEntered = dateTypedIn.nextLine();
		
		//dateTypedIn.close(); FIND OUT do I need to CLOSE it?
		System.out.println(dateEntered);
		
		/*InputStreamReader stream = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(stream);
		
		System.out.println("Enter something here : ");
		String something = bf.readLine();
		System.out.println(something);*/
		
				
	}

}
