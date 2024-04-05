package br.com.mateusgarcia.vagas_spring.modules.documento.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DocumentoRequestDTO {
    private String ano;
}
