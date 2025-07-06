package br.com.bead.delivery.repository;
import br.com.bead.delivery.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public class ProdutoRepository {
    List<Produto> findByContaining(String nome);
    
}
