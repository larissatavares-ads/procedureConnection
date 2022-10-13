package com.procedure.procedureConnection.models;

import javax.persistence.*;

@Entity
//@NamedStoredProcedureQuery(name = "Aluno.adicionaNovoAluno",
//                           procedureName = "sp_adicionaNovoAluno", parameters = {
//        @StoredProcedureParameter(mode = ParameterMode.IN, name = "model_in", type = String.class),
//        @StoredProcedureParameter(mode = ParameterMode.OUT, name = "count_out", type = Integer.class)
//})
public class Aluno {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer matricula;

    public Aluno() {
    }

    public Aluno(Long id, String nome, Integer matricula) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
}
