package com.surveysystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.surveysystem.entity.Associado;

@Repository
public interface AssociadoRepository extends JpaRepository<Associado, String>{

	Associado findByCpf(String cpf);
	Optional<Associado> findById(Long id);
	
}
