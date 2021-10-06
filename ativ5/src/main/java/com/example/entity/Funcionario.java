//Entidade Funcionario

package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.springframework.data.jpa.domain.AbstractPersistable;
import lombok.Data;

@Entity
@Data
public class Funcionario extends AbstractPersistable<Long>{

	private String nomeFuncionario;
	private Integer qtdeDependentes;
	private Double salario;
	private String cargo;
	@ManyToOne
	private Departamento departamento;
}
