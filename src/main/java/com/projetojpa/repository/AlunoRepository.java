package com.projetojpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojpa.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	List<Aluno> findByRenda(Double renda);
	List<Aluno> findByRa(String ra);
	List<Aluno> findByCidadeAndRenda(String cidade, Double renda);
}