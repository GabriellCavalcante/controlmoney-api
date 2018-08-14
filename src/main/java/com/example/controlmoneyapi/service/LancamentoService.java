package com.example.controlmoneyapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.controlmoneyapi.model.Lancamento;
import com.example.controlmoneyapi.model.Pessoa;
import com.example.controlmoneyapi.repository.LancamentoRepository;
import com.example.controlmoneyapi.repository.PessoaRepository;
import com.example.controlmoneyapi.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {
	
	@Autowired
	private PessoaRepository pr;
	
	@Autowired
	private LancamentoRepository lr;
	
	

	public Lancamento salvar(Lancamento lancamento) {
		try{
			Pessoa pessoa = pr.getOne(lancamento.getPessoa().getCodigo());
			if (pessoa == null || pessoa.isInativo()) {
				throw new PessoaInexistenteOuInativaException();
			}
		}catch (Exception e) {
			throw new PessoaInexistenteOuInativaException();
		}
		
		return lr.save(lancamento);
		
	}
}
