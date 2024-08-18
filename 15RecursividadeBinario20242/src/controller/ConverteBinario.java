package controller;

public class ConverteBinario {

	public ConverteBinario() {
		super();
	}
	
	public String converteBinario(int value) {
		//Condição de parada
		if(value == 0) {
			return "";
			
		} else {
			return converteBinario(value/2) + String.valueOf(value%2); //Chamada de função 
		}
	}

}
