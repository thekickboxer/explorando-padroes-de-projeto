package com.github.thekickboxer.gof.robo;

import com.github.thekickboxer.gof.robo.acao.Acao;

public class Robo {

	private static Robo instancia;
	
	private Robo() {
		super();
	}
	
	public static Robo getInstancia() {
		
		if(instancia == null) {
			instancia = new Robo();
		}
		
		return instancia;
		
	}
	
	public void executar(Acao acao) {
		acao.executar();
	}

}
