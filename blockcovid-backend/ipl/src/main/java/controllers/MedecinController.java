package controllers;


import models.Medecin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import services.MedecinService;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MedecinController {

    @Resource
    private MedecinService medecinService;

    @GetMapping(value = "/medecins")
    public List<Medecin> getMedecins(){
        return medecinService.findAll();
    }
}
