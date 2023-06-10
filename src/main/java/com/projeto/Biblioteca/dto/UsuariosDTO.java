package com.projeto.Biblioteca.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuariosDTO {

    @NotBlank
    private String nome;
    @NotBlank
    private String telefone;
    @NotBlank
    private String email;


    
}
