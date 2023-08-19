package com.examen.controller;

import com.examen.dao.DeclarantRepository;
import com.examen.dao.DeclarationRepository;
import com.examen.model.Declaration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DeclarationController {
    @Autowired
    private DeclarationRepository declarationRepository;
    @Autowired
    private DeclarantRepository declarantRepository;

    @GetMapping ("/declaration")
    public String listeDeclaration(Model model){
        List<Declaration> declarations= declarationRepository.findAll();
        model.addAttribute("declarations",declarations);

        //instanciation pour appeler la cle etrangere liant declaration a declarant
        model.addAttribute("declarants", new Declaration());
        model.addAttribute("listeDeclarants", declarantRepository.findAll());
        return "declaration";
    }

    @PostMapping("/addDeclaration")
    public String AjouterDeclaration(Declaration declaration){
        declarationRepository.save(declaration);
        return "redirect:/declaration";
    }

}
