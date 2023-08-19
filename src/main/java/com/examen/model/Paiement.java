package com.examen.model;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
public class Paiement {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate datePaiement;
    private double montantPaiement;

    @ManyToOne
    @JoinColumn(name = "declaration_id")
    private Declaration declaration;

    public Paiement() {
    }

    public Paiement(Long id, LocalDate datePaiement, double montantPaiement, Declaration declaration) {
        this.id = id;
        this.datePaiement = datePaiement;
        this.montantPaiement = montantPaiement;
        this.declaration = declaration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(LocalDate datePaiement) {
        this.datePaiement = datePaiement;
    }

    public double getMontantPaiement() {
        return montantPaiement;
    }

    public void setMontantPaiement(double montantPaiement) {
        this.montantPaiement = montantPaiement;
    }

    public Declaration getDeclaration() {
        return declaration;
    }

    public void setDeclaration(Declaration declaration) {
        this.declaration = declaration;
    }
}
