package com.examen.controller;

import com.examen.dao.DeclarantRepository;
import com.examen.model.Declarant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DeclarantController {
    @Autowired
    private DeclarantRepository declarantRepository;

    @GetMapping("/declarant")
    public String listeDeclarant(Model model){
        List<Declarant> declarants= declarantRepository.findAll();
        model.addAttribute("declarants",declarants);
        return "declarant";
    }

    @PostMapping("/addDeclarant")
    public String AjouterDeclarant(Declarant declarant){
        declarantRepository.save(declarant);
        return "redirect:/declarant";
    }
}
