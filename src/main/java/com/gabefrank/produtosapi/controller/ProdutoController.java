package com.gabefrank.produtosapi.controller;

import com.gabefrank.produtosapi.model.Produto;
import com.gabefrank.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {
    private final ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @GetMapping
    public List<Produto> retornarTodos(){
        return produtoRepository.findAll();
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        System.out.println("Produto recebido: " + produto);

        var id = UUID.randomUUID().toString();
        produto.setId(id);

        produtoRepository.save(produto);

        return produto;
    }

    @GetMapping("/{id}")
    public Produto obterPorId(@PathVariable("id") String id){
        //Optional<Produto> produto = produtoRepository.findById(id);

        return produtoRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public String deletarProduto(@PathVariable("id") String id){
        Produto produto = produtoRepository.findById(id).orElse(null);

        if(produto != null){
            produtoRepository.delete(produto);

            return "Produto removido!";
        }

        return "Produto não encontrado!";
    }
}
