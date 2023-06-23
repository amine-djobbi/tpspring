package tn.esprit.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.test.enums.Beneficiaire;
import tn.esprit.test.services.IBeneficiaireService;

@RestController
@RequestMapping("/beneficiaire")
public class BeneficiaireController {

    private final IBeneficiaireService beneficiaireService;

    @Autowired
    public BeneficiaireController(IBeneficiaireService beneficiaireService) {
        this.beneficiaireService = beneficiaireService;
    }

    @PostMapping("/add")
    public Integer ajouterBeneficiaire(@RequestBody Beneficiaire beneficiaire) {
        return beneficiaireService.ajouterBeneficiaire(beneficiaire);
    }


}
