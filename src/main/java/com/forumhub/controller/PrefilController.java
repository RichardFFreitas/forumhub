package com.forumhub.controller;

import com.forumhub.controller.springdoc.InterfaceSpringDocPerfil;
import com.forumhub.domain.perfil.DadosDetalhePerfil;
import com.forumhub.domain.perfil.PerilSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("perfis")
public class PrefilController implements InterfaceSpringDocPerfil {

    @Autowired
    PerilSevice perfilSevice;

    @GetMapping
    public ResponseEntity<Page<DadosDetalhePerfil>> listarTodos(@PageableDefault(size = 3)Pageable pageable){

        var page = perfilSevice.listar(pageable);

        return ResponseEntity.ok(page);

    }

}
