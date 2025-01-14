package com.sebi.shops.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    @ManyToOne(cascade = CascadeType.ALL)//cand stergem un produs stergem si relatia dintre produs si categorie
    @JoinColumn(name = "category_id")
    private Category category;
    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL,orphanRemoval = true) // imaginile sunt legate de produs...cand stergem un produs stergem si imaginile si toate imaginile care n au corespondent(orphan) sunt sterse
    private List<Image> images; //mapped by se foloseste pentru a stabili relatia dintre product si imagine...se pune la entitatea OneToMany
}
