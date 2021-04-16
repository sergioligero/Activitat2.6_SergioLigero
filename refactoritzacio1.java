import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class refactoritzacio1 {
	public static void main(String[] args) throws IOException {
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader teclat = new BufferedReader(entrada);

		int i = 0;

		System.out.println("Comenta el test!!!\n Per superar els test has de contestar la pregunta correctament.\n");
		System.out.println("2+6=?");

		String a = teclat.readLine();

		if (a.equals("8")) {
			i = 10;
		} else {
			i = 0;
		}

		System.out.println("\nPunts totals: " + i);

		if (i != 10) {
			System.out.println("Ho sento no has superat el test!!!");
		} else {
			System.out.println("Felcitats, resposta correcta!!!");
		}
	}
}