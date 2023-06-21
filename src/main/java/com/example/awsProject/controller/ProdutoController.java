package com.example.awsProject.controller;

import com.example.awsProject.DTO.ProdutoDTO;
import com.example.awsProject.domain.Produto;
import com.example.awsProject.service.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Produto")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }
    @PostMapping("/post")
    public ResponseEntity<ProdutoDTO> save(ProdutoDTO produtoDTO){
        ProdutoDTO res = produtoService.save(produtoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(res);
    }

    @GetMapping("/get")
    public ResponseEntity<List<Produto>> getAll(){
        List<Produto> res = produtoService.getAll();
       return ResponseEntity.status(HttpStatus.OK).body(res);
    }
}
