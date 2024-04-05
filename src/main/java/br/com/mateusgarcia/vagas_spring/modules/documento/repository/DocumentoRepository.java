package br.com.mateusgarcia.vagas_spring.modules.documento.repository;


import br.com.mateusgarcia.vagas_spring.modules.documento.entity.DocumentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface DocumentoRepository extends JpaRepository<DocumentoEntity, UUID> {


    List<DocumentoEntity> findAllByAno(String ano);
}
