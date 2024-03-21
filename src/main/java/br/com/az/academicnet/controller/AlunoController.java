package br.com.az.academicnet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.az.academicnet.modelo.Aluno;

import java.time.Instant;

@RestController
@RequestMapping("/alunos")

public class AlunoController {

    @GetMapping
    public Aluno getInfo(){
        Aluno aluno = new Aluno(1L,"André","99999999","andrezambroni@gmail.com", Instant.now() );

        return aluno;
    }
}
