package br.com.uvass.ecommerce.model.repository;

import br.com.uvass.ecommerce.model.entity.Categoria;
import br.com.uvass.ecommerce.model.entity.Produto;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;

public class CategoriaRepository {
    private JdbcTemplate jdbcTemplate;

    public CategoriaRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Categoria> buscar(Integer id) throws Exception {
        String sql = "SELECT * FROM categoria WHERE id = ?";
        List<Categoria> search = (List<Categoria>) jdbcTemplate.query(sql, new CategoriaMapper(), id);
        if (search.size() > 0) {
            return (List<Categoria>) jdbcTemplate.query(sql, new Object[]{id}, new CategoriaMapper());
        }
        throw new Exception("Categoria não cadastrada");
    }

    public List<Produto> buscarProdutoPorNomeValor(Integer id, String nome, Float valorMinimo, Float valorMaximo) {
        if (nome != null && valorMinimo == null && valorMaximo == null) {
            return jdbcTemplate.query("select p.* FROM produto p INNER JOIN categoriaProduto cp ON cp.id_produto = p.id WHERE cp.id_categoria = ? AND p.nome = ?",
                    new ProdutoMapper(), id, nome);
        }
        if (nome == null && valorMinimo != null && valorMaximo != null) {
            return jdbcTemplate.query(
                    "select p.* FROM produto p INNER JOIN categoriaProduto cp ON cp.id_produto = p.id WHERE cp.id_categoria = ? AND p.valorUnitario >= ? AND p.valorUnitario <= ?",
                    new ProdutoMapper(), id, valorMinimo, valorMaximo);
        }
        if (nome != null && valorMinimo != null && valorMaximo != null) {
            return jdbcTemplate.query(
                    "select p.*, cp.id_categoria FROM produto p INNER JOIN categoriaProduto cp ON cp.id_produto = p.id WHERE cp.id_categoria = ? AND p.nome = ? AND p.valorUnitario >= ? AND p.valorUnitario <= ?",
                    new ProdutoMapper(), id, nome, valorMinimo, valorMaximo);
        }
        return null;
    }
}