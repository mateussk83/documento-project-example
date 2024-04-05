package br.com.mateusgarcia.vagas_spring.modules.documento.controllers;

import br.com.mateusgarcia.vagas_spring.modules.documento.dto.DocumentoRequestDTO;
import br.com.mateusgarcia.vagas_spring.modules.documento.repository.DocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/documento")
public class
DocumentoController {

  @Autowired
  private DocumentoRepository documentoRepository;


  @GetMapping("/buscar/ano")
  public ResponseEntity<Object> getByAno(@Valid @RequestBody DocumentoRequestDTO documentoRequestDTO) {
    try {
      var result = this.documentoRepository.findAllByAno(documentoRequestDTO.getAno());
      return ResponseEntity.ok(result);
    }
    catch(Exception e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }
  }
};
