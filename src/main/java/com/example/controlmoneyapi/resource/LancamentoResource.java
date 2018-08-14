package com.example.controlmoneyapi.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.controlmoneyapi.model.Lancamento;
import com.example.controlmoneyapi.repository.LancamentoRepository;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoResource {

	@Autowired
	private LancamentoRepository lr;

	@GetMapping
	public List<Lancamento> listar() {
		return lr.findAll();
	}

	@GetMapping("/{codigo}")
	public ResponseEntity<Optional<Lancamento>> buscarPeloCodigo(@PathVariable Long codigo) {
		Optional<Lancamento> lancamento = lr.findById(codigo);
		if (lancamento.isPresent()) {
			return ResponseEntity.ok(lancamento);

		} else {
			return ResponseEntity.notFound().build();

		}
	}

}
