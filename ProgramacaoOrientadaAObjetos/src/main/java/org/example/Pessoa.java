package org.example;

import java.time.LocalDate;

public class Pessoa {

    public int pes_id;
    public String pes_nome;
    public LocalDate pes_data_nascimento;
    private String pes_sexo;
    private String pes_mae;
    private String pes_pai;
    public String enderecocompleto;
    private String email;
    private String telefone;
    public String foto;
    private String cpf;
    private LocalDate dataCadastro;

    public Pessoa(int pes_id, String pes_nome, LocalDate pes_data_nascimento, String pes_sexo, String pes_mae, String pes_pai, String enderecocompleto, String email, String telefone, String foto, String cpf, LocalDate dataCadastro) {
        this.setId(pes_id);
        this.setNome(pes_nome);
        this.setDataNascimento(pes_data_nascimento);
        this.setSexo(pes_sexo);
        this.setMae(pes_mae);
        this.setPai(pes_pai);
        this.setEnderecoCompleto(enderecocompleto);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setFoto(foto);
        this.setCpf(cpf);
        this.setDataCadastro(dataCadastro);
    }

    public int getPes_id() {
        return pes_id;
    }

    public void setId(int pes_id) {
        this.pes_id = pes_id;
    }

    public String getNome() {
        return pes_nome;
    }

    public void setNome(String pes_nome) {
        this.pes_nome = pes_nome;
    }

    public LocalDate getDataNascimento() {
        return pes_data_nascimento;
    }

    public void setDataNascimento(LocalDate pes_data_nascimento) {
        this.pes_data_nascimento = pes_data_nascimento;
    }

    public String getSexo() {
        return pes_sexo;
    }

    public void setSexo(String pes_sexo) {
        this.pes_sexo = pes_sexo;
    }

    public String getMae() {
        return pes_mae;
    }

    public void setMae(String pes_mae) {
        this.pes_mae = pes_mae;
    }

    public String getPai() {
        return pes_pai;
    }

    public void setPai(String pes_pai) {
        this.pes_pai = pes_pai;
    }

    public String getEnderecoCompleto() {
        return enderecocompleto;
    }

    public void setEnderecoCompleto(String enderecocompleto) {
        this.enderecocompleto = enderecocompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + pes_id +
                ", nome='" + pes_nome + '\'' +
                ", data_nascimento=" + pes_data_nascimento +
                ", sexo='" + pes_sexo + '\'' +
                ", mae='" + pes_mae + '\'' +
                ", pai='" + pes_pai + '\'' +
                ", endereco_completo='" + enderecocompleto + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", foto='" + foto + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataCadastro=" + dataCadastro +
                '}';
    }
}
