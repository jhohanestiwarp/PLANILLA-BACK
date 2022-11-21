package formato.planilla.Modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Formato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    @Getter @Setter
    private Integer id;
    @Getter @Setter
    private String semana_correspondiente;
    @Getter @Setter
    private String fecha;
    @Getter @Setter
    private String dia_solicitado;
    @Getter @Setter
    private String cedula;
    @Getter @Setter
    private String hora_inicio;
    @Getter @Setter
    private String 	hora_fin;
}
