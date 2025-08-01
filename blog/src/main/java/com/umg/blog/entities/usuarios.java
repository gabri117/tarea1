package com.umg.blog.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreUsuario;
    private String correo;

    @OneToMany(mappedBy = "usuario")
    private List<Publicaciones> publicaciones;

    @OneToMany(mappedBy = "usuario")
    private List<Comentarios> comentarios;
}
