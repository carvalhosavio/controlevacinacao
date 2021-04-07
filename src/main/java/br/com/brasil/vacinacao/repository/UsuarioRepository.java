package br.com.brasil.vacinacao.repository;

import br.com.brasil.vacinacao.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

/**
 * @author savio
 */

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
   Optional<Usuario> findByCpf(String cpf);
   Optional<Usuario> findByEmail(String email);
}
