package com.umg.blog.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Publicaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String contenido;
    private LocalDate fechaPublicacion;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuarios usuario;

    @OneToMany(mappedBy = "publicacion")
    private List<Comentarios> comentarios;
}
