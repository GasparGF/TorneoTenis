package Partido;
import java.util.Scanner;

public class Partido {

	public static void main(String[] args) {
		int punto=0, set=0, setelegido=3, puntos1=0, puntos2=0, ventaja=0;
		boolean gamewin=true;
		
		Scanner teclado = new Scanner(System.in);
		// Nombre del torneo
		System.out.println("\t Bievenido a Simulacion Tenis!! \n Escriba el nombre del torneo : ");
		String torneo = teclado.nextLine();
		
		// Nombre del jugador 1
		System.out.println("Ingrese el nombre del jugador 1 : ");
		String jugador1 = teclado.nextLine();
		
		// Nombre del jugador 2
		System.out.println("Ingrese el nombre del jugador 2 : ");
		String jugador2 = teclado.nextLine();
		
		// Probabilidades de ganar del jugador 1
		System.out.println("Escriba un numero del 1 al 100 con el porcentaje de victoria del 1er jugador ");
		int porcentaje = teclado.nextInt();
		
		System.out.println("Comienza el partido de "+torneo);
		
		while (set!=setelegido) {
			switch(ventaja) {
				case 0:
					punto = (int)(Math.random() * 100);
					if (punto<=porcentaje) {
						puntos1=puntos1+15;
						ventaja=puntos1-puntos2;
						System.out.println("Gano "+jugador1+" tiene ahora "+puntos1+" y "+jugador2+" tiene "+puntos2+" la ventaja es de "+ventaja);
					}else{
						puntos2=puntos2+15;
						ventaja=puntos2-puntos1;
						System.out.println("Gano "+jugador2+" tiene ahora "+puntos2+" y "+jugador1+" tiene "+puntos1+" la ventaja es de "+ventaja);
					}
					break;
				case 15:
					punto = (int)(Math.random() * 100);
					if (punto<=porcentaje) {
						puntos1=puntos1+15;
						ventaja=puntos1-puntos2;
						System.out.println("Gano "+jugador1+" tiene ahora "+puntos1+" y "+jugador2+" tiene "+puntos2+" la ventaja es de "+ventaja);
						set=set+1;
					}else{
						puntos2=puntos2+15;
						ventaja=puntos2-puntos1;
						System.out.println("Gano "+jugador2+" tiene ahora "+puntos2+" y "+jugador1+" tiene "+puntos1+" la ventaja es de "+ventaja);
					}
					break;
			}
			
			
			
		}

		

	}

}
