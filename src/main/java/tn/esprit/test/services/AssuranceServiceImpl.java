package tn.esprit.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.test.enums.Assurance;
import tn.esprit.test.enums.Beneficiaire;
import tn.esprit.test.enums.Contrat;
import tn.esprit.test.repository.AssuranceRepository;
import tn.esprit.test.repository.BeneficiaireRepository;
import tn.esprit.test.repository.ContratRepository;

@Service
public class AssuranceServiceImpl implements IAssuranceService {

    private final AssuranceRepository assuranceRepository;

    private final ContratRepository contratRepository;

    private final BeneficiaireRepository beneficiaireRepository;

    @Autowired
        public AssuranceServiceImpl (AssuranceRepository assuranceRepository, BeneficiaireRepository beneficiaireRepository,ContratRepository contratRepository) {
        this.assuranceRepository = assuranceRepository;
        this.beneficiaireRepository = beneficiaireRepository;
        this.contratRepository = contratRepository;
    }

    @Override
    public Assurance addAssuranceAndAssignToContratAndBenef(Assurance assurance, Integer cinBen) {
        Beneficiaire beneficiaire = beneficiaireRepository.findByCin(cinBen);



        if (beneficiaire != null) {
            Contrat contrat = assurance.getContrat();
            contratRepository.save(contrat);

            assurance.setBeneficiaire(beneficiaire);
            return assuranceRepository.save(assurance);
        }

        return null;
    }
}
