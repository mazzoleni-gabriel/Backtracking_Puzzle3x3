package backtrack;

import java.util.ArrayList;

public class Tabuleiros {
	
	public static ArrayList<Tabuleiro> tabuleiros = new ArrayList<Tabuleiro>();
	
	public boolean add(Tabuleiro tab) {
		for (Tabuleiro tabuleiro : tabuleiros) {
			if(tabuleiro.compara(tab))
				return false;
		}
		Tabuleiro tab2 = new Tabuleiro();
		tab2.setTab(tab.tab);
		tabuleiros.add(tab2);
		return true;
	}
	
	public void printatodos() {
		for (Tabuleiro tabuleiro : tabuleiros) {
			tabuleiro.printaTab();
			System.out.println();
		}
	}

}
