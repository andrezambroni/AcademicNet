package br.com.az.academicnet.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Instant;

@AllArgsConstructor
@Data
public class Aluno {

    private Long matricula;
    private String nome;
    private String telefone;
    private String email;
    private Instant dataCadastro;


}
