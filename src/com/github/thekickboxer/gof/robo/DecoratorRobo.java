package com.github.thekickboxer.gof.robo;

import com.github.thekickboxer.gof.robo.acao.Acao;
import com.github.thekickboxer.gof.robo.acao.AcaoAndar;
import com.github.thekickboxer.gof.robo.acao.AcaoComer;
import com.github.thekickboxer.gof.robo.acao.AcaoFalar;

public class DecoratorRobo {
	
	protected Robo robo;

	public DecoratorRobo(Robo robo) {
		this.robo = robo;
	}
		
	public void andar() {
		Acao andar = new AcaoAndar();
		robo.executar(andar);
	}
	
	public void falar() {
		Acao falar = new AcaoFalar();
		robo.executar(falar);
	}
	
	public void comer() {
		Acao comer = new AcaoComer();		
		robo.executar(comer);
	}

}
