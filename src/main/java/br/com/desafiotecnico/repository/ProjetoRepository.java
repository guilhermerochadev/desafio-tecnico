package br.com.desafiotecnico.repository;

import br.com.desafiotecnico.domain.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Integer> {
    
}
