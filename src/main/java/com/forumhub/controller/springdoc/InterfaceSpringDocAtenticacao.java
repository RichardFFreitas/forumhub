package com.forumhub.controller.springdoc;

import com.forumhub.domain.usuario.DadosAutenticacao;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

@Tag(name = "Atenticação")
public interface InterfaceSpringDocAtenticacao {

@Operation(summary = "Efetua a autenticação do Usuário no FormHub.")
@ApiResponse(responseCode = "200", description = "Login realizado com sucesso.")
public ResponseEntity efetuarLogin (@RequestBody @Valid DadosAutenticacao usuario);



    }
