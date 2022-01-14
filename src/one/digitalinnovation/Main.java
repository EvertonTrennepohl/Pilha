package one.digitalinnovation;

public class Main {

	public static void main(String[] args) {
		
		Pilha myPilha = new Pilha();
		
		myPilha.push(new No(1));
		myPilha.push(new No(2));
		myPilha.push(new No(3));
		myPilha.push(new No(4));
		myPilha.push(new No(5));
		myPilha.push(new No(6));
		
		System.out.println(myPilha);
		System.out.println(myPilha.top());
		
		myPilha.pop();
		
		System.out.println(myPilha);
		
		System.out.println(myPilha.top());
		System.out.println(myPilha);
		
		
	}

}
