import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperacionsDebug {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub

		int numero1, numero2, resultOperacio;
		char operacio;

		BufferedReader teclat = new BufferedReader(new InputStreamReader(
				System.in));

		numero1 = getNumero1(teclat);
		numero2 = getNumero2(teclat);

		System.out.println("Quina operacio vols realitzar(0-Resta/1-Suma/2-Divisio/3-Multiplicacio):");
		operacio = (char) (teclat.read());

		resultOperacio = doOperacio(operacio, numero1, numero2);
		
		if (operacio == '0') {
			System.out.printf("La suma de %d mes %d es %d \n", numero1, numero2, resultOperacio);
		} else if (operacio == '1') {
			System.out.printf("La resta de %d menys %d es %d \n", numero1, numero2,	resultOperacio);
		} 
		else if (operacio =='2'){
			System.out.printf("La multiplicacio de %d per %d es %d \n", numero1, numero2, resultOperacio);
		}
		else if (operacio =='3'){
				if(numero1==0 | numero2==0)
					System.out.println("La divisio no pot implicar valors nuls \n");
				else
					System.out.printf("La divisio de %d entre %d es %d \n", numero1, numero2, resultOperacio);
		}
		else { System.out.printf("L operacio no es valida");}	
	}

	private static int getNumero1(BufferedReader teclat) throws Exception, IOException {
		// TODO Auto-generated method stub
		System.out.println("Introdueix el primer numero:");
		return Integer.parseInt(teclat.readLine());
	}

	private static int getNumero2(BufferedReader teclat) throws Exception, IOException {
		// TODO Auto-generated method stub
		System.out.println("Introdueix el segon numero:");
		return Integer.parseInt(teclat.readLine());
	}

	private static int doOperacio(char operacio, int numero1, int numero2) {

		if (operacio == '0') {
			return numero1 + numero2;
		} else if (operacio == '1') {
			return numero1 - numero2;
		} 
		else if (operacio =='2'){
			return numero1 * numero2;
		}
		else if (operacio =='3'){
			return numero1 / numero2;
		}
		else{
			return -2;
		}
		
	}
}