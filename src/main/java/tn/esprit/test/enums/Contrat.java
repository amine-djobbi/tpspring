package tn.esprit.test.enums;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idContrat;

    @Column
    private String matricule;

    @Column
    private LocalDate dateEffet;

    @Enumerated(EnumType.STRING)
    private TypeContrat typeContrat;

}
