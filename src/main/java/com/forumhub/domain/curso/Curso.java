package com.forumhub.domain.curso;

import com.forumhub.curso.DadosAtualizaCurso;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;

@Entity(name = "Curso")
@Table(name = "cursos")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(name = "categoria")
    @Enumerated(value = EnumType.STRING)
    CategoriaEnum categoriaEnum;




    public Curso(@Valid DadosCadastroCurso dadoscadastroCurso) {
        this.nome = dadoscadastroCurso.nome();
        this.categoriaEnum = dadoscadastroCurso.categoria();
    }

    public void atualizaDados(@Valid DadosAtualizaCurso dadosAtualizaCurso) {

        if(dadosAtualizaCurso.nome() != null)
    this.nome  = dadosAtualizaCurso.nome();

         if (dadosAtualizaCurso.categoriaEnum() !=  null)
    this.categoriaEnum  =  dadosAtualizaCurso.categoriaEnum();


    }
}
