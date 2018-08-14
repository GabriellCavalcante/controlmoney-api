package com.example.controlmoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.controlmoneyapi.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
