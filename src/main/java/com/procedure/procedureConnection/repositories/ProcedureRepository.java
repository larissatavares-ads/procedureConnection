package com.procedure.procedureConnection.repositories;

import com.procedure.procedureConnection.models.Aluno;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProcedureRepository extends CrudRepository<Aluno, Long> {
    Aluno save(Aluno aluno);
    List<Aluno> findAll();
    Optional<Aluno> findById(Long id);
    void delete(Aluno aluno);
    boolean existsByMatricula(Integer matricula);

    @Procedure("sp_adicionaNovoAluno")
    void adicionaNovoAluno();
}
