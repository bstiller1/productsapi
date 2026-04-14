package org.example.productsapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    private String description;

    @Column(nullable = false)
    private Double  price;

    @Column(nullable = false)
    private Integer quantity;

    public Product() {
    }
}
