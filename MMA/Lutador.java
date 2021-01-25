import java.util.Scanner;


public class Lutador{

	private String nome;
	private String pTecnica;
	private String tecnicas[] = new String[10];
	private int qtdTecnicas = 0;
	private int vitorias;
	private int derrotas;

	public Lutador(){}


	public void ganhou(){
		this.vitorias++;
	}

	public void perdeu(){
		this.derrotas++;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return this.nome;
	}

	public void setPTecnica(String pTecnica){
		this.pTecnica = pTecnica;
	}

	public String getPTecnica(){
		return this.pTecnica;
	}

	public void setTecnica(String tecnica){
		this.tecnicas[this.qtdTecnicas] = tecnica;
		this.qtdTecnicas++;
	}

	public void setTecnicas(String[] tecnicas){
		for (int i = 0;i < tecnicas.length; i++) {
			this.tecnicas[i] = tecnicas[i];
		}
	}

	public String[] getTecnicas(){
		return this.tecnicas;
	}
}