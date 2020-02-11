package Pratica_JavaDOC;

import java.util.Scanner;

public class ACT2_EJ7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		byte bHorasE; 	// Numero de horas extras trabajadas en una semana.
		byte bHorasS;	// Numero de horas trabajadas en una semana
		int iSalarioS;	// Salario semanal del trabajador.
		
		do {
			// Pedimos por pantalla el dato necesario.
			System.out.println("Introduce numero de horas Extras(Entre 0 y 15): ");
			bHorasE = input.nextByte();
			// En el while validamos la cifra de las horas validas.
		}while (0>bHorasE && bHorasE > 15);
		
		do {
			// Pedimos por pantalla el numero de horas semanales que se trabaja.
			System.out.println("Introduce numero de horas Semanales(Entre 1 y 40): ");
			bHorasS = input.nextByte();
			// En el while validamos el numero de horas semanales trabajadas.
		}while(1>bHorasS && bHorasS >40);
		

		// Se imprime por pantalla el resultado de la operacion:
		System.out.println(bHorasE+" horas extra y "+bHorasS+" equivalen a "+salario(bHorasE, bHorasS)+" euros semanales");
	}
	
	
	/**
	 * 
	 * @param horasExtra Indica el numero de horas extra trabajadas en una semana.
	 * @param horasSemanales Indica el numero de horas semanales trabajadas en una semana.
	 * @return devuelve el valor del salario semanal.
	 */
	
	
	public static int salario(int horasExtra,int horasSemanales) {
		int iSalario = 0;
		// Operacion para calcular el salario semanal
		iSalario = horasExtra * 20 + horasSemanales * 10;
		// Devolver el valor del salario semanal.
		return iSalario;
	}
}