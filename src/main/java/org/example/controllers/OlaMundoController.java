package org.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OlaMundoController {

    @GetMapping(path = "/")
    public String saudar(){
        return "<h1>Olá mundo!</h1>";
    }

    @GetMapping(path = "/integrantes")
    public List<String> apresentarSala(){
        List<String> turma = new ArrayList<>();

        turma.add("Alicia");
        turma.add("Isabela");
        turma.add("Maria Eduarda");
        turma.add("Jaiany");
        turma.add("Raiani");
        turma.add("Samira");
        turma.add("Sandra");

        turma.add("Vinicius");
        turma.add("Maga");
        turma.add("Gabi");

        return turma;
    }
}
