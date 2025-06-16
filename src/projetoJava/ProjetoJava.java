package projetoJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjetoJava {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String answ, pont;
		int count;
		
		pont = "--------------------------";
		count =0;
		
		List<String> quest= new ArrayList<>();
		quest.add("Telefonou para a Vítima? ");
		quest.add("Esteve no local do crime? ");
		quest.add("Mora perto da Vítima? ");
		quest.add("Devia para a Vítima? ");
		quest.add("Já trabalhou com a Vítima? ");
		
		for (String lista : quest) {
			
			/*OUTRA FORMA DE FAZER FOR PARA LOOPS:
			 * 
			 * for (int i = 0 ; i < pergunta.size(); i++) {
				System.out.println(pergunta.get(i));
				answ = input.next();
			}*/
			
			while (true) {
				System.out.println(lista);
				answ = input.next().toLowerCase();
				System.out.println(pont);
				
				if (answ.equals("sim")) {
					count++;
					break;
					
				}
				else if(answ.equals("não")) {
					break;
					
				}
				else {
					System.out.println("Resposta inválida. Digite 'sim' ou 'não'.");
					
				}
			}
		}
		if (count == 2) {
			System.out.println("Suspeita");
			
		}
		else if (count == 3 || count == 4) {
			System.out.println("Cúmplice");
			
		}
		else if (count == 5) {
			System.out.println("Assassino");
		
		}
		else {
			System.out.println("Inocente");
			
		}
		System.out.println(pont);
}
}
