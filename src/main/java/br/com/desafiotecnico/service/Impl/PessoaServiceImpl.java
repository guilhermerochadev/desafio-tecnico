package br.com.desafiotecnico.service.Impl;

import br.com.desafiotecnico.domain.Pessoa;
import br.com.desafiotecnico.exception.DataIntegrityException;
import br.com.desafiotecnico.repository.PessoaRepository;
import br.com.desafiotecnico.service.PessoaService;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaServiceImpl implements PessoaService {

    @Autowired
    private PessoaRepository repo;


    @Override
    public Pessoa findId(Integer id) {
        Optional<Pessoa> pessoa = repo.findById(id);
        return pessoa.orElseThrow(() -> new ObjectNotFoundException(
                "Pessoa não encontrada! Id: " + id,  "Tipo: " + Pessoa.class.getName()));
    }

    @Override
    public List<Pessoa> findAll() {
        return repo.findAll();
    }

    @Override
    public Pessoa insert(Pessoa pessoa) {
        pessoa.setId(null);
        return repo.save(pessoa);
    }

    @Override
    public void delete(Integer id) {
        findId(id);
        try {
            repo.deleteById(id);
        }catch(DataIntegrityViolationException e){
            throw new DataIntegrityException("Não é possível excluir uma Pessoa");
        }
    }
}
