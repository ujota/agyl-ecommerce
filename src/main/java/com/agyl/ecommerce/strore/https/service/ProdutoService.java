package com.agyl.ecommerce.strore.https.service;

import com.agyl.ecommerce.strore.https.model.Produto;
import com.agyl.ecommerce.strore.https.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Iterable<Produto> getProduto(){
        return repository.findAll();
    }

    public Produto getProdutoById(Long idCliente){
        return repository.findById(idCliente).orElse(null);
    }

    public void criarProduto(Produto produto){
        repository.save(produto);
    }

    public void updateInfoProduto(Produto produto){
        repository.save(produto);
    }

    public void deleteProduto(Produto produto) {
        repository.delete(produto);
    }

}
