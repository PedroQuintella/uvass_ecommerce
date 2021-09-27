package br.com.uvass.ecommerce.model.entity;


import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

public class PromocaoItem {
    private Integer id;
    private Float valorPromocao;
    private LocalDate dataCadastro;
    private Timestamp dataUltimaAtualizacao;
    private Integer id_tabelaPromocao;
    private Integer id_produto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getValorPromocao() {
        return valorPromocao;
    }

    public void setValorPromocao(Float valorPromocao) {
        this.valorPromocao = valorPromocao;
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

    public Integer getId_tabelaPromocao() {
        return id_tabelaPromocao;
    }

    public void setId_tabelaPromocao(Integer id_tabelaPromocao) {
        this.id_tabelaPromocao = id_tabelaPromocao;
    }

    public Integer getId_produto() {
        return id_produto;
    }

    public void setId_produto(Integer id_produto) {
        this.id_produto = id_produto;
    }
}