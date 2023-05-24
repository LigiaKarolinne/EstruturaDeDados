package atividade;
import atividade.Node;

public class Pilha_Lista {
	private Node topo;
	private int size;
	public Node getTopo() {
		return topo;
	}
	public void setTopo(Node topo) {
		this.topo = topo;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void push (char elemento) {
		Node NovoNode = new Node(elemento);
		NovoNode.setProximo(topo);
		topo = NovoNode;
		size = size + 1;
	}
	public boolean isEmpty() {
		return topo == null;
		

    }
	public  char pop() {
		if(isEmpty()){
			System.out.println("A lista é nula");
		}
		char elemento = topo.getElemento();
		size = size - size;
		return elemento;
	}
	public boolean ParCorrespondente(char opening, char closing ) {
		return(opening == '(' && closing == ')');
		      (opening == "[" && closing == ']');
		      (opening == '{' && closing == '}');
	}
	public boolean VerificarExpressao(String expressao) {
		for(int i = 0; i<expressao.lenght();i = i + 1) {
			char vaiavelChar = variavel.charAt(i);
            if (variavelChar == '(' || currentChar == '[' || currentChar == '{') {
                push(variavelChar);
            } else if (variavelChar == ')' || variavelChar == ']' || currentChar == '}') {
                if (isEmpty() || !(pop(, variavelChar)) {
                    return false;
                }
            }
        }
	}
        return isEmpty();{
        	
        }
}
}
