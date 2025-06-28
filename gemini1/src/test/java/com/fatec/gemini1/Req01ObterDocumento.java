package com.fatec.gemini1;

import org.junit.jupiter.api.Test;

import com.fatec.gemini1.service.Treinamento;

class Req01ObterDocumento {
	Treinamento treinamento = new Treinamento();

	@Test
	void test() {
		treinamento.obterDados();
	}

}
