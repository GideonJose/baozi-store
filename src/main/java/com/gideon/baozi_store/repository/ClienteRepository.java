package com.gideon.baozi_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gideon.baozi_store.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {}