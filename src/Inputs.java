import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inputs {
	private static BufferedReader keyboardInput = new BufferedReader(
			new InputStreamReader(System.in));

	String readKeyboardInputs() {
		try {
			return keyboardInput.readLine();
		} catch (IOException e) {
		}
		return null;
	}

}
