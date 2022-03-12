package Exercicio4;

public class TestaListaEncadeada {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestaListaEncadeada testaListaEncadeada = new TestaListaEncadeada();
		ListaEncadeada listaEncadeada = new ListaEncadeada();
		
		testaListaEncadeada.addContato(listaEncadeada);
		System.out.println("Todos os contatos foram adicionados com sucesso!!");
		System.out.println("Você tem os seguintes contatos adicionados: ");
		while(listaEncadeada.temProximo()) {
			System.out.println(listaEncadeada.getPosicaoAtual().getValor().getNome());
		}
		System.out.println("Agora vamos remover!!");
		
		testaListaEncadeada.removerContato(listaEncadeada);
		System.out.println("Contatos removidos");
		System.out.println("A lista ficou assim: ");
		while(listaEncadeada.temProximo()) {
			System.out.println(listaEncadeada.getPosicaoAtual().getValor().getNome());
		}
		
	}
	
	public void addContato(ListaEncadeada listaEncadeada) {
	    Contato contato1 = new Contato(1, "Karilana", "Karilana@email.com.br"); //valor1
	    Contato contato2 = new Contato(2, "Hyago", "Hyago@email.com.br"); //valor 2
	    Contato contato3 = new Contato(3, "Lucilandia", "Lucilandia@email.com.br"); //valor3
	    Contato contato4 = new Contato(4, "Amancio", "Amancio@email.com.br"); //valor 4
	    Contato contato5 = new Contato(5, "Willian", "Willian@email.com.br"); //valor 5
	    Contato contato6 = new Contato(6, "Raul", "Raul@email.com.br"); //valor 5
		
		listaEncadeada.adicionar(contato1); // |Karilana| --> 
		listaEncadeada.adicionar(contato2); // |Karilana| -->|Hyago| -->
		listaEncadeada.adicionar(contato3); // |Karilana| -->|Hyago| --> |Lucilandia| -->
		listaEncadeada.adicionar(contato4); // |Karilana| -->|Hyago| --> |Lucilandia| -->|Amancio| -->
		listaEncadeada.adicionar(contato5);//  |Karilana| -->|Hyago| --> |Lucilandia| -->|Amancio| -->|Willian| -->
		listaEncadeada.adicionar(contato6); // |Karilana| -->|Hyago| --> |Lucilandia| -->|Amancio| -->|Willian| -->|Raul| -->
	}
	
	public void removerContato(ListaEncadeada listaEncadeada) {
		listaEncadeada.remover();
		listaEncadeada.remover();
		listaEncadeada.remover();
		listaEncadeada.remover();
		
	}

}

