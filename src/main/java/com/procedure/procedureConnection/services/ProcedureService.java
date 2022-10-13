package com.procedure.procedureConnection.services;

import com.procedure.procedureConnection.models.Aluno;
import com.procedure.procedureConnection.repositories.ProcedureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ProcedureService {
    @Autowired
    ProcedureRepository procedureRepository;
    @Transactional
    public Aluno save(Aluno aluno){ return procedureRepository.save(aluno); }
    public List<Aluno> findAll(){ return procedureRepository.findAll(); }
    public Optional<Aluno> findById(Long id){
        return procedureRepository.findById(id);
    }
    @Transactional
    public void deleteById(Aluno aluno) {
        procedureRepository.delete(aluno);
    }
    public boolean existsByMatricula(Integer matricula){
        return procedureRepository.existsByMatricula(matricula);
    }
}
