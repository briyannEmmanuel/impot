package com.examen.dao;


import com.examen.model.Declarant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeclarantRepository extends JpaRepository<Declarant,Long> {
}
