package com.iset.serviceoffreemploi.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.iset.serviceoffreemploi.dao.OffreRepository;
import com.iset.serviceoffreemploi.entities.Offre;

@RestController
@RequestMapping("/Offres")
public class RestOffres {

    @Autowired
    OffreRepository offreRepository;

    @GetMapping
    public List<Offre> getAll() {
        return offreRepository.findAll();
    }

    @GetMapping("/{uid}")
    public Offre getById(@PathVariable Long uid) {
        return offreRepository.findById(uid).orElse(null);
    }

    @PostMapping
    public Offre saveOffre(@RequestBody Offre newOffre) {
        return offreRepository.save(newOffre);
    }

    @DeleteMapping("/{id}")
    public void deleteOffre(@PathVariable Long id) {
        offreRepository.deleteById(id);
    }
}