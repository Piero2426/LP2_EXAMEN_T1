package modelo;

import javax.persistence.*;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "tbl_especialidad")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class EspecialidadPieroRM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_especialidad")
    private int id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Override
    public String toString() {
        return titulo;
    }
}
