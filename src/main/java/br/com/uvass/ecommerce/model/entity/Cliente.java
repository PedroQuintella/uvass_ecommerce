package br.com.uvass.ecommerce.model.entity;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

public class Cliente extends Usuario {
    private String fotoUrl;
    private Date dataNascimento;
    private String cpf;
    private Endereco endereco;

    @Override
    public String getFotoUrl() {
        return fotoUrl;
    }

    @Override
    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public static class Endereco {
        private Integer id;
        private String rua;
        private Integer numero;
        private String cep;
        private String complemento;
        private Integer telefone;
        private String bairro;
        private LocalDate dataCadastro;
        private Timestamp dataUltimaAtualizacao;
        private Cidade cidade;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public Integer getNumero() {
            return numero;
        }

        public void setNumero(Integer numero) {
            this.numero = numero;
        }

        public String getCep() {
            return cep;
        }

        public void setCep(String cep) {
            this.cep = cep;
        }

        public String getComplemento() {
            return complemento;
        }

        public void setComplemento(String complemento) {
            this.complemento = complemento;
        }

        public Integer getTelefone() {
            return telefone;
        }

        public void setTelefone(Integer telefone) {
            this.telefone = telefone;
        }

        public String getBairro() {
            return bairro;
        }

        public void setBairro(String bairro) {
            this.bairro = bairro;
        }

        public LocalDate getDataCadastro() {
            return dataCadastro;
        }

        public void setDataCadastro(LocalDate dataCadastro) {
            this.dataCadastro = dataCadastro;
        }

        public Timestamp getDataUltimaAtualizacao() {
            Date date = new Date();
            Timestamp timestamp = new Timestamp(date.getTime());
            return timestamp;
        }

        public void setDataUltimaAtualizacao(Timestamp dataUltimaAtualizacao) {
            this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        }

        public Cidade getCidade() {
            return cidade;
        }

        public void setCidade(Cidade cidade) {
            this.cidade = cidade;
        }
    }
}
