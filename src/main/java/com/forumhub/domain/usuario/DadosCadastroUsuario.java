package com.forumhub.domain.usuario;

import com.forumhub.domain.perfil.DadosPerfil;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record DadosCadastroUsuario(

        @NotBlank
        String nome,

        @NotBlank
        @Email
        String email,

        @NotBlank
        String senha,

        @NotNull
        List<DadosPerfil> perfis

) {
}
