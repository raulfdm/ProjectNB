/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lab4.src.model;

/**
 *
 * @author Raul
 */
public class CadastroModel {
    long id;
    String nomeCompleto;
    String funcao;
    String dataContratacao;
    double salario;

    public CadastroModel() {
    }

    public CadastroModel(long id, String nomeCompleto, String funcao, String dataContratacao, double salario) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.funcao = funcao;
        this.dataContratacao = dataContratacao;
        this.salario = salario;
    }
    
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "ID: "+this.id
                +"\nNome: "+this.nomeCompleto
                +"\nFunção: "+this.funcao
                +"\nData de Contratação: "+this.dataContratacao
                +"\nSalário: "+this.salario; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
