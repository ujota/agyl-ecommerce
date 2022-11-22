package com.agyl.ecommerce.strore.https.repository;

import com.agyl.ecommerce.strore.https.model.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {
}
