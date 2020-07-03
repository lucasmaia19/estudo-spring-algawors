package com.example.algamoney.api;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.algamoney.api.model.Pessoa;
import com.example.algamoney.api.repository.PessoaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PrimeiroTeste {
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	@Test
	public void primeiroTeste() throws Exception {
		String esperado = "lucas";
		String recebido = "lucas";
		
		assertEquals(esperado, recebido);
		
	}
	
	@Test
	public void deveListarTodasPessoas() throws Exception {
//		PessoaRepository pessoaRepository = new PessoaRepository();
//		PessoaRepository pessoaRepository = null;
		List<Pessoa> pessoaList = pessoaRepository.findAll();
		
		assertEquals(3, pessoaList.size());
		
	}
}
