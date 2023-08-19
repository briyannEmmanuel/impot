package com.examen.model;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
public class Declaration {
    //Declaration
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateDeclaration;
    private double montantDeclaration;

    @ManyToOne
    @JoinColumn(name = "declarant_id")
    private Declarant declarantId;

    public Declaration() {
    }

    public Declaration(Long id, LocalDate dateDeclaration, double montantDeclaration, Declarant declarantId) {
        this.id = id;
        this.dateDeclaration = dateDeclaration;
        this.montantDeclaration = montantDeclaration;
        this.declarantId = declarantId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateDeclaration() {
        return dateDeclaration;
    }

    public void setDateDeclaration(LocalDate dateDeclaration) {
        this.dateDeclaration = dateDeclaration;
    }

    public double getMontantDeclaration() {
        return montantDeclaration;
    }

    public void setMontantDeclaration(double montantDeclaration) {
        this.montantDeclaration = montantDeclaration;
    }

    public Declarant getDeclarantId() {
        return declarantId;
    }

    public void setDeclarantId(Declarant declarantId) {
        this.declarantId = declarantId;
    }
}
