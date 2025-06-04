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
    private Integer id;

    @Column(nullable = false,unique = false, length = 9)
    private String run;

    @Column(nullable = false, length = 100)
    private String nombres;

    @Column(length = 100)
    private String correo;

    @Column(nullable = false)
    private char jornada;

    @Column
    private Integer telefono;

    @Column(unique = true, length = 100)
    private String codigoCarrera;

}
