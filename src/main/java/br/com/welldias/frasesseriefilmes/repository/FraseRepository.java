package br.com.welldias.frasesseriefilmes.repository;

import br.com.welldias.frasesseriefilmes.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frase, Long> {
    @Query("SELECT f FROM frase f order by function('RADON') LIMIT 1")
    Frase buscarfraseAleatoria();
}
