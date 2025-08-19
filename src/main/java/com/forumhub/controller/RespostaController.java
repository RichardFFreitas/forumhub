package com.forumhub.controller;

import com.forumhub.controller.springdoc.InterfaceSpringDocResposta;
import com.forumhub.domain.resposta.*;
import com.forumhub.domain.resposta.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("respostas")
public class RespostaController implements InterfaceSpringDocResposta {

    @Autowired
    RespostaService respostaService;


    @PostMapping
    public ResponseEntity<DadosDetalheResposta> cadastrar(@RequestBody @Valid DadosCadastroResposta dadosCadastroResposta, UriComponentsBuilder uriBilder) {
        var resposta = respostaService.cadastrar(dadosCadastroResposta);

        var uri = uriBilder.path("/respostas/{id}").buildAndExpand(resposta.id()).toUri();

        return ResponseEntity.created(uri).body(resposta);

    }

    @GetMapping("/{id}")
    public ResponseEntity<DadosDetalheUriResposta> detalhar(@PathVariable Long id){
       var resposta = respostaService.detalhar(id);
       return ResponseEntity.ok(resposta);
    }

    @PutMapping
    public ResponseEntity<DadosDetalheResposta> atualizar(@RequestBody @Valid DadosAtualizarResposta dadosAtualizarResposta){

        var respostaAtualizada = respostaService.atualizar(dadosAtualizarResposta);

        return ResponseEntity.ok(respostaAtualizada);
    }

    @GetMapping
    public ResponseEntity<Page<DadosListaResposta>> listarTodos(@PageableDefault(size = 10, sort = "dataCriacao") Pageable pageable){
        var page =  respostaService.listarTodos(pageable);

        return ResponseEntity.ok(page);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity Deletar(@PathVariable Long id){

        respostaService.deletar(id);


        return ResponseEntity.noContent().build();
    }








}
