package com.procedure.procedureConnection.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
//@NamedStoredProcedureQuery(name = "Aluno.adicionaNovoAluno",
//                           procedureName = "sp_adicionaNovoAluno", parameters = {
//        @StoredProcedureParameter(mode = ParameterMode.IN, name = "@NOME", type = String.class),
//        @StoredProcedureParameter(mode = ParameterMode.IN, name = "@MATRICULA", type = Integer.class),
////        @StoredProcedureParameter(mode = ParameterMode.OUT, name = "count_out", type = Integer.class)
//})
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Integer id;
    private String nome;
    private Integer matricula;

    public Aluno() {
    }

    public Aluno(Integer id, String nome, Integer matricula) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
