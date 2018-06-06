package backtrack;

import java.util.ArrayList;

public class Tabuleiros {
	
	public ArrayList<Tabuleiro> tabuleiros = new ArrayList<Tabuleiro>();
	
	public boolean add(Tabuleiro tab) {
		for (Tabuleiro tabuleiro : tabuleiros) {
			if(tabuleiro.compara(tab))
				return false;
		}
		
		tabuleiros.add(tab);
		return true;
	}

}
