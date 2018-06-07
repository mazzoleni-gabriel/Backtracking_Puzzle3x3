package backtrack;

import java.util.ArrayList;

public class Arvore {

	public Tabuleiro dado;
	public ArrayList<Arvore> proximos = new ArrayList<Arvore>();
	public int nivel;
	public static boolean resolvido = false;
	
	public Arvore(Tabuleiro dado, int nivel) {
		this.dado = dado;
		this.nivel = nivel;
	}
	
	public void backtrack() {
		
//		this.dado.printaTab();
		
		if(dado.estaOrdenado()) {
			System.out.println("ordenado");
			return;
		}
		
		if(this.up())
			return;
		if(this.down())
			return;
		if(this.left())
			return;
		if(this.right())
			return;
		
		
		
//		this.up();
//		this.down();
//		this.left();
//		this.right();
		System.out.println(proximos.size()+" ");
		for (int i=0; i<proximos.size(); i++) {
			proximos.get(i).backtrack();
		}
		
	
	
	}
	

	public boolean up() {
		Tabuleiro tab = new Tabuleiro();
		Tabuleiros tabs = new Tabuleiros();
		
		tab.setTab(dado.tab);
		tab.coluna0 = dado.coluna0;
		tab.linha0 = dado.linha0;
		
		
		
		if(tab.up()) {
			if(tabs.add(tab)) {
				Arvore arv = new Arvore(tab, this.nivel+1);
				proximos.add(arv);
				if(tab.estaOrdenado()) {
					System.out.println("Finalizado em "+this.nivel+1+" passos");
					return true;
				}
			}
		}
		return false;
		
	}
	
	public boolean down() {
		Tabuleiro tab = new Tabuleiro();
		Tabuleiros tabs = new Tabuleiros();
		
		tab.setTab(dado.tab);
		tab.coluna0 = dado.coluna0;
		tab.linha0 = dado.linha0;
		
		if(tab.down()) {
			if(tabs.add(tab)) {
				Arvore arv = new Arvore(tab, this.nivel+1);
				proximos.add(arv);
				if(tab.estaOrdenado()) {
					System.out.println("Finalizado em "+this.nivel+1+" passos");
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean right() {
		Tabuleiro tab = new Tabuleiro();
		Tabuleiros tabs = new Tabuleiros();
		
		tab.setTab(dado.tab);
		tab.coluna0 = dado.coluna0;
		tab.linha0 = dado.linha0;
		
		if(tab.right()) {
			if(tabs.add(tab)) {
				Arvore arv = new Arvore(tab, this.nivel+1);
				proximos.add(arv);
				if(tab.estaOrdenado()) {
					System.out.println("Finalizado em "+this.nivel+1+" passos");
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean left() {
		Tabuleiro tab = new Tabuleiro();
		Tabuleiros tabs = new Tabuleiros();
		
		tab.setTab(dado.tab);
		tab.coluna0 = dado.coluna0;
		tab.linha0 = dado.linha0;
		
		if(tab.left()) {
			if(tabs.add(tab)) {
				Arvore arv = new Arvore(tab, this.nivel+1);
				proximos.add(arv);
				if(tab.estaOrdenado()) {
					System.out.println("Finalizado em "+this.nivel+1+" passos");
					return true;
				}
			}
		}
		return false;
	}
	
}
