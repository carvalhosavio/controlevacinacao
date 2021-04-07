package br.com.brasil.vacinacao.service;

import br.com.brasil.vacinacao.model.Vacinacao;
import br.com.brasil.vacinacao.repository.VacinacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author savio
 */
@Service
public class VacinacaoService {

    private final VacinacaoRepository repository;

    @Autowired
    public VacinacaoService(VacinacaoRepository repository){
        this.repository = repository;
    }

    public Vacinacao cadastro(Vacinacao vacinacao){
        return repository.save(vacinacao);
    }

}
