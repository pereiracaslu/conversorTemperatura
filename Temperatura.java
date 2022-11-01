package fundamentos;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		double cel,fah,kel, graus;
		int temperatura=0, transformar=0;
		
	Scanner leia = new Scanner(System.in);
	
	do {
	System.out.println("Qual a escala de temperatura?\n\n1- Celsius\n2- Fahrenheitkel\n3- Kelvin\n\nDigite: ");
	temperatura = leia.nextInt();
	}while(temperatura!= 1 &&  temperatura!=2 && temperatura!=3);
	

	
	//Temperatura em celsius
		if (temperatura == 1) {
			
			do {
			System.out.println("\n\nEm que escala você que transformar?\n\n1- Kelvin\n2- Fahrenheit\n\nDigite: ");
				transformar = leia.nextInt();
			}while	(transformar!=1 && transformar!=2);
				
			
				switch (transformar) {
				
				//Transformar em Kelvin
				case 1:
					System.out.println("\n\nQuantos graus?\n\nDigite: ");
						graus = leia.nextDouble();
							kel = graus + 273;
								System.out.printf(graus+" °C em Kelvin é igual a %.2f",kel," °K");
								break;
				
				//Transformar em Fahrenheit
				case 2:
					System.out.println("\n\nQuantos graus?\n\nDigite: ");
						graus = leia.nextDouble();
							fah = 1.8*graus + 32;
								System.out.printf(graus+" °C em Kelvin é igual a %.2f",fah," °F");
								break;
								
				default:
					System.out.println("Opção inválida. Digite uma opção válida.");
				}
	
			}
			
			//Temperatura em Fahrenheit
			if (temperatura == 2) {
				
				do{
				System.out.println("\n\nEm que escala você que transformar?\n\n1- Kelvin\n2- Celsiu\n\nDigite: ");
				transformar = leia.nextInt();
				}while	(transformar!=1 && transformar!=2);
			
				switch (transformar) {
				
				//Transformar em Kelvin
				case 1:
					System.out.println("\n\nQuantos graus?\n\nDigite: ");
						graus = leia.nextDouble();
							kel = (graus-32)*5/9+273;
								System.out.printf(graus+" °F em Kelvin é igual a %.2f",kel," °K");
								break;
				
				//Transformar em Celsius				
				case 2:
					System.out.println("\n\nQuantos graus?\n\nDigite: ");
						graus = leia.nextDouble();
							cel = (graus-32)/1.8;
								System.out.printf(graus+" °F em Kelvin é igual a %.2f",cel," °C");
								break;
	
			}}
				
			//Temperatura em Kelvin	
			if (temperatura == 3) {
				
				do {
				System.out.println("\n\nEm que escala você que transformar?\n\n1- Fahrenheit\n2- Celsiu\n\nDigite: ");
					transformar = leia.nextInt();
				}while	(transformar!=1 && transformar!=2);
				switch (transformar) {
				
				//Transformar em Fahrenheit
				case 1:
					System.out.println("\n\nQuantos graus?\n\nDigite: ");
						graus = leia.nextDouble();
							fah = (graus-273)*1.8+32;
								System.out.printf(graus+" °K em Kelvin é igual a %.2f",fah," °F");
								break;
				
				//Transformar em Celsius
				case 2:
					System.out.println("\n\nQuantos graus?\n\nDigite: ");
						graus = leia.nextDouble();
							cel = graus-273;
								System.out.printf(graus+" °K em Kelvin é igual a %.2f",cel," °C");
								break;
	
				}}
				
	
				
		
		}
}
	

