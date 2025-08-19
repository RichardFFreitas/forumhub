package com.forumhub.domain.usuario;

import com.forumhub.domain.perfil.DadosDetalhePerfil;

import java.util.List;
import java.util.stream.Collectors;

public record DadosDetalheUsuario(

        Long id,

        String nome,


        String email,


        List<DadosDetalhePerfil> perfis,

        Boolean ativo

) {
    public DadosDetalheUsuario(Usuario usuario) {

        this(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getPerfis().stream().map(DadosDetalhePerfil::new).collect(Collectors.toList()),usuario.getAtivo());

    }


}
