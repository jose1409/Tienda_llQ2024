package com.tienda.dao;

import com.tienda.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

//El objeto que estamos trabajando y el tipo de dato que es el Id
public interface CategoriaDao extends JpaRepository<Categoria, Long> {
    
}
