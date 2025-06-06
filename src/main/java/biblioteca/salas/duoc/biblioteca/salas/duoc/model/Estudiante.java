package biblioteca.salas.duoc.biblioteca.salas.duoc.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="estudiante")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_estudiante;

    @Column(nullable = false, length = 9)
    private String run;

    @Column(nullable = false, length = 100)
    private String nombres;

    @Column(length = 100)
    private String correo;

    @Column(nullable = false, length = 1)
    private Character jornada;

    @Column(length = 15)
    private Integer telefono;

    @ManyToOne
    @JoinColumn(name = "codigo_carrera", nullable = false)
    private Carrera carrera;
}


