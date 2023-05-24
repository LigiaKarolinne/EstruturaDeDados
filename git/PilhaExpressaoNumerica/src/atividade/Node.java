package atividade;

public class Node {
	private char elemento;
	private Node proximo;
	
	public Node(char elemento) {
		this.elemento = elemento;
		this.proximo = null;
	}

	public char getElemento() {
		return elemento;
	}

	public void setElemento(char elemento) {
		this.elemento = elemento;
	}

	public Node getProximo() {
		return proximo;
	}

	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}
	
}
