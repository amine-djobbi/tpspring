package tn.esprit.test.enums;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Beneficiaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer  idBenef;

    @Column
    private int cin;

    @Column
    private String nom;

    @Column
    private String prenom;

    @Column
    private String proffesion;

    @Column
    private float salaire;

    @OneToMany(mappedBy = "beneficiaire")
    private List<Assurance> assurances;
}
