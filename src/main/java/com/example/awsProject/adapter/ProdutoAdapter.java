package com.example.awsProject.adapter;

import com.example.awsProject.domain.Produto;
import com.example.awsProject.repositorys.ProdutoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProdutoAdapter {

    private final ProdutoRepository produtoRepository;

    public ProdutoAdapter(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto save (Produto produto){
        return  produtoRepository.save(produto);
    }

    public List<Produto> getAll(){
       return produtoRepository.findAll();
    }
}
