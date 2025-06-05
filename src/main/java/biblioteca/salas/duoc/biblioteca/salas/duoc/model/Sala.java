package biblioteca.salas.duoc.biblioteca.salas.duoc.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="Sala")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Sala {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo_sala;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column (nullable = true)
            private Integer capacidad;

    @Column (nullable = false)
    private  Integer id_instituto;

    @ManyToOne
    @JoinColumn(name ="id_tipo",nullable = false)
    private TipoSala tipoSala;


}


