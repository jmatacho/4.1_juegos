package Juego;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class InvierteArray {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		//Maria te voy a entregar este programa para que veas lo horrible que es eclipse y lo inutul que es
		
		System.out.println("Hola Bienvenido al nuevo jurgo de invertir arrays");
		System.out.println("Escribe taantas palabras como quieras que al final se invertirán");
		
		int salir=1;
		String palabra;
		ArrayList<String> array = new ArrayList<>();
		
		while(salir !=0){
			System.out.println("Escribe tu palabra");
			array.add(sc.nextLine());
			
			System.out.println("Quieres añadir una palabra?(1 para continuar||0 para salir)");
			salir =pideNumero();
			
			
				
			}
		
			System.out.println("Esta es tu lista");
			for(String p : array) {
				System.out.println(p);
			}
			System.out.println("\n\ny esta es tu lista invertida");
			Collections.reverse(array);
			for(String p : array) {
				System.out.println(p);
			}
		}
		
	
	
	
	public static int pideNumero () {
		int numero;
		boolean opcion=false;
		do {
			sc.hasNextLine();
			System.out.println("Escribe una respuesta, correcta");
			numero=sc.nextInt();
			if(numero !='1' || numero != '0') {
				opcion=false;
			}//Aqui por ejemplo no entiendo que ** me esta diciendo ya que está tomando el valor 0 como false 
			//y no como un **** numero que es lo que es la variable "numero", y si ya lo he probado con else, y cn else if
			
			if(numero= 1 || numero = 0) 
				{opcion=true;}
			
			
		} while (opcion=true);
		
		return numero;
	}
}
