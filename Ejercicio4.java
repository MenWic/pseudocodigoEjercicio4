import java.util.*;
public class Ejercicio4{

	public static void main(String[] args){
		int mayEdad=0;
		int menEdad=0;
		int edad;
		Scanner scanner=new Scanner(System.in);

		for(int i=0;i<20;i++){
			System.out.print((i+1) +") Ingrese la edad: ");
			edad=scanner.nextInt();

			if(edad>mayEdad){
				mayEdad=edad;
			} 
			else if(edad<mayEdad){
				menEdad=edad;
			}
		}
		System.out.println("La edad mayor es: "+mayEdad+" años");
		System.out.println("La edad menor es: "+menEdad+" años");
	}
}