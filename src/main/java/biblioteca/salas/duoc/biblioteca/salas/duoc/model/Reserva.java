package biblioteca.salas.duoc.biblioteca.salas.duoc.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name ="reserva")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Date fechaSolicitada;

    @Column(nullable = false)
    private Date horaSolicitada;

    @Column
    private Date horaCierre;

    @Column(unique = false)
    private Integer estado;


}
