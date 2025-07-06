package br.com.bead.delivery.service;
import br.com.bead.delivery.model.Produto;
import br.com.bead.delivery.repository.ProdutoRepository;

import org.springframework.stereotype.service;
import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository){
        this.repository = repository;
    }

    public List<Produto> listarTodos(){
        return repository.finAll();
    }

    public Produto salvar(Produto Produto){
        return repository.save(produto);
    }
}
