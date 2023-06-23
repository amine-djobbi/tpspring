package tn.esprit.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.test.enums.Contrat;

public interface ContratRepository extends JpaRepository<Contrat, Integer> {
}
