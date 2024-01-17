package tarefa2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
	public static void main(String args[]) {
		List<String> listaM = new ArrayList<>();
		List<String> listaF = new ArrayList<>();
		String name;
		Scanner texto = new Scanner(System.in);
		System.out.println("quantas pessoas vão ser cadastradas?");
		int contador  = texto.nextInt();
		System.out.println(contador);
		
		Scanner tex = new Scanner(System.in);
		System.out.println("escreva o nome e o sexo com a separação usando -:");
		name = tex.nextLine();
		int num =0;
		int nu =1;
		while(contador != num) {
		String [] nomet = name.split(",");
		String [] nome = nomet[num].split("-");
		String [] sexoe = name.split("-");
		String [] sexo = sexoe[nu].split(",");
		System.out.println(sexo[0]);
		if (sexo[0].equals("m")) {
		listaM.add (nome[0]);
		} else if( sexo[0].equals("f")) {
			listaF.add(nome[0]);
		}
		num++;
		nu++;
			}
		System.out.println("lista masculina");
		System.out.println(listaM);
		System.out.println("lista feminina");
		System.out.println(listaF);
				}
}
	 

