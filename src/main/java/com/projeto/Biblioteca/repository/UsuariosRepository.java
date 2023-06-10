package com.projeto.Biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projeto.Biblioteca.model.Usuarios;

@Repository
public interface  UsuariosRepository extends JpaRepository<Usuarios, Long>{
    
}
