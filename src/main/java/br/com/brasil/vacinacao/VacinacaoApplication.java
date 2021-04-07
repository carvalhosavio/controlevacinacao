package br.com.brasil.vacinacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class VacinacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(VacinacaoApplication.class, args);
	}

}
