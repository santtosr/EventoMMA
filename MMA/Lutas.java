import java.util.Scanner;



public class Lutas{
	private int numero;
	private String ganhador;
	private String perdedor;
	private String fimLuta;
	private String evento;


	public void Lutas(){}

	public void setNumero(int numero){
		this.numero = numero;
	}

	public int getNumero(){
		return this.numero;
	}

	public void setGanhador(String ganhador){
		this.ganhador = ganhador;
	}

	public String getGanhador(){
		return this.ganhador;
	}

	public void setPerdedor(String perdedor){
		this.perdedor = perdedor;
	}

	public String getPerdedor(){
		return this.perdedor;
	}

	public void setFimLuta(String fimLuta){
		this.fimLuta = fimLuta;
	}

	public String getFimLuta(){
		return this.fimLuta;
	}

	public void setEvento(String evento){
		this.evento = evento;
	}

	public String getEvento(){
		return this.evento;
	}

}