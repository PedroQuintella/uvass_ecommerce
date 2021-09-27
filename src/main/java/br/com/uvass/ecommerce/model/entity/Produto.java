package br.com.uvass.ecommerce.model.entity;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Produto {
    private Integer id;
    private String nome;
    private String descricao;
    private String fotoUrl;
    private LocalDate dataCadastro;
    private Timestamp dataUltimaAtualizacao;
    private Float valorUnitario;
    private Administrador administrador;
    private List<Categoria> listaCategorias;
    private List<PromocaoItem> listaPromocaoItem;


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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
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

    public Float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public List<Categoria> getListaCategorias() {
        return listaCategorias;
    }

    public void setListaCategorias(List<Categoria> listaCategorias) {
        this.listaCategorias = listaCategorias;
    }

    public List<PromocaoItem> getListaPromocaoItem() {
        return listaPromocaoItem;
    }

    public void setListaPromocaoItem(List<PromocaoItem> listaPromocaoItem) {
        this.listaPromocaoItem = listaPromocaoItem;
    }
}
