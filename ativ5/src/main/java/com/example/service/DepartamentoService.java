// Service Departamento

package com.example.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entity.Departamento;
import com.example.repository.DepartamentoRepository;

@Service
public class DepartamentoService {
	@Autowired
	private DepartamentoRepository departamentoRepository;

	public void salvar(Departamento departamento) {
		departamentoRepository.save(departamento);
	}

	public Optional<Departamento> buscarPorId(Long idDepartamento){
		return departamentoRepository.findById(idDepartamento);
	}

	public List<Departamento> buscarTodos(){
		return departamentoRepository.findAll();
	}

	public List<Departamento> buscarPorNome(String nomeDepartamento){
		return departamentoRepository.findByNomeDepartamento(nomeDepartamento);
	}
}