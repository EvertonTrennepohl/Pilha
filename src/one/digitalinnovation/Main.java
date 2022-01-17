package one.digitalinnovation;

public class Main {

	public static void main(String[] args) {
		
		Pilha<Integer> myPilha = new Pilha<>();
		
		myPilha.push(1);
		myPilha.push(2);
		myPilha.push(3);
		myPilha.push(4);
		myPilha.push(5);
		myPilha.push(6);
		
		System.out.println(myPilha);
		System.out.println(myPilha.top());
		
		myPilha.pop();
		
		System.out.println(myPilha);
		
		System.out.println(myPilha.top());
		System.out.println(myPilha);
		
		
	}

}
