package com.procedure.procedureConnection.controllers;

import com.procedure.procedureConnection.dtos.AlunoDto;
import com.procedure.procedureConnection.models.Aluno;
import com.procedure.procedureConnection.services.ProcedureService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/procedure")
public class ProcedureController {
    @Autowired
    private ProcedureService procedureService;

//    @PostMapping
//    public ResponseEntity<Object> save(@RequestBody @Valid AlunoDto alunoDto){
//        if(procedureService.existsByMatricula(alunoDto.getMatricula())){
//            return ResponseEntity.status(HttpStatus.CONFLICT).body("CONFLITO: Já existe um aluno salvo com essa matrícula!");
//        }
//        var aluno = new Aluno();
//        BeanUtils.copyProperties(alunoDto, aluno);
//        return ResponseEntity.status(HttpStatus.CREATED).body(procedureService.save(aluno));
//    }
    @PostMapping
    public ResponseEntity<Object> adicionaNovoAluno(){
        procedureService.adicionaNovoAluno();
        return ResponseEntity.status(HttpStatus.CREATED).body("Ok");
    }
    @GetMapping
    public ResponseEntity<List<Aluno>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(procedureService.findAll());
    }
//    @GetMapping("/{id}")
//    public ResponseEntity<Object> findById(@PathVariable(value="id") Long id){
//        Optional<Aluno> alunoOptional = procedureService.findById(id);
//        if(!alunoOptional.isPresent()){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Aluno não encontrado.");
//        }
//        return ResponseEntity.status(HttpStatus.OK).body(alunoOptional.get());
//    }
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Object> deleteById(@PathVariable(value = "id") Long id){
//        Optional<Aluno> alunoOptional = procedureService.findById(id);
//        if(!alunoOptional.isPresent()){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Aluno não encontrado.");
//        }
//        procedureService.deleteById(alunoOptional.get());
//        return ResponseEntity.status(HttpStatus.OK).body("Aluno deletado com sucesso.");
//    }
//    @PutMapping("/{id}")
//    public ResponseEntity<Object> updateById(@PathVariable(value = "id") Long id, @RequestBody @Valid AlunoDto alunoDto){
//        Optional<Aluno> alunoOptional = procedureService.findById(id);
//        if (!alunoOptional.isPresent()){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id não encontrado");
//        }
//        if(procedureService.existsByMatricula(alunoDto.getMatricula())){
//            return ResponseEntity.status(HttpStatus.CONFLICT).body("CONFLITO: Já existe um aluno salvo com essa matrícula!");
//        }
//        var aluno = new Aluno();
//        BeanUtils.copyProperties(alunoDto, aluno);
//        aluno.setId(alunoOptional.get().getId());
//        return ResponseEntity.status(HttpStatus.OK).body(procedureService.save(aluno));
//    }

}
