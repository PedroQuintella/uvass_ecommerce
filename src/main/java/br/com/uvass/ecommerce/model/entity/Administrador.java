package br.com.uvass.ecommerce.model.entity;

import java.util.List;

public class Administrador extends Usuario {
    private List<Categoria> listaCategoria;

    public List<Categoria> listaCategoria() {
        return listaCategoria;
    }

    public void setlistaCategoria(List<Categoria> listaCategoria) {
        this.listaCategoria = listaCategoria;
    }
}