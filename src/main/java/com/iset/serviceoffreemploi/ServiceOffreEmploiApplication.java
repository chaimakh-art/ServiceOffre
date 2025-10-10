package com.iset.serviceoffreemploi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.iset.serviceoffreemploi.dao.OffreRepository;
import com.iset.serviceoffreemploi.entities.Offre;

@SpringBootApplication
public class ServiceOffreEmploiApplication implements CommandLineRunner {

    @Autowired
    OffreRepository offreRepository;

    public static void main(String[] args) {
        SpringApplication.run(ServiceOffreEmploiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        offreRepository.save(new Offre("Web Design", "Informatique", "AXA", 2, "France"));
        offreRepository.save(new Offre("Developpeur", "Informatique", "Talys", 3, "Tunisie"));
        offreRepository.save(new Offre("Architecte", "Informatique", "SIS", 2, "Allemagne"));
    }
}