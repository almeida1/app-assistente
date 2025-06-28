package com.fatec.gemini1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.fatec.gemini1.service.Treinamento;
@SpringBootTest
class Req01ObterDocumento {
	Treinamento treinamento = new Treinamento();

	@Test
	void test() {
		treinamento.obterDados();
	}

}
