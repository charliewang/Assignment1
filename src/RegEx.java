import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegEx {

	public static void main(String[] args) {
		
		// String to be scanned to find the pattern.
		String line = "HELLO-WORLD";
		String pattern = "(.*)((A)(B(C)))";
		
		// Create a Pattern object.
		Pattern p = Pattern.compile(pattern);
		
		// Now create matcher object.
		Matcher m = p.matcher(line);
		if (m.find( )) {
			System.out.println("Found value: " + m.group(0));
			System.out.println("Found value: " + m.group(1));
			System.out.println("Found value: " + m.group(2));
			System.out.println(m.groupCount());
		} else {
			System.out.println("NO MATCH");
		}

	}

}
