package com.github.thekickboxer.gof;

import com.github.thekickboxer.gof.robo.DecoratorRobo;
import com.github.thekickboxer.gof.robo.Robo;
import com.github.thekickboxer.gof.robo.acao.Acao;
import com.github.thekickboxer.gof.robo.acao.AcaoAndar;
import com.github.thekickboxer.gof.robo.acao.AcaoComer;
import com.github.thekickboxer.gof.robo.acao.AcaoFalar;

public class Gof {

	public Gof() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		// Singleton
		Robo robo = Robo.getInstancia();
		
		// Strategy
		Acao andar = new AcaoAndar();
		Acao falar = new AcaoFalar();
		Acao comer = new AcaoComer();
		
		robo.executar(falar);
		robo.executar(comer);
		robo.executar(andar);
		
		// Decorator
		DecoratorRobo robo2 = new DecoratorRobo(robo);
		
		robo2.andar();
		robo2.falar();
		robo2.comer();		

	}

}
