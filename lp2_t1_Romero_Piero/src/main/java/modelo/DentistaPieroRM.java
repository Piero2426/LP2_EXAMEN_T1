package modelo;

import java.time.LocalDate;
import javax.persistence.*;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tbl_dentista")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class DentistaPieroRM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dentista")
    private int id;

    @Column(name = "cop", nullable = false, length = 6)
    private String cop;

    @Column(name = "nombre_completo", nullable = false)
    private String nombreCompleto;

    @Column(name = "fecha_inicio_contrato", nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "turno", nullable = false, length = 1)
    private String turno;

    @Column(name = "correo", nullable = false, unique = true)
    private String correo;

    @ManyToOne
    @JoinColumn(name = "id_especialidad", nullable = false)
    private EspecialidadPieroRM especialidad;

    @Override
    public String toString() {
        return nombreCompleto;
    }
}
