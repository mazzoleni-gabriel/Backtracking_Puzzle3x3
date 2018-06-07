package backtrack;

public class Backtrack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tabuleiro tabuleiro =  new Tabuleiro();
//		Tabuleiros tabs = new Tabuleiros();

		tabuleiro.geraTab();
//		tabuleiro.printaTab();
//		new Arvore2(tabuleiro, 0).backtrackInit();
		
		int tab[][] = new int[3][3];
		int cont=0;
		
		for(int i=0; i<3; i++) {
    		for(int j=0;j<3;j++) {
    			tab[i][j] = cont;
    			cont++;
    		}
    	}
//		tabuleiro.setTab(tab);
//		tabuleiro.coluna0 = 0;
//		tabuleiro.linha0 = 0;
//		tabuleiro.down();
//		tabuleiro.right();
//		tabuleiro.right();
//		tabuleiro.down();
		tabuleiro.printaTab();

		System.out.println("\nbacktracking...\n");
		new Arvore2(tabuleiro, 0).backtrackInit();
		
		
//		System.out.println("tab salvos:");
//		tabs.printatodos();
		

	
	}

}
