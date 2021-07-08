import java.util.Scanner;

public class ComparacionNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int primerNumero;
		int segundoNumero;
		int tercerNumero;
		Scanner leerNumero = new Scanner(System.in); 
			System.out.println("Introduce tu primer numero:");
			primerNumero = leerNumero.nextInt();
			
			System.out.println("Introduce tu segundo numero:");
			segundoNumero = leerNumero.nextInt();
			
			System.out.println("Introduce tu tercer numero:");
			tercerNumero = leerNumero.nextInt();
		
		leerNumero.close();
		
		if(primerNumero > segundoNumero && segundoNumero > tercerNumero) {
			System.out.println(primerNumero + ">" + segundoNumero + ">"
					+ tercerNumero);
		} else if (primerNumero < segundoNumero && segundoNumero < tercerNumero) {
			System.out.println(tercerNumero + ">" + segundoNumero + ">" + 
		primerNumero);
		} else if (segundoNumero > primerNumero && primerNumero > tercerNumero){
			System.out.println(segundoNumero + ">" + primerNumero + ">" + 
					tercerNumero);
		}	else if (segundoNumero > tercerNumero && tercerNumero > primerNumero){
			System.out.println(segundoNumero + ">" + tercerNumero + ">" + 
					primerNumero);
		}	
			else {
			System.out.println("Faltan conbinaciones");
		}
	}

}
