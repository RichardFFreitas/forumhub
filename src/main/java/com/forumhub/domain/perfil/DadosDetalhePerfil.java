package com.forumhub.domain.perfil;

public record DadosDetalhePerfil(Long id, PerfilEnum perfilEnum) {

    public DadosDetalhePerfil(Perfil perfil) {
   this(perfil.getId(), PerfilEnum.valueOf(String.valueOf(perfil.getPerfil())));


    }
}
