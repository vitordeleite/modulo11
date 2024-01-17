package tarefa1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Tarefa1 {
	public static void main(String args[]) {
		List<String> lista = new ArrayList<>();
		Scanner valor = new Scanner (System.in);
		System.out.println("Quantos nomes vão ser adicionados ?");
		int contador = valor.nextInt();
		System.out.println("vão ser " + contador + " adicionados na lista ");
		
		Scanner ler= new Scanner (System.in);
		System.out.println("escreva nome de pessoas usando virgurla: ");
		 String guarda = ler.nextLine();
		String [] nomes = guarda.split(",");
		int numero = 0;
		while(numero != contador) {
			lista.add (nomes[numero]);
			numero++;
			}
		Collections.sort(lista);
		System.out.println(lista);
		
		
	
	
		
		}

}
