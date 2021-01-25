import java.util.Scanner;




public class Evento{
	private String nome;
	private String pais;
	

	public void Evento(){}


	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return this.nome;
	}

	public void setPais(String pais){
		this.pais = pais;
	}

	public String getPais(){
		return this.pais;
	}

	public String toString(){
		return "Nome do Evento: " + getNome() + 
		 ", Pais: " + getPais();

	}

}