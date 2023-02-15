package com.ejerciciosguia1.ejercicios;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
import java.time.LocalDate;

@SpringBootApplication
public class EjerciciosApplication {


	//1. Escriba un programa que solicite a un usuario dos números por teclado y calcule su suma, resta, producto y división.

	public static void operaciones(double numero1, Double numero2){

		double suma= numero1+numero2;
		double resta= numero1-numero2;
		double multi= numero1 * numero2;
		double div= numero1/numero2;
		System.out.println("La suma de tus dos numeros es de: "+suma);
		System.out.println("La resta de tus dos numeros es de: "+resta);
		System.out.println("La multiplicacion de tus dos numeros es de: "+multi);
		System.out.println("La division de tus dos numeros es de: "+div);
	}

	/*2. Escriba un programa que permita calcular el área de un rectángulo. ¿Cómo modificaría su
        programa para que ahora calcule el área de un cuadrado de igual medida al ancho del
        rectángulo anterior?
    */

	public static void rectangulo(int ancho, int alto){

		int areaRectangulo = ancho* alto;
		int areaCuadrado = ancho * ancho;
		System.out.println("El area del rectangulo es: "+ areaRectangulo);
		System.out.println("Si tuvieramos un cuadrado del mismo ancho de tu rectangulo, el area de este es: "+areaCuadrado);
	}

	/*3. Escriba un programa que, dada una cantidad de dinero en pesos chilenos ingresada por teclado, calcule la cantidad de dólares que se pueden comprar. */

	public static int dolares(int pesoChileno){

		int conversion= pesoChileno/792;
		return conversion;
	}

	/*4. Escriba un algoritmo que permita calcular la edad de una persona según su año de nacimiento.*/

	public static int edad(int nacimiento){
		LocalDate date = LocalDate.now();
		int anio = date.getYear();
		int edad = anio-nacimiento;
		return edad;
	}

	// 5. Escriba un programa que solicite al usuario 4 notas y calcule su promedio.

	public static double notas (double nota1,double nota2,double nota3,double nota4){
		double promedio = (nota1+nota2+nota3+nota4)/4;
		return promedio;
  	}

	/*6. Escriba un programa que permita conocer el sueldo semanal de un trabajador en base a las horas que trabaja y el valor por hora ($H/H) que recibe. */

	public static int sueldo(int horas,int valorHora){
		int totalSemana = valorHora*horas;
		return totalSemana;
	}

	// 7. Escriba un programa que permita determinar cuánto cobra un pintor por pintar una cantidad dada de metros cuadrados, a partir del costo ingresado por el usuario.

	public static int pintor(int metrosCuadrados, int valor){
		int totalPintado = valor*metrosCuadrados;
		return totalPintado;
	}

	// 8. Escriba un programa que permita determinar el costo que tendrá el realizar una llamada telefónica en base al tiempo que dura la llamada y su costo por segundo.

	public static int llamada(int duracion, int valor){
		int minSegundo = duracion * 60;
		int totalCall= valor*minSegundo;
		return totalCall;
	}

	/* 9. Escriba un algoritmo que permita para determinar cuánto pagará finalmente una persona por un artículo, 
	considerando que tiene un descuento de 20%, y debe pagar 15% de IVA.*/
	






	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		//ejercicio 1
		/*System.out.println("Ingrese dos numeros : ");
		System.out.println("Ingrese numero 1 : ");
		double datoUno = Double.parseDouble(teclado.nextLine());
		System.out.println("Ingrese numero 2 : ");
		double datoDos = Double.parseDouble(teclado.nextLine());
		operaciones(datoUno, datoDos);*/

		//ejercicio 2
		/*System.out.println("Ingrese ancho y alto de su rectangulo");
		System.out.println("Ingrese ancho : ");
		int datoUno = teclado.nextInt();
		System.out.println("Ingrese alto : ");
		int datoDos = teclado.nextInt();
		rectangulo(datoUno,datoDos);*/

		//ejercicio 3
		/*System.out.println("Ingrese pesos chilenos a convertir a dolares: ");
		int datoUno = teclado.nextInt();
		System.out.println("Tus "+datoUno+" convertidos a dolares, quedan en: $"+dolares(datoUno)+" dolares aprox");*/

		//ejercicio 4
		/*System.out.println("Ingrese su año de nacimiento: ");
		int datoUno = teclado.nextInt();
		System.out.println("Tu edad este año es o sera de: "+edad(datoUno));*/

		//ejercicio 5 (ojo , double solo acepta comas ej: 5,5, no acepta puntos 5.5)
		/*System.out.println("Ingrese 4 notas para sacar su promedio ");
		System.out.println("Ingrese nota 1 : ");
		Double datoUno = teclado.nextDouble();
		System.out.println("Ingrese nota 2 : ");
		Double datoDos = teclado.nextDouble();
		System.out.println("Ingrese nota 3 : ");
		Double datoTres = teclado.nextDouble();
		System.out.println("Ingrese nota 4 : ");
		Double datoCuatro  = teclado.nextDouble();
		System.out.println("Tu promedio fue de: "+notas(datoUno,datoDos,datoTres,datoCuatro));*/

		//ejercicio 6
		/*System.out.println("Cuanto ganas por semana?");
		System.out.println("Ingresa valor por hora de trabajo : ");
		int datoUno = teclado.nextInt();
		System.out.println("Ingresa horas total trabajadas durante la semana: ");
		int datoDos = teclado.nextInt();
		System.out.println("Tu sueldo semanal es de: "+sueldo(datoUno,datoDos));*/

		//ejercicio 7 
		/*System.out.println("Cuanto cobrara el pintor por tantos metros cuadrados?");
		System.out.println("Ingresa total metros cuadrados: ");
		int datoUno = teclado.nextInt();
		System.out.println("Ingresa valor por metro cuadrado: ");
		int datoDos = teclado.nextInt();
		System.out.println("El valor por pintar "+datoUno+" metros cuadrados es de: $"+pintor(datoUno,datoDos));*/

		//ejericio 8 
		/*System.out.println("Cuanto te salio la llamada por segundos hablados?");
		System.out.println("Ingresa total minutos de la llamada: ");
		int datoUno = teclado.nextInt();
		System.out.println("Ingresa valor por segundo hablado: ");
		int datoDos = teclado.nextInt();
		System.out.println("El valor total por hablar "+datoUno+" minutos es de: $"+llamada(datoUno,datoDos)+" por segundo hablado");*/

















		
 



	}

}
