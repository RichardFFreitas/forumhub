package com.forumhub.domain.resposta;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.forumhub.domain.topico.DadosDetalheTopico;
import com.forumhub.domain.usuario.DadosDetalheUsuario;

import java.time.LocalDateTime;

public record DadosDetalheResposta(
        Long id,

        String mensagem,

        DadosDetalheTopico topico,

        @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
        LocalDateTime dataCriacao,

        DadosDetalheUsuario autor,

        Boolean solucao
) {
    public DadosDetalheResposta(Resposta resposta) {

        this(resposta.getId(), resposta.getMensagem(), new DadosDetalheTopico(resposta.getTopico()), resposta.getDataCriacao(),
                new DadosDetalheUsuario(resposta.getAutor()), resposta.getSolucao());


    }
}
