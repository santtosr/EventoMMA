import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		
        Leitor leitor = new Leitor();
      
      	Lutador lutadores[] = new Lutador[100];
      	Evento eventos[] = new Evento[10];
      	Lutas luta[] = new Lutas[1000];



      	int op, qtdEventos = 0;
      	int qtdLutadores = 0, qtdLuta = 0;
        do {

        	System.out.println("---------------Escolha uma Opção---------------");
	        System.out.println("      1 - Cadastrar Evento.");
	        System.out.println("      2 - Cadastrar Lutador.");
	        System.out.println("      3 - Cadastrar Luta.");
	        System.out.println("      4 - Listar Evento.");
	        System.out.println("      5 - Listar Lutador.");
	        System.out.println("      0 - Encerrar.");
	        System.out.println("-----------------------------------------------");
	        System.out.print("  Qual operação deseja realizar: ");
	        op = leitor.leInteiro();

	        System.out.println("");

	    switch (op) {
	    	case 1:
	    		System.out.println("----------Cadastrar Evento----------");

	    		if(qtdEventos < eventos.length){
		    		System.out.println("Informe os dados do eventos: ");
		    		eventos[qtdEventos] = new Evento();
	    			eventos[qtdEventos].setNome(leitor.leString());
	    			eventos[qtdEventos].setPais(leitor.leString());

	    			qtdEventos++;
	    		} else {

	    			System.out.println("A Lista de Eventos está cheia!!");
	    		}

	    		System.out.println("");
	    		break;
	    	case 2:
	    		System.out.println("----------Cadastrar Lutador----------");

	    		if (qtdLutadores < lutadores.length){
	    			System.out.println("Informe os dados do Lutador: ");
	    			lutadores[qtdLutadores] = new Lutador();
	    			lutadores[qtdLutadores].setNome(leitor.leString());
	    			lutadores[qtdLutadores].setPTecnica(leitor.leString());

	    			for (int i = 0; i < lutadores[qtdLutadores].getTecnicas().length; i++){
	    				
						lutadores[qtdLutadores].setTecnica(leitor.leString());
	    			}
	    

	    			qtdLutadores++;
	    		} else {

	    			System.out.println("A Lista de Lutadoes está cheia!!");
	    		}

	    		System.out.println("");
	    		break;
	    	case 3:
	    		System.out.println("----------Cadastrar Luta----------");

	    		if (qtdLuta < luta.length){
	    			System.out.println("Informe os dados do Lutador: ");
	    			luta[qtdLuta] = new Lutas();
	    			luta[qtdLuta].setNumero(leitor.leInteiro());
	    			luta[qtdLuta].setFimLuta(leitor.leString());
	    			luta[qtdLuta].setGanhador(leitor.leString());
	    			luta[qtdLuta].setPerdedor(leitor.leString());
	    			luta[qtdLuta].setEvento(leitor.leString());

	    			for (Lutador lutador: lutadores){
						if(lutador.getNome().equals(luta[qtdLuta].getGanhador())){
							lutador.ganhou();

						}else if(lutador.getNome().equals(luta[qtdLuta].getPerdedor())){
							lutador.perdeu();
						}
					}

	    			qtdLuta++;
	    		} else {

	    			System.out.println("A Lista de Luta está cheia!!");
	    		}

	    		System.out.println("");
	    		break;
	    	case 4:
				System.out.println("----------Lista de Eventos----------");

				for (Evento evento: eventos){
					
					System.out.println(evento.toString());
				}

				break;
			case 5:
				System.out.println("----------Lista de Lutadores----------");



	    		default:
	    			System.out.println(" Programa Finalizado!");
	    	}

	    } while(op != 0);

	}
}