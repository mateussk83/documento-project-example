package br.com.mateusgarcia.vagas_spring.modules.documento.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;


@Entity(name = "documento")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DocumentoEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID codigo;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "data")
    private String createdAt;
}
