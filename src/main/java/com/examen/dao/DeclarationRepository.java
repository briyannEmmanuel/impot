package com.examen.dao;


import com.examen.model.Declaration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeclarationRepository extends JpaRepository<Declaration,Long> {
  /*  @Query("select dec from Declaration dec where dec.archive=false")
    List<Declaration> ListeNonArchive();*/

}
