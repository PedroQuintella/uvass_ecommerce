package br.com.uvass.ecommerce.controller;

import br.com.uvass.ecommerce.model.entity.Produto;
import br.com.uvass.ecommerce.model.repository.ProdutoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/produto")
public class ProdutoController {
    private ProdutoRepository produtoRepository;

    public ProdutoController(JdbcTemplate jdbcTemplate) {
        produtoRepository = new ProdutoRepository(jdbcTemplate);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Produto inserir(@RequestBody Produto produto) throws Exception {
        return produtoRepository.inserir(produto);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public List<Produto> buscar(@PathVariable Integer id) throws Exception {
        return produtoRepository.buscar(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    public List<Produto> buscarPorNomeValor(@RequestParam(required = false) String nome, Float valorMinimo, Float valorMaximo) {
        return produtoRepository.buscarPorNomeValor(nome, valorMinimo, valorMaximo);
    }
}
