package com.forumhub.curso;

import com.forumhub.domain.curso.CategoriaEnum;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizaCurso (
        @NotNull
        Long id,

        String nome,

        CategoriaEnum categoriaEnum

){
}
