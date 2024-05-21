package br.com.welldias.frasesseriefilmes.service;

import br.com.welldias.frasesseriefilmes.dto.FraseDto;
import br.com.welldias.frasesseriefilmes.model.Frase;
import br.com.welldias.frasesseriefilmes.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repositorio;

    public FraseDto obterFraseAleatoria() {
        Frase frase = repositorio.buscarfraseAleatoria();
        return new FraseDto(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
