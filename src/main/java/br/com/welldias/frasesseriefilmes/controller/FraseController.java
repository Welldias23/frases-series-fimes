package br.com.welldias.frasesseriefilmes.controller;

import br.com.welldias.frasesseriefilmes.dto.FraseDto;
import br.com.welldias.frasesseriefilmes.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {
    @Autowired
    private FraseService servico;

    @GetMapping("/series/frases")
    public FraseDto obterFraseAleatoria() {
        return servico.obterFraseAleatoria();
    }
}
