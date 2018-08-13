package com.example.controlmoneyapi.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.controlmoneyapi.model.Pessoa;
import com.example.controlmoneyapi.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pr;

	public Pessoa atualizar(Long codigo, Pessoa pessoa) {
			try {
			Pessoa pessoaSalva = pr.getOne(codigo);
			BeanUtils.copyProperties(pessoa, pessoaSalva, "codigo");
			return pr.save(pessoaSalva);
			} catch (Exception e) {
				throw new EmptyResultDataAccessException(1);
			}
		}

	public void atualizarPropriedadeAtivo(Long codigo, Boolean ativo) {
		try {
			Pessoa pessoaSalva = pr.getOne(codigo);
			pessoaSalva.setAtivo(ativo);
			pr.save(pessoaSalva);
			} catch (Exception e) {
				throw new EmptyResultDataAccessException(1);
			}
		}

		
	}
	
