package com.agyl.ecommerce.strore.https.controller;

import com.agyl.ecommerce.strore.https.model.Produto;
import com.agyl.ecommerce.strore.https.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @CrossOrigin("*")
    @GetMapping("/produto")
    public ResponseEntity<Iterable<Produto>> getProduto() {
        return ResponseEntity.ok().body(produtoService.getProduto());
    }

    @CrossOrigin("*")
    @GetMapping("/produto/{idCliente}")
    public ResponseEntity<Produto> getProdutoById(@PathVariable("idCliente") Long idCliente) {
        return ResponseEntity.ok().body(produtoService.getProdutoById(idCliente));
    }

    @CrossOrigin("*")
    @PostMapping("/produto")
    public ResponseEntity<Void> adicionarProduto(@RequestBody Produto produto) {
        produtoService.criarProduto(produto);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @CrossOrigin("*")
    @PutMapping("/produto")
    public ResponseEntity<Void> updateInfoProduto(@RequestBody Produto produto) {
        produtoService.updateInfoProduto(produto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @CrossOrigin("*")
    @DeleteMapping("/produto/{idCliente}")
    public ResponseEntity<Void> deletarProdutoById(@PathVariable("idCliente") Long idCliente) {
        var produto = produtoService.getProdutoById(idCliente);
        produtoService.deleteProduto(produto);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
