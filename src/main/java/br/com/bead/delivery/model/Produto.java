package br.com.bead.delivery.model;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Produto {
    @Id
    @GeneratedValeu(strategy = GenerationTipe.IDENTITY);
    private Long id;
    private String nome;
    private Double preco;


}
