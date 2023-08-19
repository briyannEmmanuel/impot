package com.examen.dao;

import com.examen.model.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaiementRepository extends JpaRepository<Paiement,Long> {
}
