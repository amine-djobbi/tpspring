package tn.esprit.test.services;

import jakarta.persistence.criteria.CriteriaBuilder;
import tn.esprit.test.enums.Assurance;

public interface IAssuranceService {

    Assurance addAssuranceAndAssignToContratAndBenef(Assurance assurance, Integer cinBenef);

}
