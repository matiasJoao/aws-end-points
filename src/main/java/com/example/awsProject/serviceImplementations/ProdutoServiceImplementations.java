package com.example.awsProject.serviceImplementations;

import com.example.awsProject.DTO.ProdutoDTO;
import com.example.awsProject.adapter.ProdutoAdapter;
import com.example.awsProject.domain.Produto;
import com.example.awsProject.service.ProdutoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImplementations implements ProdutoService {
    private final ProdutoAdapter produtoAdapter;

    public ProdutoServiceImplementations(ProdutoAdapter produtoAdapter) {
        this.produtoAdapter = produtoAdapter;
    }

    @Override
    public ProdutoDTO save(ProdutoDTO produto) {
        Produto buildProduct = Produto.builder()
                .name(produto.getName())
                .price(produto.getPrice())
                .code(produto.getCode())
                .build();
       Produto res = produtoAdapter.save(buildProduct);
       return ProdutoDTO.builder()
               .price(res.getPrice())
               .name(res.getName())
               .code(res.getCode())
               .build();
    }
    @Override
    public List<Produto> getAll() {
        return produtoAdapter.getAll();
    }
}
