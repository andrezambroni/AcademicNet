package br.com.az.academicnet.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Aluno {

    @Id

    private Long matricula;
    private String nome;
    private String telefone;
    private String email;
    private Instant dataCadastro;

}
