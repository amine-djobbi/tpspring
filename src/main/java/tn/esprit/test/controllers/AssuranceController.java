package tn.esprit.test.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.test.enums.Assurance;
import tn.esprit.test.services.IAssuranceService;

@RestController
@RequestMapping("/assurance")
public class AssuranceController {

    @Autowired
    IAssuranceService iAssuranceService;

    @PostMapping("/add/{cinBenef}")
    public Integer addAssuranceAndAsignToContratAndBnf(@RequestBody Assurance assurance,
                                                              @PathVariable("cinBenef") Integer cinBenef) {
        Assurance addedAssurance = iAssuranceService.addAssuranceAndAssignToContratAndBenef(assurance, cinBenef);
        return addedAssurance.getIdAssurance();
    }

}
