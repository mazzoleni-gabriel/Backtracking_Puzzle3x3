package backtrack;

import java.util.Random;

public class Tabuleiro {
	
	public int tab[][] = new int[3][3];
	public int linha0, coluna0;
	public int jogada;

	
	public Tabuleiro() {
		for(int i=0; i<3; i++) {
    		for(int j=0;j<3;j++)
    			tab[i][j] = -1;
    	}
		jogada = 0;
	}

	public void geraTab() {

    	for(int i=0; i<3; i++) {
    		for(int j=0;j<3;j++)
    			addAleatorio(i,j);
    	}

	}
	
	private void addAleatorio(int col, int lin) {
		Random gerador = new Random();
		int num=0;
		boolean repetido = true;
    	while(repetido) {
        	num = gerador.nextInt(9);
    		repetido = false;
    		for(int i=0; i<3; i++) {
    			for(int j=0; j<3; j++) {
    				if(num == tab[i][j]){
    					repetido = true;
    				}
    			}
    		}
    	}
    	tab[lin][col] = num;
    	if(num == 0) {
    		linha0 = lin;
    		coluna0 = col;
    	}
    		
	}
	
	public void printaTab() {
		for(int i=0; i<3; i++) {
    		for(int j=0;j<3;j++)
    			System.out.print(tab[i][j]);
    		System.out.println();
    	}
	}
	
	public boolean up() {
		if(linha0 == 0)
			return false;
		tab[linha0][coluna0] = tab[linha0-1][coluna0];
		tab[linha0-1][coluna0]= 0;
		
		return true;
	}
	
	public boolean down() {
		if(linha0 == 2)
			return false;
		tab[linha0][coluna0] = tab[linha0+1][coluna0];
		tab[linha0+1][coluna0]= 0;
		
		return true;
	}
	
	public boolean right() {
		if(coluna0 == 2)
			return false;
		tab[linha0][coluna0] = tab[linha0][coluna0+1];
		tab[linha0][coluna0+1] = 0;
		
		return true;
	}
	
	public boolean left() {
		if(coluna0 == 0)
			return false;
		tab[linha0][coluna0] = tab[linha0][coluna0-1];
		tab[linha0][coluna0-1] = 0;
		
		return true;
	}
	
	public boolean compara(Tabuleiro tabuleiro) {
		for(int i=0; i<3; i++) {
    		for(int j=0;j<3;j++)
    			if(tab[i][j] != tabuleiro.tab[i][j])
    				return false;
    	}
		
		return true;
	}
	
	public boolean estaOrdenado() {
		int cont=0;
		for(int i=0; i<3; i++) {
    		for(int j=0;j<3;j++)
    			if(tab[i][j] != cont)
    				return false;
    			cont++;
    	}
		
		return true;
	}
	
	

}
