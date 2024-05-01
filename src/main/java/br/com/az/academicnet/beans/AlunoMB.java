package br.com.az.academicnet.beans;

import br.com.az.academicnet.modelo.Aluno;
import br.com.az.academicnet.repositorio.AlunoRepositorio;
import jakarta.persistence.NamedQuery;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@NamedQuery(value = "alunoMB", name = "", query = "")
@ViewScoped
public class AlunoMB {

    @Getter
    @Setter
    private List<Aluno> alunos = new ArrayList<>();

    @Getter
    @Setter
    private Aluno aluno;

    @Autowired
    private AlunoRepositorio alunoRepositorio;

    @jakarta.annotation.PostConstruct
    public List<Aluno> listarTodos() {
        alunos = alunoRepositorio.findAll();
        return alunos;
    }

    public Integer getTamanhoDaLista() {
        return alunos.size();
    }

    public void setTamanhoDaLista(Integer size) {
        // Método criado para ser utilizado pelo primefaces
    }
}
