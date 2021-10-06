
//Repositorio Funcionario

package com.example.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
	List<Funcionario>findByNomeFuncionario(String nomeFuncionario);
	List<Funcionario> findByQtdeDependentes(Integer qtdeDependentes);
	
}
