package tn.esprit.test.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.test.enums.Assurance;
import tn.esprit.test.enums.Beneficiaire;
import tn.esprit.test.enums.Contrat;
import tn.esprit.test.enums.TypeContrat;
import tn.esprit.test.repository.BeneficiaireRepository;
import tn.esprit.test.repository.ContratRepository;

import java.time.LocalDate;
import java.util.Date;

@Service
public class ContratServiceImpl implements IContratService{

    private final ContratRepository contratRepository;

    private final BeneficiaireRepository beneficiaireRepository;

    @Autowired
    public ContratServiceImpl (ContratRepository contratRepository, BeneficiaireRepository beneficiaireRepository) {
        this.contratRepository = contratRepository;
        this.beneficiaireRepository = beneficiaireRepository;
    }



    @Override
    public Contrat getContratBf(Integer idBf) {
        Beneficiaire beneficiaire = beneficiaireRepository.findById(idBf).orElse(null);

        Contrat contrat = beneficiaire.getAssurances().iterator().next().getContrat();
        LocalDate oldDate = contrat.getDateEffet();
        for (Assurance a : beneficiaire.getAssurances()) {
            if (a.getContrat().getDateEffet().compareTo(oldDate) < 0) {
                contrat = a.getContrat();
            }
        }
        return contrat;
    }

    @Override
    public float getMontantBf(int cinBf) {
        Beneficiaire beneficiaire = beneficiaireRepository.findByCin(cinBf);
        float montantContrat = 0;
        for (Assurance a : beneficiaire.getAssurances()) {
            if (a.getContrat().getTypeContrat() == TypeContrat.MENSUEL) {
                montantContrat += a.getMontant() * 12;
            } else if (a.getContrat().getTypeContrat() == TypeContrat.SEMESTRIEL) {
                montantContrat += a.getMontant() * 2;
            } else {
                montantContrat += a.getMontant();
            }
        }
        return montantContrat ;
    }
}
