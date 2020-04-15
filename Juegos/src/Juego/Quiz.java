package Juego;

import java.util.Scanner;

public class AdivinaRespuesta {
	
	static Scanner sc=new Scanner(System.in);
	String respuesta;
	int aciertos;
	System.out.println("De que color es el caballo blanco de santiago?");
  System.out.println("(a) Blanco (b) Rojo (c) Verde");
  respuesta=sc.nextLine();
  if (respuesta=="a"){
    aciertos=+1;
    System.out.println("Correcto");
  }else{
    System.out.println("Incorrecto");
  }
  System.out.println("Año de inicio de la 2 Guerra mundial");
  System.out.println("(a) 1939 (b) 1942 (c) 1945");
  respuesta=sc.nextLine();
  if (respuesta=="a"){
    aciertos=+1;
    System.out.println("Correcto");
  }else{
    System.out.println("Incorrecto");
  }
  System.out.println("Cuantas provincias tiene españa");
  System.out.println("(a) 47 (b) 42 (c) 52");
  respuesta=sc.nextLine();
  if (respuesta=="b"){
    aciertos=+1;
    System.out.println("Correcto");
  }else{
    System.out.println("Incorrecto");
  }
  System.out.println("Has tenido un total de aciertos de "+aciertos);
  
}
