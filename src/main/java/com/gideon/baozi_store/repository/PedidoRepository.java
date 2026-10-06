package com.gideon.baozi_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gideon.baozi_store.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {}