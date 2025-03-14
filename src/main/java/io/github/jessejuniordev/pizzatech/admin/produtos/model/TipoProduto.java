package io.github.jessejuniordev.pizzatech.admin.produtos.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_tipo_produto")
@Data
public class TipoProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(nullable = false)
    private UUID id;

    @Enumerated(EnumType.STRING)
    @Column(length = 100, nullable = false)
    private Produtos tipo;

    @OneToMany(mappedBy = "tipoProduto")
    private List<Produto> produtos;

}
