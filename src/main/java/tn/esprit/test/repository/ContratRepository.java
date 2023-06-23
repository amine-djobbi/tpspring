package tn.esprit.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.test.enums.Contrat;

public interface ContratRepository extends JpaRepository<Contrat, Integer> {

}
