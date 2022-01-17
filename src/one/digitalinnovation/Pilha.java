package one.digitalinnovation;

public class Pilha<T> {
	
	private No<T> refNoEntradaPilha;
	
	public Pilha() {
		this.refNoEntradaPilha = null;
	}
	
	public void push(T novoNo) {
		No<T> refAuxiliar = refNoEntradaPilha;
		refNoEntradaPilha = new No(novoNo);
		refNoEntradaPilha.setRefNo(refAuxiliar);
	}
	
	public No pop() {
		if(!this.isEmpty()) {
			No noPoped = refNoEntradaPilha;
			refNoEntradaPilha = refNoEntradaPilha.getRefNo();
			return noPoped;
		}
		return null;
	}
	
	public No top() {
		return refNoEntradaPilha;
	}
	
	public boolean isEmpty() {
//		if(refNoEntradaPilha == null) {
//			return true;
//		}
//		return false;
//	}
		return refNoEntradaPilha == null ? true : false;
	}
	
	@Override
	public String toString() {
		String stringReturn = "-------------\n";
		stringReturn += "    Pilha\n";
		stringReturn += "-------------\n";
		No noAuxiliar = refNoEntradaPilha;
		while(true) {
			if(noAuxiliar != null) {
				stringReturn += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
				noAuxiliar = noAuxiliar.getRefNo();
			}else {
				break;
			}
		}
		stringReturn += "=============\n";
		return stringReturn;
	}
}
