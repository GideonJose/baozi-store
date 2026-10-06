package com.gideon.baozi_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gideon.baozi_store.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {}