package tn.esprit.test.services;

import tn.esprit.test.enums.Contrat;

public interface IContratService {


    public Contrat getContratBf(Integer idBf);

    public float getMontantBf(int cinBf);
}
