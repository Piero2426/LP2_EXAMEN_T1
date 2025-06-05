package modelo;

import java.time.LocalDateTime;
import javax.persistence.*;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tbl_equipo_dental")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Equipo_DentalPieroRM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nro_equipo")
    private int nroEquipo;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "costo", nullable = false)
    private double costo;

    @Column(name = "fecha_adquisicion", nullable = false,
            columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fechaAdquisicion;

    @Column(name = "estado", nullable = false, length = 1)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_dentista", nullable = true)
    private DentistaPieroRM dentista;
}
