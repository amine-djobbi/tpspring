package tn.esprit.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.test.enums.Beneficiaire;

public interface BeneficiaireRepository extends JpaRepository<Beneficiaire, Integer> {

    Beneficiaire findByCin(int cin);
}
