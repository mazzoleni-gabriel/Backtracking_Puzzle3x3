package backtrack;

public class Backtrack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tabuleiro tabuleiro =  new Tabuleiro();
		Tabuleiro tabuleiro2 =  new Tabuleiro();

		Tabuleiros tabuleiros = new Tabuleiros();
		
		System.out.println(tabuleiros.add(tabuleiro));
		tabuleiro2.geraTab();
		System.out.println(tabuleiros.add(tabuleiro2));

	
	}

}
