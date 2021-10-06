package com.example.entity;

import javax.persistence.Entity;
import org.springframework.data.jpa.domain.AbstractPersistable;
import lombok.Data;

@Entity
@Data
public class Departamento extends AbstractPersistable<Long>{

	private String nomeDepartamento;
}
