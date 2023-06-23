package tn.esprit.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.test.enums.Assurance;

public interface AssuranceRepository extends JpaRepository<Assurance,Integer> {
}
