package tn.esprit.test.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.test.enums.Beneficiaire;
import tn.esprit.test.repository.BeneficiaireRepository;

@Service
    public class BeneficiaireServiceImpl implements IBeneficiaireService {


    private final BeneficiaireRepository beneficiaireRepository;

    @Autowired
    public BeneficiaireServiceImpl (BeneficiaireRepository beneficiaireRepository) {
        this.beneficiaireRepository = beneficiaireRepository;
    }

    @Override
    public Integer ajouterBeneficiaire(Beneficiaire beneficiaire) {
        beneficiaireRepository.save(beneficiaire);
        return beneficiaire.getIdBenef();
    }
}
