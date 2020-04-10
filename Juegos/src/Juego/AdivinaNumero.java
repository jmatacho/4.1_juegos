package Juego;

import java.util.Scanner;

public class AdivinaNumero {
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		do {
		int numAleatorio=(int)(Math.random()*100)+1,contador,numIntroducido;
		boolean flag=false;
		String eleccion;
		
		System.out.println("Voy a pensar en un numero del 1 al 100, seras capaz de adivinarlo?");
		System.out.println("Dime... Cuantas veces quieres intentarlo?");
		
		//Pido al usuario cuantas veces quiere intentarlo
		contador=pideNumero();
		
		//Realizo el juego
		System.out.println("Bien...Comencemos!");
		
		for (int i = 0; i < contador; i++) {
			System.out.println("Introduzca un numero");
			numIntroducido=pideNumero();
			if(numIntroducido==numAleatorio) {
				System.out.println("Has Acertado!");
				flag=true;
				break;
			}
			else {
		//En el caso de que no acierte, le dire si a estado cerca o no
				int cercania=numAleatorio-numIntroducido;
				muestroResultado(cercania);
			}
		}
		
		//Le digo al usuario los resultados del juego
		System.out.println("El numero en el que he estado pensando es el "+numAleatorio);
		
		if(flag==true) {
			System.out.println("Felicidades, has adivinado el numero y me has ganado");
		}
		else {
			System.out.println("No has podido adivinar el numero, muajajaja");
		}
		
		//Digo al usuario si quiere jugar de nuevo
		
		System.out.println("Deseas jugar de nuevo? (Y para jugar de nuevo, otra cosa para acabar)");
		if(!((eleccion=sc.next()).equals("Y"))) {
			return;
		}
		
		}while(true);
		
	}

	private static void muestroResultado(int cercania) {
		//Pensaba hacer esto con un switch, pero no puedes poner simbolos de mayor o igual en los cases
		if(cercania>=20) System.out.println("Ni te has acercado");
		else if(cercania>=10) System.out.println("Casi, casi...");
		else if(cercania>=5) System.out.println("MUYYY CERCA");
		else if(cercania>=1)System.out.println("Estas que te quemas");
		else if(cercania>=-5)System.out.println("Casi le das, pero te has pasado");
		else if(cercania>=-10) System.out.println("Te has pasado un poquito");
		else if(cercania>=-20) System.out.println("Te has pasado");
		else System.out.println("Te has pasado tres pueblos");
		
	}

	private static int pideNumero() {
		int numElegido;
		do {
			if(sc.hasNextInt()) {
				numElegido=sc.nextInt();
				break;
			}
			else {
				System.out.println("Necesito que sea un numero entero");
			}
		}while(true);
		
		return numElegido;
	}


	
	

}
