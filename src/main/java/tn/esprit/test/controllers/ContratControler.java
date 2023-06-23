package tn.esprit.test.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.test.enums.Contrat;
import tn.esprit.test.services.IContratService;

@RestController
@RequestMapping("/contrats")
public class ContratControler {


    private final IContratService iContratService;

    @Autowired
    public ContratControler(IContratService iContratService) {
        this.iContratService = iContratService;
    }

    @GetMapping("/{idBf}")
    public Contrat getContratBf (@PathVariable Integer idBf){
        return iContratService.getContratBf(idBf);
    }

    @GetMapping("/montant/{idBf}")
        public float getMontantBf (@PathVariable Integer idBf){
        return iContratService.getMontantBf(idBf);
    }
}
