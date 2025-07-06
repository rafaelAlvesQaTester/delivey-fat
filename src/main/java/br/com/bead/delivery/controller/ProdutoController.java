package br.com.bead.delivery.controller;
import br.com.bead.delivery.model.Produto;
import br.com.bead.delivery.service.ProdutoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    private final ProdutoService service;

    public ProdutoController(ProdutoService service){
        this.service = service;

     }
    @GetMapping
    public Produto criar(@#RequestBody Produto produto){
        return service.salvar(produto);
    }
}
