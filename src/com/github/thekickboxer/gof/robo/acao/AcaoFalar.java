package com.github.thekickboxer.gof.robo.acao;

public class AcaoFalar implements Acao {

	public AcaoFalar() {
	}

	@Override
	public void executar() {
		System.out.println("Falando...");
	}

}
