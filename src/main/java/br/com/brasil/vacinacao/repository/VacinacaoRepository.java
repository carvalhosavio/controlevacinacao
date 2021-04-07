package br.com.brasil.vacinacao.repository;

import br.com.brasil.vacinacao.model.Vacinacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author savio
 */
@Repository
public interface VacinacaoRepository extends JpaRepository<Vacinacao,Long> {
}
