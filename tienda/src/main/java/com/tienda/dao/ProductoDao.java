package com.tienda.dao;

import com.tienda.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

//El objeto que estamos trabajando y el tipo de dato que es el Id
public interface ProductoDao extends JpaRepository<Producto, Long> {
    
}
