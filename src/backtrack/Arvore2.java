package backtrack;

public class Arvore2 {

	public Tabuleiro dado;
	public Arvore2  proxUp, proxDown, proxRight, proxLeft;
	public int nivel;
	public static boolean resolvido = false;
	public static int ultimoNivel=0;
	
	public Arvore2(Tabuleiro dado, int nivel) {
		this.dado = dado;
		this.nivel = nivel;
	}
	
	public int backtrackInit() {
		int r;
		while((r = this.backtrack())  == -1) {
			System.out.printf("%d.. ",ultimoNivel+1);
			ultimoNivel++;
		}
		return r;
	}
	
	public int backtrack() {
		int r;
		if((r = up()) != -1)
			return r; 
		if((r = down()) != -1)
			return r; 
		if((r = left()) != -1)
			return r; 
		if((r = right()) != -1)
			return r; 
		
//		System.out.printf("nivel: %d UltNivel: %d\n",nivel, ultimoNivel);
		if(nivel <= ultimoNivel) {
			if(proxUp != null)
				if((r = proxUp.backtrack()) != -1)
					return r;
			if(proxDown != null)
				if((r = proxDown.backtrack()) != -1)
					return r;
			if(proxLeft != null)
				if((r = proxLeft.backtrack()) != -1)
					return r;
			if(proxRight != null)
				if((r = proxRight.backtrack()) != -1)
					return r;
		}
		
		return -1;
	}
	
	
	
	public int up() {
		Tabuleiro aux = new Tabuleiro();
		aux.setTab(dado.tab);
		aux.coluna0 = dado.coluna0;
		aux.linha0 = dado.linha0;
		
		if(aux.up()) {
			if(new Tabuleiros().add(aux)) {
				this.proxUp = new Arvore2(aux, this.nivel+1);
				if(aux.estaOrdenado()) {
					System.out.printf("Ordenado em %d passos", this.nivel+1);
					proxUp.dado.printaTab();
					return this.nivel+1;
				}
			}
			
		}
		return -1;
		
	}
	
	public int down() {
		Tabuleiro aux = new Tabuleiro();
		aux.setTab(dado.tab);
		aux.coluna0 = dado.coluna0;
		aux.linha0 = dado.linha0;
		
		if(aux.down()) {
			if(new Tabuleiros().add(aux)) {
				this.proxDown = new Arvore2(aux, this.nivel+1);
				if(aux.estaOrdenado()) {
					System.out.printf("Ordenado em %d passos", this.nivel+1);
					proxDown.dado.printaTab();
					return this.nivel+1;
				}
			}
			
		}
		return -1;
		
	}
	
	public int right() {
		Tabuleiro aux = new Tabuleiro();
		aux.setTab(dado.tab);
		aux.coluna0 = dado.coluna0;
		aux.linha0 = dado.linha0;
		
		if(aux.right()) {
			if(new Tabuleiros().add(aux)) {
				this.proxRight = new Arvore2(aux, this.nivel+1);
				if(aux.estaOrdenado()) {
					System.out.printf("Ordenado em %d passos", this.nivel+1);
					proxRight.dado.printaTab();
					return this.nivel+1;
				}
			}
			
		}
		return -1;
		
	}
	
	public int left() {
		Tabuleiro aux = new Tabuleiro();
		aux.setTab(dado.tab);
		aux.coluna0 = dado.coluna0;
		aux.linha0 = dado.linha0;
		
		if(aux.left()) {
			if(new Tabuleiros().add(aux)) {
				this.proxLeft = new Arvore2(aux, this.nivel+1);
				if(aux.estaOrdenado()) {
					System.out.printf("Ordenado em %d passos", this.nivel+1);
					proxLeft.dado.printaTab();
					return this.nivel+1;
				}
			}
			
		}
		return -1;
		
	}
	
	public void print() {
		System.out.println("Dado:");
		dado.printaTab();
		
		System.out.println("Up:");
		if(proxUp != null) {
			proxUp.dado.printaTab();
		}else {
			System.out.println("null");
		}
		
		System.out.println("Down:");
		if(proxDown != null) {
			proxDown.dado.printaTab();
		}else {
			System.out.println("null");
		}
		
		System.out.println("Left:");
		if(proxLeft != null) {
			proxLeft.dado.printaTab();
		}else {
			System.out.println("null");
		}
		
		System.out.println("Right:");
		if(proxRight != null) {
			proxRight.dado.printaTab();
		}else {
			System.out.println("null");
		}
	}
	
}


