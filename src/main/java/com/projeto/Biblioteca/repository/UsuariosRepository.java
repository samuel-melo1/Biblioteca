package com.projeto.Biblioteca.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.Biblioteca.model.Usuarios;
import java.util.Optional;


public interface  UsuariosRepository extends JpaRepository<Usuarios, UUID>{
    
    Optional<Usuarios> findByEmailAndSenha(String email, String senha);

} 
