package com.examen.controller;

import com.examen.dao.DeclarationRepository;
import com.examen.dao.PaiementRepository;
import com.examen.model.Paiement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PaiementController {
    @Autowired
    private PaiementRepository paiementRepository;
    @Autowired
    private DeclarationRepository declarationRepository;

    @GetMapping("/paiement")
    public String listePaiement(Model model){
        List<Paiement> paiements= paiementRepository.findAll();
        model.addAttribute("paiements",paiements);

        //instanciation pour appeler la cle etrangere liant paiement a declaration
        model.addAttribute("declarations", new Paiement());
        model.addAttribute("listeDeclarations",declarationRepository.findAll());
        return "paiement";
    }

    @PostMapping("addPaiement")
    public String AjouterPaiement(Paiement paiement){
        paiementRepository.save(paiement);
        return "redirect:/paiement";
    }

    @GetMapping("/")
    public String PageAccueil(){

        return "index";
    }
}
