package com.example.awsProject.service;

import com.example.awsProject.DTO.ProdutoDTO;
import com.example.awsProject.domain.Produto;
import org.springframework.stereotype.Component;

import java.util.List;


public interface ProdutoService {
    ProdutoDTO save(ProdutoDTO produto);

    List<Produto> getAll();
}
