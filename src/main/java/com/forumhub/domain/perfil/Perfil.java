package com.forumhub.domain.perfil;


import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Perfil")
@Table(name = "perfis")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString
public class Perfil  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private PerfilEnum perfil;

//    @ManyToMany(mappedBy = "perfis", fetch = FetchType.LAZY)
//    private List<Usuario> usuarios = new ArrayList<>();


    public Perfil(String perfil) {
        this.perfil = PerfilEnum.valueOf(perfil);
    }


}
