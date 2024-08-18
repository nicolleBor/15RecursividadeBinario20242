package view;

import java.util.Scanner;

import controller.ConverteBinario;

public class Principal {

	public static void main(String[] args) {
		ConverteBinario conv = new ConverteBinario();
		Scanner entrada = new Scanner(System.in);
		int value = 0;
		while(value <= 0 || value > 2000) {
			System.out.println("Digite um valor: ");
			value = entrada.nextInt();
		}
		String resposta = conv.converteBinario(value);
		System.out.println(resposta);
		entrada.close();
	}

}
