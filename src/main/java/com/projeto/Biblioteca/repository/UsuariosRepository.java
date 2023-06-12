package com.projeto.Biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.Biblioteca.model.Usuarios;

public interface  UsuariosRepository extends JpaRepository<Usuarios, Long>{
    
}
