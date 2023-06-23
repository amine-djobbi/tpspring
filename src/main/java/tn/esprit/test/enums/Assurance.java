package tn.esprit.test.enums;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Assurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAssurance;

    @Column
    private String designation;

    @Column
    private float montant;

    @ManyToOne
    Contrat contrat;

    @ManyToOne
    Beneficiaire beneficiaire;
}
