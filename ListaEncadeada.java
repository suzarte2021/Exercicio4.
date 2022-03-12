package Exercicio4;

public class ListaEncadeada {

	private Celula primeiro;
	private Celula ultimo;
	private Celula posicaoAtual;


public void adicionar (Contato valor) {
	Celula celula = new Celula();
	celula.setValor(valor);
	//como ta minha lista?
	
	if(primeiro ==null && ultimo ==null) { // pq pergunto isso?
		primeiro = celula;
		ultimo = celula;
		
	}else {
		 
		ultimo.setProximo(celula);
		ultimo = celula;
	}
	}
public boolean temProximo() {
	if (primeiro == null) {
		return false;
	}else if(posicaoAtual == null){
		posicaoAtual = primeiro;
		return true;
	}else {
		boolean temProximo = posicaoAtual.getProximo() != null ? true : false;
		posicaoAtual = posicaoAtual.getProximo();
		return temProximo;
	}
	 //                                                                    
	// |Karilana| -->|Hyago| --> |Lucilandia| -->|Amancio| -->|Willian| --> null      |Raul| -->
}

public Celula getPosicaoAtual() {
	return posicaoAtual;
}

// esse eh  o nosso metodo para excluir contato
public void remover() {
	if(primeiro.getProximo() != null) {
		Celula celula = this.recuperarPenultimo(this.primeiro);
		ultimo = celula;
		celula.setProximo(null);
	} else {
		primeiro = ultimo = null;
	}
	
	
}

private Celula recuperarPenultimo(Celula celula) {
	if(celula.getProximo().equals(ultimo)) {
		return celula;
	}
	return recuperarPenultimo(celula.getProximo());
	
}




}
